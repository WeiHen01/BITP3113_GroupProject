package Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Database.MyDatabase;
import Model.Doctor;
import Model.Nurse;
import Model.Payment;
import Model.Treatment;
public class NurseController {
	
	//insert/register
	public int insertUser(Nurse nurse) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into nurse (nurse_id, nurse_name, nurse_nophone, nurse_email, nurse_address, nurse_username, nurse_password, doctor_id, Status) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = (PreparedStatement)
		conn.prepareStatement(sql);
		preparedStatement.setInt(1, nurse.getNurse_id());
		preparedStatement.setString(2, nurse.getNurse_name());
		preparedStatement.setString(3, nurse.getNurse_nophone());
		preparedStatement.setString(4, nurse.getNurse_email());
		preparedStatement.setString(5, nurse.getNurse_address());
		preparedStatement.setString(6, nurse.getNurse_username());
		preparedStatement.setString(7, nurse.getNurse_password());
		preparedStatement.setInt(8, nurse.getDoctor().getDoctor_id());
		preparedStatement.setString(9, nurse.getNurse_status());
		int success = preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	//login
	public String doLogin(Nurse nurse) throws ClassNotFoundException, SQLException
	{
		String ROLE ="-1";
		
		//sql statement
		String sql = "select nurse_id, nurse_password from nurse where nurse_id = ? and nurse_password = ? and Status = 'Active'";
		
		//1. Create connection
		Connection conn = MyDatabase.doConnection();
		//2. prepare the statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, nurse.getNurse_id());
		preparedStatement.setString(2, nurse.getNurse_password());
		
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

	public Nurse showProfile(Nurse nurse)throws ClassNotFoundException, SQLException
	{
		
		//sql statement
		String sql = "select nurse_id, nurse_name, nurse_nophone, nurse_email, nurse_address, nurse_username from nurse where nurse_id = ? AND Status = 'Active'";
		
		//1. Create connection
		Connection conn = MyDatabase.doConnection();
		//2. prepare the statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, nurse.getNurse_id());
		//3. Execute the query
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			   Nurse nurse2 = new Nurse();
			   nurse2.setNurse_id(resultSet.getInt(1));
			   nurse2.setNurse_name(resultSet.getString(2));
			   nurse2.setNurse_nophone(resultSet.getString(3));
			   nurse2.setNurse_email(resultSet.getString(4));
			   nurse2.setNurse_address(resultSet.getString(5));
			   nurse2.setNurse_username(resultSet.getString(6));
				 
			   return nurse2;
		}
		
		
		
		//4. close the connection (MUST)
		conn.close();
		
		return nurse;
		
	}
	
	
	
	//searching function
	public Nurse SearchNurseByID(Nurse nurse) throws ClassNotFoundException, SQLException
	{
		Nurse nurse1 = null;
		Doctor doctors = new Doctor();
		String sql = "select nurse_id, nurse_name, nurse_nophone, nurse_email, nurse_address, nurse_username, nurse_password, doctor_id from nurse where nurse_id = ? And Status = 'Active'";
		
		Connection conn = MyDatabase.doConnection();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, nurse.getNurse_id());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			   nurse1 = new Nurse();
			   nurse1.setNurse_id(resultSet.getInt(1));
			   nurse1.setNurse_name(resultSet.getString(2));
			   nurse1.setNurse_nophone(resultSet.getString(3));
			   nurse1.setNurse_email(resultSet.getString(4));
			   nurse1.setNurse_address(resultSet.getString(5));
			   nurse1.setNurse_username(resultSet.getString(6));
			   nurse1.setNurse_password(resultSet.getString(7));
			   doctors.setDoctor_id(resultSet.getInt(8));
			   nurse1.setDoctor(doctors);
		}
		
		//4. close the connection (MUST)
		conn.close();
		
		return nurse1;
	}
	
	
	public Nurse SearchNurse(Nurse nurse) throws ClassNotFoundException, SQLException
	{
		Nurse nurse1 = null;
		Doctor doctors = new Doctor();
		String sql = "select nurse_id, nurse_name, nurse_nophone, nurse_email, nurse_address, nurse_username, nurse_password, doctor_id from nurse where nurse_id = ? And Status = 'Active'";
		
		Connection conn = MyDatabase.doConnection();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, nurse.getNurse_id());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			   nurse1 = new Nurse();
			   nurse1.setNurse_id(resultSet.getInt(1));
			   nurse1.setNurse_name(resultSet.getString(2));
			   nurse1.setNurse_nophone(resultSet.getString(3));
			   nurse1.setNurse_email(resultSet.getString(4));
			   nurse1.setNurse_address(resultSet.getString(5));
			   nurse1.setNurse_username(resultSet.getString(6));
			   nurse1.setNurse_password(resultSet.getString(7));
			   doctors.setDoctor_id(resultSet.getInt(8));
			   nurse1.setDoctor(doctors);

		}
		
		//4. close the connection (MUST)
		conn.close();
		
		return nurse1;
	}
	
	public int DeleteNurse(Nurse nurse) throws ClassNotFoundException, SQLException
	{
		int success=-1;
		
		String sql="update nurse set Status = 'Inactive' where nurse_id=?";
		
		Connection conn=MyDatabase.doConnection();
		
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		
		preparedStatement.setInt(1, nurse.getNurse_id());
		
		success=preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	
	public int UpdateNurse(Nurse nurse) throws ClassNotFoundException, SQLException
	{
		int success=-1;
		
		String sql="update nurse set nurse_name = ?, nurse_nophone = ?, nurse_email = ?, nurse_address = ?, nurse_username = ?, nurse_password = ? where nurse_id = ?";
		
		Connection conn=MyDatabase.doConnection();

		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		preparedStatement.setString(1, nurse.getNurse_name());
		preparedStatement.setString(2, nurse.getNurse_nophone());
		preparedStatement.setString(3, nurse.getNurse_email());
		preparedStatement.setString(4, nurse.getNurse_address());
		preparedStatement.setString(5, nurse.getNurse_username());
		preparedStatement.setString(6, nurse.getNurse_password());
		preparedStatement.setInt(7, nurse.getNurse_id());
			
			
		success=preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	public ArrayList<Nurse> viewNurse() throws ClassNotFoundException, SQLException
	{
		ArrayList<Nurse> nurse = new ArrayList<Nurse>();
		String sql="Select nurse_id, nurse_name, nurse_nophone, nurse_email, nurse_address, nurse_username from nurse where Status = 'Active'";
		
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{

			Nurse nurse1 = new Nurse();
			nurse1.setNurse_id(resultSet.getInt(1));
			nurse1.setNurse_name(resultSet.getString(2));
			nurse1.setNurse_nophone(resultSet.getString(3));
			nurse1.setNurse_email(resultSet.getString(4));
			nurse1.setNurse_address(resultSet.getString(5));
			nurse1.setNurse_username(resultSet.getString(6));
			
			nurse.add(nurse1);
			
		}
		conn.close();
		
		return nurse;
		
	}
	
	
	
}
