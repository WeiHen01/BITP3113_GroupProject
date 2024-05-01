package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.MyDatabase;
import Model.Nurse;
import Model.Patient;
import Model.Medicine;

public class MedicineController {

		public Medicine SearchMedicine(Medicine medics) throws ClassNotFoundException, SQLException
		{
			Medicine medic = null;
			Nurse nurse1 = new Nurse();
			String sql = "select medicine_id, medicine_name, medicine_type, medicine_cost, medicine_company, nurse_id from medicine where medicine_id = ? and Status = 'Available'";
			
			Connection conn = MyDatabase.doConnection();
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, medics.getMedicine_id());
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				   medic = new Medicine();
				   medic.setMedicine_id(resultSet.getInt(1));
				   medic.setMedicine_name(resultSet.getString(2));
				   medic.setMedicine_type(resultSet.getString(3));
				   medic.setMedicine_cost(resultSet.getDouble(4));
				   medic.setMedicine_company(resultSet.getString(5));
				   nurse1.setNurse_id(resultSet.getInt(6));
				   medic.setNurse(nurse1);
			}
			
			//4. close the connection (MUST)
			conn.close();
			
			return medic;
		}
		
		public int getLatestId() throws ClassNotFoundException, SQLException
		{
			ArrayList<Patient> patient = new ArrayList<Patient>();
			String sql="Select COUNT(*) From payment";
			
			Connection conn = MyDatabase.doConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			int totalRecords = 0;
		    if(resultSet.next()) {
		        totalRecords = resultSet.getInt(1);
		    }
		    
		    conn.close();
		    
		    return totalRecords;
		}
		
		public int AddMedicine(Medicine medicine) throws ClassNotFoundException, SQLException
		{
			String sql = "insert into medicine (medicine_id, medicine_name, medicine_type, medicine_company, medicine_cost, nurse_id, Status) values (?, ?, ?, ?, ?, ?, ?)";
			Connection conn = MyDatabase.doConnection();
			PreparedStatement preparedStatement = (PreparedStatement)
			conn.prepareStatement(sql);
			preparedStatement.setInt(1, medicine.getMedicine_id());
			preparedStatement.setString(2, medicine.getMedicine_name());
			preparedStatement.setString(3, medicine.getMedicine_type());
			preparedStatement.setString(4, medicine.getMedicine_company());
			preparedStatement.setDouble(5, medicine.getMedicine_cost());
			preparedStatement.setInt(6, medicine.getNurse().getNurse_id());
			preparedStatement.setString(7, medicine.getMedicine_status());
			int success = preparedStatement.executeUpdate();
			
			conn.close();
			return success;
		}
		
		public Medicine SearchMedicineByID(Medicine medicine) throws ClassNotFoundException, SQLException { 
		  Medicine medicine1 = null; 
		  String sql ="select medicine_id, medicine_name, medicine_type, medicine_company, medicine_cost, nurse_id from medicine where medicine_id = ? and Status = 'Available'";
	  
		  Connection conn = MyDatabase.doConnection();
		  
		  PreparedStatement preparedStatement = conn.prepareStatement(sql);
		  preparedStatement.setInt(1, medicine.getMedicine_id()); 
		  
		  ResultSet resultSet = preparedStatement.executeQuery(); 
			  if(resultSet.next()) { 
				  medicine1 = new Medicine(); 
				  medicine1.setMedicine_id(resultSet.getInt(1));
				  medicine1.setMedicine_name(resultSet.getString(2));
				  medicine1.setMedicine_type(resultSet.getString(3));
				  medicine1.setMedicine_company(resultSet.getString(4));
				  medicine1.setMedicine_cost(resultSet.getDouble(5));
			  }
		  
		  //4. close the connection (MUST) 
			  conn.close();
		  return medicine1; 
		 }
		
		
		public int DeleteMedicine(Medicine medicine) throws ClassNotFoundException, SQLException
		  {
		  			int success=-1;
		  			
		  			String sql ="update medicine set Status = 'Unavailable' where medicine_id = ?";
		  			
		  			Connection conn=MyDatabase.doConnection();

		  			PreparedStatement preparedStatement=conn.prepareStatement(sql);
		  			
		  			preparedStatement.setInt(1, medicine.getMedicine_id());
		  			
		  				
		  			    success=preparedStatement.executeUpdate();
		  			
		  			conn.close();
		  			return success;
		  }

			public int UpdateMedicine(Medicine medicine) throws ClassNotFoundException, SQLException
			{
				int success=-1;
				
				String sql="update medicine set medicine_name = ?, medicine_type = ?, medicine_company = ?, medicine_cost = ? where medicine_id = ?";
				
				Connection conn=MyDatabase.doConnection();

				PreparedStatement preparedStatement=conn.prepareStatement(sql);
				
				preparedStatement.setString(1, medicine.getMedicine_name());
				preparedStatement.setString(2, medicine.getMedicine_type());
				preparedStatement.setString(3, medicine.getMedicine_company());
				preparedStatement.setDouble(4, medicine.getMedicine_cost());
				preparedStatement.setInt(5, medicine.getMedicine_id());
				
					
				success=preparedStatement.executeUpdate();
				
				conn.close();
				return success;
			}
			
			
			public ArrayList<Medicine> getMedicine() throws ClassNotFoundException, SQLException
			{
				ArrayList<Medicine> medic1=new ArrayList<Medicine>();
				
				String sql="select medicine_id, medicine_name, sum(medicine_cost) from medicine group by medicine_id";
				
				Connection conn=MyDatabase.doConnection();
				
				PreparedStatement preparedStatement=conn.prepareStatement(sql);
				
				ResultSet resultSet=preparedStatement.executeQuery();
				
				while(resultSet.next())
				{
					Medicine medics = new Medicine();
					medics.setMedicine_id(resultSet.getInt(1));
					medics.setMedicine_name(resultSet.getString(2));
					medics.setMedicine_cost(resultSet.getDouble(3));
					
					medic1.add(medics);		
				
				}
				conn.close();
				return medic1;
			}
		
		
}
	
