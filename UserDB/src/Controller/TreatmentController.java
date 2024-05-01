package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.MyDatabase;
import Model.Payment;
import Model.Treatment;

public class TreatmentController {

	//searching function
		public Treatment SearchTreatment(Treatment treats) throws ClassNotFoundException, SQLException
		{
			Treatment treat1 = null;
			Payment pays = new Payment();
			int number;
			String sql = "select treatment_id, treatment_name, treatment_type, treatment_description, treatment_date, treatment_price, payment_id from treatment where treatment_id = ?";
			
			Connection conn = MyDatabase.doConnection();
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, treats.getTreatment_id());
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				   treat1 = new Treatment();
				   treat1.setTreatment_id(resultSet.getInt(1));
				   treat1.setTreatment_name(resultSet.getString(2));
				   treat1.setTreatment_type(resultSet.getString(3));
				   treat1.setTreatment_description(resultSet.getString(4));
				   treat1.setTreatment_date(resultSet.getString(5));
				   treat1.setTreatment_price(resultSet.getDouble(6));
				   pays.setPayment_id(resultSet.getInt(7)); 
				   treat1.setPayment(pays);
					 

			}
			
			//4. close the connection (MUST)
			conn.close();
			
			return treat1;
		}
		
		public ArrayList<Treatment> getTreatment() throws ClassNotFoundException, SQLException
		{
			ArrayList<Treatment> treat1=new ArrayList<Treatment>();
			
			String sql="select treatment_id, treatment_name, sum(treatment_price) from treatment group by treatment_id";
			
			Connection conn=MyDatabase.doConnection();
			
			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				Treatment treats=new Treatment();
				treats.setTreatment_id(resultSet.getInt(1));
				treats.setTreatment_name(resultSet.getString(2));
				treats.setTreatment_price(resultSet.getFloat(3));
				
				treat1.add(treats);		
			
			}
			conn.close();
			return treat1;
		}
		
		public int UpdateTreatment(Treatment treatment) throws ClassNotFoundException, SQLException
		{
			int success=-1;
			
			String sql="update treatment set treatment_name = ?, treatment_type = ?, treatment_description = ?, treatment_price = ?, treatment_date = ? where treatment_id = ?";
			
			Connection conn=MyDatabase.doConnection();

			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			
			preparedStatement.setString(1, treatment.getTreatment_name());
			preparedStatement.setString(2, treatment.getTreatment_type());
			preparedStatement.setString(3, treatment.getTreatment_description());
			preparedStatement.setDouble(4, treatment.getTreatment_price());
			preparedStatement.setInt(6, treatment.getTreatment_id());
			preparedStatement.setString(5, treatment.getTreatment_date());
			
				
			success=preparedStatement.executeUpdate();
			
			conn.close();
			return success;
		}
		
		
		public int DeleteTreatment(Treatment treatment) throws ClassNotFoundException, SQLException
		{
			int success=-1;
  			
  			String sql ="update treatment set Status = 'Unavailable' where treatment_id = ?";
  			
  			Connection conn=MyDatabase.doConnection();

  			PreparedStatement preparedStatement=conn.prepareStatement(sql);
  			
  			preparedStatement.setInt(1, treatment.getTreatment_id());
  			
  				
  			success=preparedStatement.executeUpdate();
  			
  			conn.close();
  			return success;
		}
		
		public int AddTreatment(Treatment treatment) throws ClassNotFoundException, SQLException
		{
			String sql = "insert into treatment (treatment_id, treatment_name, treatment_type, treatment_description, treatment_date, treatment_price, payment_id, Status) values (?, ?, ?, ?, ?, ?, ?, ?)";
			Connection conn = MyDatabase.doConnection();
			PreparedStatement preparedStatement = (PreparedStatement)
			conn.prepareStatement(sql);
			preparedStatement.setInt(1, treatment.getTreatment_id());
			preparedStatement.setString(2, treatment.getTreatment_name());
			preparedStatement.setString(3, treatment.getTreatment_type());
			preparedStatement.setString(4, treatment.getTreatment_description());
			preparedStatement.setString(5, treatment.getTreatment_date());
			preparedStatement.setDouble(6, treatment.getTreatment_price());
			preparedStatement.setInt(7, treatment.getPayment().getPayment_id());
			preparedStatement.setString(8, treatment.getTreatment_status());
			
			int success = preparedStatement.executeUpdate();
			
			conn.close();
			return success;
		}
		
		
		public Treatment SearchTreatmentByID(Treatment treats) throws ClassNotFoundException, SQLException
		{
			Treatment treat1 = null;
			String sql = "select treatment_id, treatment_name, treatment_type, treatment_price, treatment_description from treatment where treatment_id = ?";
			
			Connection conn = MyDatabase.doConnection();
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, treats.getTreatment_id());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				   treat1 = new Treatment();
				   treat1.setTreatment_id(resultSet.getInt(1));
				   treat1.setTreatment_name(resultSet.getString(2));
				   treat1.setTreatment_type(resultSet.getString(3));
				   treat1.setTreatment_price(resultSet.getDouble(4));
				   treat1.setTreatment_description(resultSet.getString(5));

			}
			
			//4. close the connection (MUST)
			conn.close();
			
			return treat1;
		}
		
		public ArrayList<Treatment> viewTreatment() throws ClassNotFoundException, SQLException
		{
			ArrayList<Treatment> treat1=new ArrayList<Treatment>();
			
			String sql="select treatment_id, treatment_name, treatment_type, treatment_price, treatment_description from treatment group by treatment_id";
			
			Connection conn=MyDatabase.doConnection();
			
			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				Treatment treats=new Treatment();
				treats.setTreatment_id(resultSet.getInt(1));
				treats.setTreatment_name(resultSet.getString(2));
				treats.setTreatment_type(resultSet.getString(3));
				treats.setTreatment_price(resultSet.getDouble(4));
				treats.setTreatment_description(resultSet.getString(5));
				
				treat1.add(treats);		
			
			}
			conn.close();
			return treat1;
		}
		
		
}
