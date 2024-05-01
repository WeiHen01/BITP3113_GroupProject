package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import Database.MyDatabase;
import Model.Patient;
import Model.Payment;

public class PaymentController {

	public int insertPayment(Payment payment) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into payment(payment_id, payment_type, payment_description, payment_amount, payment_date) values (?, ?, ?, ?, ?)";
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = (PreparedStatement)
		conn.prepareStatement(sql);
		preparedStatement.setInt(1, payment.getPayment_id());
		preparedStatement.setString(2, payment.getPayment_type());
		preparedStatement.setString(3, payment.getPayment_description());
		preparedStatement.setDouble(4, payment.getPayment_amount());
		preparedStatement.setString(5, payment.getPayment_date());
		//preparedStatement.setInt(6, payment.getPatients().getPatient_id());
		int success = preparedStatement.executeUpdate();
		
		conn.close();
		return success;
	}
	
	
	public ArrayList<Payment> viewPayment() throws ClassNotFoundException, SQLException
	{
		ArrayList<Payment> payment = new ArrayList<Payment>();
		String sql="Select * from payment s, patient t where s.patient_id = t.patient_id";
		
		Connection conn = MyDatabase.doConnection();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{

			Payment payments = new Payment();
			
			payments.setPayment_id(resultSet.getInt(1));
			payments.setPayment_type(resultSet.getString(2));
			payments.setPayment_description(resultSet.getString(3));
			payments.setPayment_amount(resultSet.getDouble(4));
			payments.setPayment_date(resultSet.getString(5));
			
			Patient patients = new Patient();
			patients.setPatient_id(resultSet.getInt(6));
			payments.setPatients(patients);
			
			payment.add(payments);
			
		}
		conn.close();
		
		return payment;
		
	}
	
	
	
}
