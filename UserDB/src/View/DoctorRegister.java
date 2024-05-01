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

public class DoctorRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorRegister frame = new DoctorRegister();
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
	public DoctorRegister() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR REGISTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOCTOR REGISTRATION");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(198, 11, 288, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name                    :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(46, 79, 152, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setBounds(184, 84, 409, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone Number  :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(46, 118, 152, 28);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(184, 123, 409, 25);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email                    :");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(46, 157, 152, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(184, 162, 409, 25);
		contentPane.add(textField_2);
		
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address               :");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(46, 196, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(184, 197, 409, 77);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Now set your ID, username and password:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(46, 293, 468, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("ID                           :");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2.setBounds(46, 332, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Username            :");
		lblNewLabel_1_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1.setBounds(46, 371, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Password             :");
		lblNewLabel_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(46, 410, 152, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(184, 332, 242, 28);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(184, 371, 242, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(184, 410, 242, 28);
		contentPane.add(textField_6);
		
		
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
				String Status =  "Active";
				
				Doctor Newuser = new Doctor(ID);
				Newuser.setDoctor_id(ID);
				Newuser.setDoctor_name(name);
				Newuser.setDoctor_nophone(phone);
				Newuser.setDoctor_email(email);
				Newuser.setDoctor_address(address);
				Newuser.setDoctor_username(UserName);
				Newuser.setDoctor_password(Password);
				Newuser.setDoctor_status(Status);
				
				int success = -1; 
				
				DoctorController doctorController = new DoctorController();
				try {
					success = doctorController.insertUser(Newuser);
					
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
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(540, 412, 109, 28);
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
		btnCancel.setBounds(540, 451, 109, 27);
		contentPane.add(btnCancel);
		
	}
}