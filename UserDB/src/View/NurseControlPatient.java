package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.NurseController;
import Controller.PatientController;
import Model.Doctor;
import Model.Nurse;
import Model.Patient;
//import Model.Nurse;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Toolkit;

public class NurseControlPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NurseControlPatient frame = new NurseControlPatient();
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
	public NurseControlPatient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE CONTROL PATIENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PATIENT CONTROL");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(224, 11, 326, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patient ID :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(138, 69, 105, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(234, 65, 298, 32);
		contentPane.add(textField);
		
		JLabel lblNurseId = new JLabel("Patient ID  :");
		lblNurseId.setForeground(Color.BLACK);
		lblNurseId.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNurseId.setBounds(46, 133, 106, 20);
		contentPane.add(lblNurseId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(138, 133, 347, 22);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel2 = new JLabel("Name           :");
		lblNewLabel2.setForeground(Color.BLACK);
		lblNewLabel2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel2.setBounds(46, 227, 106, 20);
		contentPane.add(lblNewLabel2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(138, 228, 347, 22);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel3 = new JLabel("No Phone   :");
		lblNewLabel3.setForeground(Color.BLACK);
		lblNewLabel3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel3.setBounds(46, 326, 106, 20);
		contentPane.add(lblNewLabel3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(138, 327, 347, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel4 = new JLabel("Email           :");
		lblNewLabel4.setForeground(Color.BLACK);
		lblNewLabel4.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel4.setBounds(46, 260, 121, 20);
		contentPane.add(lblNewLabel4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(138, 261, 347, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel5 = new JLabel("Address      :");
		lblNewLabel5.setForeground(Color.BLACK);
		lblNewLabel5.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel5.setBounds(46, 295, 106, 20);
		contentPane.add(lblNewLabel5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(138, 294, 347, 22);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Age              :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_2.setBounds(46, 357, 106, 20);
		contentPane.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setBounds(138, 361, 347, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gender        :");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_3.setBounds(46, 386, 106, 23);
		contentPane.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(138, 389, 347, 20);
		contentPane.add(textField_7);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setEnabled(false); 
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the data that you want to update!");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to update record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						
							String ID = textField.getText().trim();
							int x = Integer.parseInt(ID);
							String NewName = textField_2.getText().trim();
							String NewNoPhone = textField_3.getText().trim();
							String NewEmail = textField_4.getText().trim();
							String NewAddress = textField_5.getText().trim();
							String Age = textField_6.getText().trim();
							int y = Integer.parseInt(Age);
							String NewGender = textField_7.getText().trim();
							Patient patient = new Patient();
							
							patient.setPatient_id(x);
							patient.setPatient_name(NewName);
							patient.setPatient_nophone(NewNoPhone);
							patient.setPatient_email(NewEmail);
							patient.setPatient_address(NewAddress);
							patient.setPatient_age(y);
							patient.setPatient_gender(NewGender);
							
							int success = -1;
							
							PatientController patientController = new PatientController();
							try {
								success = patientController.UpdatePatient(patient);
							}
							catch (ClassNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							

							if (success == -1) {
								JOptionPane.showMessageDialog(null, "Fail to update");
							}
							else
							{
								JOptionPane.showMessageDialog(null, "The patient data has been updated.");
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								textField_4.setText("");
								textField_5.setText("");
								textField_6.setText("");
								textField_7.setText("");
								textField_8.setText("");
								textField_9.setText("");
								
								btnNewButton_1.setEnabled(false);
							}	
					}
				}
			}			
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1.setBounds(378, 420, 108, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3_1 = new JButton("EXIT UPDATE");
		btnNewButton_3_1.setForeground(Color.BLACK);
		btnNewButton_3_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
int input1 = JOptionPane.showConfirmDialog(null, "Do you want to stop updating current record?");
				
				if(input1 == 0)
				{
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_1.setEditable(false);
					textField_2.setEditable(false);
					textField_3.setEditable(false);
					textField_4.setEditable(false);
					textField_5.setEditable(false);
					textField_6.setEditable(false);
					textField_7.setEditable(false);
					textField_8.setEditable(false);
					textField_9.setEditable(false);
					btnNewButton_3_1.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					
					
				}
			}
		});
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_1.setBounds(519, 377, 143, 32);
		contentPane.add(btnNewButton_3_1);
		
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setEnabled(false); 
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Patient id!");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						int id= Integer.parseInt(textField.getText().trim());
						Patient patient2=new Patient();
						patient2.setPatient_id(id);
						
						int success=-1;
						PatientController patientController=new PatientController();
						try {
							success = patientController.DeletePatient(patient2);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "A patient has been deleted.");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							btnNewButton_1_1.setEnabled(false);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(260, 420, 108, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("UPDATE RECORD");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Please update information!");
				btnNewButton_1.setEnabled(true);
				btnNewButton_3_1.setEnabled(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				btnNewButton_1_1.setEnabled(false);
				
			}
		});
		btnNewButton_2_1.setBounds(519, 333, 143, 33);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2_1.setEnabled(false);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if there is no input in the text field
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Patient id!");
					textField_1.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
				}
				else
				{
					int id= Integer.parseInt(textField.getText().trim());
					//int age= Integer.parseInt(textField_6.getText().trim());
					Patient patient = new Patient();
					patient.setPatient_id(id);
					//patient.setAge(age);
					
					//int idnum= Integer.parseInt(textField.getText().trim());
					
					PatientController patientController = new PatientController();
					Patient patient1 = new Patient();
					
					try {
						patient1 = patientController.SearchPatientByID(patient);
						
						
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					//if the record is found
					if(patient1 != null)
						{
							textField_1.setText(Integer.toString(id));
							textField_2.setText(patient1.getPatient_name());
							textField_3.setText(patient1.getPatient_nophone());
							textField_4.setText(patient1.getPatient_email());
							textField_5.setText(patient1.getPatient_address());
							textField_6.setText(Integer.toString(patient1.getPatient_age()));
							textField_7.setText(patient1.getPatient_gender());
							textField_8.setText(patient1.getPatient_username());
							textField_9.setText(patient1.getPatient_password());
							btnNewButton_2_1.setEnabled(true);
							btnNewButton_1_1.setEnabled(true);
						}
			
					else 
					{
						JOptionPane.showMessageDialog(null, "The patient does not exist!");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						btnNewButton_1.setEnabled(false);
						btnNewButton_1_1.setEnabled(false);
						
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(542, 65, 108, 32);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int idnum = 0;
					NurseMenu frame = new NurseMenu(idnum);
					frame.setVisible(true);
					dispose();
			}
		});
		btnBack.setBounds(18, 21, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNewButton_1_1_1 = new JButton("ADD");
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(textField_1.getText().trim().equals("")||textField_3.getText().trim().equals("")||textField_5.getText().trim().equals("")||
						textField_2.getText().trim().equals("")||textField_4.getText().trim().equals("")||textField_6.getText().trim().equals("")
						||textField_7.getText().trim().equals("")||textField_8.getText().trim().equals("")||textField_9.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill the information of the patient!");
					//textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to add the record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						String ID = textField_1.getText().trim();
						int x = Integer.parseInt(ID);
						String NewName = textField_2.getText().trim();
						String NewNoPhone = textField_3.getText().trim();
						String NewEmail = textField_4.getText().trim();
						String NewAddress = textField_5.getText().trim();
						String Age = textField_6.getText().trim();
						int y = Integer.parseInt(Age);
						String NewGender = textField_7.getText().trim();
						String NewUsername = textField_8.getText().trim();
						String NewPassword = textField_9.getText().trim();
						Patient patient1=new Patient();
						String status = "Active";
						
						
						patient1.setPatient_name(NewName);
						patient1.setPatient_nophone(NewNoPhone);
						patient1.setPatient_email(NewEmail);
						patient1.setPatient_address(NewAddress);
						patient1.setPatient_username(NewUsername);
						patient1.setPatient_password(NewPassword);
						patient1.setPatient_gender(NewGender);
						patient1.setPatient_id(x);
						patient1.setPatient_age(y);
						patient1.setPatient_status(status);
						
						
						int success=-1;
						PatientController patientController=new PatientController();
						try {
							success = patientController.insertUser(patient1);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "Record of the patient has been added.");
							textField_1.setText("");
							textField_2.setText("");
							textField_5.setText("");
							textField_4.setText("");
							textField_3.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							btnNewButton_1_1.setEnabled(true);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(140, 420, 108, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_3 = new JButton("EXIT INSERT");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input1 = JOptionPane.showConfirmDialog(null, "Do you want to stop inserting new record?");
				
				if(input1 == 0)
				{
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_1.setEditable(false);
					textField_3.setEditable(false);
					textField_5.setEditable(false);
					textField_2.setEditable(false);
					textField_4.setEditable(false);
					textField.setEditable(true);
					textField_7.setEditable(false);
					textField_8.setEditable(false);
					textField_9.setEditable(false);
					btnNewButton.setEnabled(true);
					btnNewButton_1_1_1.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					btnNewButton_1_1.setEnabled(false);
					
				}
			}
		});
		btnNewButton_3.setBounds(519, 290, 142, 32);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setEnabled(false);
		
		JButton btnNewButton_2 = new JButton("INSERT RECORDS");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Please insert new records!");
				textField.setEditable(false);
				textField.setText("");
				btnNewButton.setEnabled(false);
				btnNewButton_1_1_1.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_1_1.setEnabled(false);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_1.setText("");
				textField_2.setText("");
				textField_5.setText("");
				textField_4.setText("");
				textField_3.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				
			}
		});
		btnNewButton_2.setBounds(519, 248, 142, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblInformation = new JLabel("INFORMATION");
		lblInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformation.setForeground(Color.BLACK);
		lblInformation.setFont(new Font("Cambria", Font.BOLD, 25));
		lblInformation.setBounds(44, 100, 199, 32);
		contentPane.add(lblInformation);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(138, 166, 347, 22);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(138, 194, 347, 22);
		contentPane.add(textField_9);
		
		JLabel lblUsername = new JLabel("Username  :");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Cambria", Font.BOLD, 16));
		lblUsername.setBounds(46, 164, 106, 20);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password   :");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Cambria", Font.BOLD, 16));
		lblPassword.setBounds(46, 194, 106, 20);
		contentPane.add(lblPassword);
		
		
		
		
		
		
		
		
		
		
		
	}
}
