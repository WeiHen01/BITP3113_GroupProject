package Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import Database.MyDatabase;
//import Model.Medicine;
//import Model.Nurse;
import Model.Patient;

public class PatientController {

	public int insertUser(Patient patient) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into patient (patient_id, patient_name, patient_nophone, patient_email, patient_address, patient_username, patient_password, Status, age, gender) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = (PreparedStatement)
		conn.prepareStatement(sql);
		preparedStatement.setInt(1, patient.getPatient_id());
		preparedStatement.setString(2, patient.getPatient_name());
		preparedStatement.setString(3, patient.getPatient_nophone());
		preparedStatement.setString(4, patient.getPatient_email());
		preparedStatement.setString(5, patient.getPatient_address());
		preparedStatement.setString(6, patient.getPatient_username());
		preparedStatement.setString(7, patient.getPatient_password());
		preparedStatement.setString(8, patient.getPatient_status());
		preparedStatement.setInt(9, patient.getPatient_age());
		preparedStatement.setString(10, patient.getPatient_gender());
		
		int success = preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	public String doLogin(Patient patient) throws ClassNotFoundException, SQLException
	{
		String ROLE ="-1";
		
		//sql statement
		String sql = "select patient_id, patient_password from patient where patient_id = ? and patient_password = ? and Status = 'Active'";
		
		//1. Create connection
		Connection conn = MyDatabase.doConnection();
		//2. prepare the statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, patient.getPatient_id());
		preparedStatement.setString(2, patient.getPatient_password());
		
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
	
	
	public Patient showProfile(Patient patient)throws ClassNotFoundException, SQLException
	{
		
		//sql statement
		String sql = "select patient_id, patient_name, patient_nophone, patient_email, patient_address, patient_username, age, gender from patient where patient_id = ? ";
		
		//1. Create connection
		Connection conn = MyDatabase.doConnection();
		//2. prepare the statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, patient.getPatient_id());
	
		//3. Execute the query
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			   Patient patient1 = new Patient();
			   patient1.setPatient_id(resultSet.getInt(1));
			   patient1.setPatient_name(resultSet.getString(2));
			   patient1.setPatient_nophone(resultSet.getString(3));
			   patient1.setPatient_email(resultSet.getString(4));
			   patient1.setPatient_address(resultSet.getString(5));
			   patient1.setPatient_username(resultSet.getString(6));
			   patient1.setPatient_age(resultSet.getInt(7));
			   patient1.setPatient_gender(resultSet.getString(8));
				 
			   return patient1;
		}
		
		//4. close the connection (MUST)
		conn.close();
		
		return patient;
		
	}
	
	
	public Patient SearchPatientByID(Patient patient) throws ClassNotFoundException, SQLException 
	{ 
	  Patient patient1 = null; 
	  
	  String sql ="select patient_id, patient_name, patient_nophone, patient_email, patient_address, age, gender, patient_username, patient_password from patient where patient_id = ? and Status = 'Active'";
  
	  Connection conn = MyDatabase.doConnection();
	  
	  
	  PreparedStatement preparedStatement = conn.prepareStatement(sql);
	  preparedStatement.setInt(1, patient.getPatient_id()); 
	  
	  ResultSet resultSet = preparedStatement.executeQuery(); 
		  if(resultSet.next()) { 
			  patient1 = new Patient(); 
			  patient1.setPatient_id(resultSet.getInt(1));
			  patient1.setPatient_name(resultSet.getString(2));
			  patient1.setPatient_nophone(resultSet.getString(3));
			  patient1.setPatient_email(resultSet.getString(4));
			  patient1.setPatient_address(resultSet.getString(5));
			  patient1.setPatient_age(resultSet.getInt(6));
			  patient1.setPatient_gender(resultSet.getString(7));
			  patient1.setPatient_username(resultSet.getString(8));
			  patient1.setPatient_password(resultSet.getString(9));

		  }
	  
	  //4. close the connection (MUST) 
		  conn.close();
	  return patient1; 
	 }
	
	
	public int DeletePatient(Patient patient) throws ClassNotFoundException, SQLException
	  {
	  			int success=-1;
	  			
	  			String sql ="update patient set Status = 'Inactive' where patient_id = ?";
	  			
	  			Connection conn=MyDatabase.doConnection();

	  			PreparedStatement preparedStatement=conn.prepareStatement(sql);
	  			
	  			preparedStatement.setInt(1, patient.getPatient_id());
	  			
	  				
	  			    success=preparedStatement.executeUpdate();
	  			
	  			conn.close();
	  			return success;
	  }
	
	public int UpdatePatient(Patient patient) throws ClassNotFoundException, SQLException
	{
		int success=-1;
		
		String sql="update patient set patient_name = ?, patient_nophone = ?, patient_email = ?, patient_address = ?, age = ?, gender = ? where patient_id = ?";
		
		Connection conn=MyDatabase.doConnection();

		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		
		preparedStatement.setString(1, patient.getPatient_name());
		preparedStatement.setString(2, patient.getPatient_nophone());
		preparedStatement.setString(3, patient.getPatient_email());
		preparedStatement.setString(4, patient.getPatient_address());
		preparedStatement.setInt(5, patient.getPatient_age());
		preparedStatement.setString(6, patient.getPatient_gender());
		preparedStatement.setInt(7, patient.getPatient_id());
		
			
		success=preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	public ArrayList<Patient> viewPatient() throws ClassNotFoundException, SQLException
	{
		ArrayList<Patient> patient = new ArrayList<Patient>();
		String sql="Select patient_id, patient_name, patient_nophone, patient_email, patient_address, patient_username, age, gender from patient where Status = 'Active'";
		
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{

			Patient patient1 = new Patient();
			patient1.setPatient_id(resultSet.getInt(1));
			patient1.setPatient_name(resultSet.getString(2));
			patient1.setPatient_nophone(resultSet.getString(3));
			patient1.setPatient_email(resultSet.getString(4));
			patient1.setPatient_address(resultSet.getString(5));
			patient1.setPatient_username(resultSet.getString(6));
			patient1.setPatient_age(resultSet.getInt(7));
			patient1.setPatient_gender(resultSet.getString(8));

			patient.add(patient1);
			
		}
		conn.close();
		
		return patient;
		
	}
	
	public ArrayList<Patient> getPatientGender() throws ClassNotFoundException, SQLException
	{
		ArrayList<Patient> patient1=new ArrayList<Patient>();
		
		String sql="SELECT SUM(case when gender = 'M' then 1 else 0 end), SUM(case when gender = 'F' then 1 else 0 end) FROM patient where Status = 'Active'";
		
		Connection conn = MyDatabase.doConnection();
		
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			Patient patients = new Patient();
			patients.setSumGenderM(resultSet.getInt(1));
			patients.setSumGenderF(resultSet.getInt(2));
			patient1.add(patients);		
		
		}
		
		
		
		conn.close();
		return patient1;
	}
	
	


}
