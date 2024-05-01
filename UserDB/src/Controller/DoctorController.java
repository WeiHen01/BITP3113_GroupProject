package Controller;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import Database.MyDatabase;
import Model.Doctor;

public class DoctorController{
	
	public int insertUser(Doctor doctor) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into doctor (doctor_id, doctor_name, doctor_nophone, doctor_email, doctor_address, doctor_username, doctor_password, Status) values (?, ?, ?, ?, ?, ?, ?,?)";
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = (PreparedStatement)
		conn.prepareStatement(sql);
		preparedStatement.setInt(1, doctor.getDoctor_id());
		preparedStatement.setString(2, doctor.getDoctor_name());
		preparedStatement.setString(3, doctor.getDoctor_nophone());
		preparedStatement.setString(4, doctor.getDoctor_email());
		preparedStatement.setString(5, doctor.getDoctor_address());
		preparedStatement.setString(6, doctor.getDoctor_username());
		preparedStatement.setString(7, doctor.getDoctor_password());
		preparedStatement.setString(8, doctor.getDoctor_status());
		int success = preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	public String doLogin(Doctor doctor) throws ClassNotFoundException, SQLException
	{
		String ROLE ="-1";
		
		//sql statement
		String sql = "select doctor_id, doctor_password from doctor where doctor_id = ? and doctor_password = ? and Status = 'Active'";
		
		//1. Create connection
		Connection conn = MyDatabase.doConnection();
		//2. prepare the statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, doctor.getDoctor_id());
		preparedStatement.setString(2, doctor.getDoctor_password());
		
		//3. Execute the query
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			ROLE = resultSet.getString(1);
		}
		
		//4. close connection (MUST)
		conn.close();
		return ROLE;
	}

	public Doctor showProfile(Doctor doctor)throws ClassNotFoundException, SQLException
	{
		
		//sql statement
		String sql = "select doctor_id, doctor_name, doctor_nophone, doctor_email, doctor_address, doctor_username from doctor where doctor_id = ?";
		
		//1. Create connection
		Connection conn = MyDatabase.doConnection();
		//2. prepare the statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, doctor.getDoctor_id());
	
		//3. Execute the query
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			   Doctor doctor1 = new Doctor(0);	
			   doctor1.setDoctor_id(resultSet.getInt(1));
			   doctor1.setDoctor_name(resultSet.getString(2));
			   doctor1.setDoctor_nophone(resultSet.getString(3));
			   doctor1.setDoctor_email(resultSet.getString(4));
			   doctor1.setDoctor_address(resultSet.getString(5));
			   doctor1.setDoctor_username(resultSet.getString(6));
				 
			   return doctor1;
		}
		
		//4. close the connection (MUST)
		conn.close();
		
		return doctor;
		
	}

}



