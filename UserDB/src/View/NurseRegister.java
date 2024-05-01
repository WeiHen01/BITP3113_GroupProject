package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.NurseController;
import Database.MyDatabase;
import Model.Nurse;
import Model.Doctor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class NurseRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NurseRegister frame = new NurseRegister();
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
	public NurseRegister() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE REGISTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NURSE REGISTRATION");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(207, 11, 266, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name                    :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(56, 107, 152, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(195, 110, 409, 25);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone Number  :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(56, 140, 152, 28);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(195, 145, 409, 25);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email                    :");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(56, 177, 152, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(195, 181, 409, 25);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address               :");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(56, 221, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(195, 217, 409, 77);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Now set your ID, username and password:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(56, 305, 468, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("ID                          :");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2.setBounds(56, 344, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Username           :");
		lblNewLabel_1_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1.setBounds(56, 383, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Password            :");
		lblNewLabel_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(56, 422, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(195, 346, 242, 28);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(195, 385, 242, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(195, 424, 242, 28);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2 = new JLabel("Doctor ID             :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(56, 76, 136, 23);
		contentPane.add(lblNewLabel_2);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_7.setBounds(195, 76, 409, 23);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText().trim();
				String phone = textField_1.getText().trim();
				String email = textField_2.getText().trim();
				String address = textField_3.getText().trim();
				int ID = Integer.parseInt(textField_4.getText().trim());
				String UserName = textField_5.getText().trim();
				String Password = textField_6.getText().trim();
				int IDdoc = Integer.parseInt(textField_7.getText().trim());
				String Status = "Active";
				
				Doctor doctor = new Doctor(IDdoc);
				Nurse Newuser = new Nurse();
				Newuser.setNurse_id(ID);
				Newuser.setNurse_name(name);
				Newuser.setNurse_nophone(phone);
				Newuser.setNurse_email(email);
				Newuser.setNurse_address(address);
				Newuser.setNurse_username(UserName);
				Newuser.setNurse_password(Password);
				Newuser.setNurse_status(Status);
				Newuser.setDoctor(doctor);
				
				int success = -1;
				
				NurseController nurseController = new NurseController();
				try {
					success = nurseController.insertUser(Newuser);
					
					if(success == -1)
					{
						JOptionPane.showMessageDialog(null, "This User already exist!");
					}
					else 
							{
								JOptionPane.showMessageDialog(null, "Successful registration!");
								LoginMain frame = new LoginMain();
								frame.setVisible(true);
								dispose();
							
							
							textField.setText("");
							textField_1.setText("");						
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							}
					
				}catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(579, 388, 109, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register frame = new Register();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancel.setBounds(579, 422, 109, 25);
		contentPane.add(btnCancel);
		
	}
}
