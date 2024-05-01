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
import Controller.NurseController;
import Model.Nurse;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class NurseLogin extends JFrame {

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
					NurseLogin frame = new NurseLogin();
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
	public NurseLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 378);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNurseLogin = new JLabel("NURSE LOGIN");
		lblNurseLogin.setForeground(Color.BLACK);
		lblNurseLogin.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNurseLogin.setBounds(230, 27, 191, 35);
		contentPane.add(lblNurseLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Nurse ID     :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBounds(64, 107, 138, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password   :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(64, 181, 107, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 18));
		textField.setBounds(165, 98, 344, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/*JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton.setBounds(30, 295, 161, 35);
		contentPane.add(btnNewButton);*/
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain frame = new LoginMain();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnBack.setEnabled(true);
		btnBack.setBounds(30, 295, 161, 35);
		contentPane.add(btnBack);

		
		/*JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnOk.setBounds(434, 295, 161, 35);
		contentPane.add(btnOk);*/
		
		JButton btnOk = new JButton("OK");
		btnOk.setForeground(Color.BLACK);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(textField.getText().trim());
				String Password = passwordField.getText().trim();
				
				Nurse Newuser = new Nurse();
				Newuser.setNurse_id(ID);
				Newuser.setNurse_password(Password);
				
				String role = "";
				NurseController nurseController = new NurseController();
				try {
					role = nurseController.doLogin(Newuser);
					
					if(role == "-1")
					{
						JOptionPane.showMessageDialog(null, "You are not authorized!!!");
					}
					else
					{
						int idcore = Integer.parseInt(textField.getText().trim());
						JOptionPane.showMessageDialog(null, "Successful!");
						NurseMenu frame = new NurseMenu(idcore);
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
		btnOk.setBounds(434, 295, 161, 35);
		contentPane.add(btnOk);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 172, 344, 49);
		contentPane.add(passwordField);
	}

}
