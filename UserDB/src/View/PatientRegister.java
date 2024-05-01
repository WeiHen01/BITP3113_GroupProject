package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.NurseController;
import Controller.PatientController;
import Database.MyDatabase;
import Model.Nurse;
import Model.Patient;

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
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PatientRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientRegister frame = new PatientRegister();
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
	public PatientRegister() {
		setTitle("PATIENT REGISTER");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblRegisterAsPatient = new JLabel("REGISTER AS PATIENT");
		lblRegisterAsPatient.setForeground(Color.BLACK);
		lblRegisterAsPatient.setFont(new Font("Cambria", Font.BOLD, 25));
		lblRegisterAsPatient.setBounds(200, 11, 293, 49);
		contentPane.add(lblRegisterAsPatient);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(181, 61, 409, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(181, 97, 409, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(181, 133, 409, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(181, 169, 409, 49);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(181, 345, 242, 28);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(181, 384, 242, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(181, 423, 242, 28);
		contentPane.add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Cambria", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "F", "M"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(181, 265, 242, 29);
		contentPane.add(comboBox);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_7.setBounds(181, 229, 243, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText().trim();
				String phone = textField_1.getText().trim();
				String email = textField_2.getText().trim();
				String address = textField_3.getText().trim();
				int ID = Integer.parseInt(textField_4.getText().trim());
				String UserName = textField_5.getText().trim();
				String Password = textField_6.getText().trim();
				String gender = (String)comboBox.getSelectedItem();
				int age = Integer.parseInt(textField_7.getText().trim());
				String Status = "Active";
				
				Patient Newuser = new Patient();
				Newuser.setPatient_id(ID);
				Newuser.setPatient_name(name);
				Newuser.setPatient_nophone(phone);
				Newuser.setPatient_email(email);
				Newuser.setPatient_address(address);
				Newuser.setPatient_username(UserName);
				Newuser.setPatient_password(Password);
				Newuser.setPatient_status(Status);
				Newuser.setPatient_gender(gender);
				Newuser.setPatient_age(age);
				
				int success = -1;
				
				PatientController patientController = new PatientController();
				try {
					success = patientController.insertUser(Newuser);
					
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
					}
							
					textField.setText("");
					textField_1.setText("");						
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					comboBox.setSelectedIndex(0);
					btnNewButton.setEnabled(false);
							
					}catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(559, 411, 89, 23);
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
		btnCancel.setBounds(559, 446, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name                    :");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(43, 56, 152, 28);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone Number  :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(43, 92, 152, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email                    :");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(43, 128, 152, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address               :");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(43, 163, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Age                        :");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(43, 226, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Gender                 :");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(43, 262, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Now set your ID, username and password:");
		lblNewLabel_1_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_2.setBounds(43, 306, 468, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("ID                           :");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2.setBounds(43, 345, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Username            :");
		lblNewLabel_1_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1.setBounds(43, 384, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Password             :");
		lblNewLabel_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(43, 423, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		
		
	}
}
