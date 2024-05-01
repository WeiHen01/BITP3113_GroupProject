package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.mysql.jdbc.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import Database.MyDatabase;
import Controller.DoctorController;
import Model.Doctor;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class DoctorLogin extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorLogin frame = new DoctorLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

	/**
	 * Create the frame.
	 */
	public DoctorLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain frame = new LoginMain();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setEnabled(true);
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnBack.setBounds(26, 321, 161, 35);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("DOCTOR LOGIN");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(228, 21, 190, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor ID  :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBounds(72, 113, 138, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password  :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(72, 187, 138, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(175, 104, 344, 49);
		contentPane.add(textField);
		
		
		JButton btnOk = new JButton("OK");
		btnOk.setForeground(Color.BLACK);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(textField.getText().trim());
				String Password = passwordField.getText().trim();
				
				Doctor Newuser = new Doctor();
				Newuser.setDoctor_id(ID);
				Newuser.setDoctor_password(Password);
				
				String role = "";
				DoctorController doctorController = new DoctorController();
				try {
					role = doctorController.doLogin(Newuser);
					
					if(role == "-1")
					{
						JOptionPane.showMessageDialog(null, "You are not authorized!!!");
					}
					else
					{
						int idcore = Integer.parseInt(textField.getText().trim());
						JOptionPane.showMessageDialog(null, "Successful!");
						DoctorMenu frame = new DoctorMenu(idcore);
						frame.setVisible(true);
						dispose();
						
						
					}
						
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnOk.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnOk.setEnabled(true);
		btnOk.setBounds(464, 321, 161, 35);
		contentPane.add(btnOk);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 178, 344, 49);
		contentPane.add(passwordField);
	}
}
