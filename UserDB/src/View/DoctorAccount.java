package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.EventQueue;

import com.mysql.jdbc.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Database.MyDatabase;
import Controller.DoctorController;
import Model.Doctor;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Dimension;

public class DoctorAccount extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int idnum1 = 0;
					DoctorAccount frame = new DoctorAccount(idnum1);
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
	public DoctorAccount(int idnum) {
		setBackground(new Color(0, 0, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR ACCOUNT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ID                         :");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(53, 139, 141, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setBounds(183, 138, 424, 27);
		contentPane.add(textField);
		textField.setColumns(10);
	
		JLabel lblNewLabel = new JLabel("ACCOUNT INFORMATION");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(216, 39, 304, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Username           :");
		lblNewLabel_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1_2_1.setBounds(53, 177, 158, 20);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(183, 176, 424, 27);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("Name                   :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1.setBounds(53, 213, 137, 20);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(183, 212, 424, 27);
		contentPane.add(textField_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone Number  :");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(53, 250, 137, 20);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(183, 249, 424, 27);
		contentPane.add(textField_2);		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email                   :");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(53, 288, 137, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(183, 287, 424, 27);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Address               :");
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(53, 330, 137, 20);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setPreferredSize(new Dimension(9, 20));
	
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setColumns(10);
		textField_4.setBounds(182, 325, 425, 35);
		contentPane.add(textField_4);
		
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorMenu frame = new DoctorMenu(idnum);
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnBack.setEnabled(true);
		btnBack.setBounds(531, 407, 161, 35);
		contentPane.add(btnBack);
		
		
		textField.setEditable(false);
		textField_1.setEditable(false);
		textField_2.setEditable(false);
		textField_3.setEditable(false);
		textField_4.setEditable(false);
		textField_5.setEditable(false);
		
		try {
			
			Doctor doctor= new Doctor();
			doctor.setDoctor_id(idnum);
			
			DoctorController doctorController = new DoctorController();
			doctorController.showProfile(doctor);
			textField.setText(Integer.toString(doctorController.showProfile(doctor).getDoctor_id()));
			textField_1.setText(doctorController.showProfile(doctor).getDoctor_name());
			textField_2.setText(doctorController.showProfile(doctor).getDoctor_nophone());
			textField_3.setText(doctorController.showProfile(doctor).getDoctor_email());
			textField_4.setText(doctorController.showProfile(doctor).getDoctor_address());
			textField_5.setText(doctorController.showProfile(doctor).getDoctor_username());
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
	}
}
