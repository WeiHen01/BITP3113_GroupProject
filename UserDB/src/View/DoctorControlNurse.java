package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.NurseController;
import Model.Nurse;
import Model.Doctor;

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

public class DoctorControlNurse extends JFrame {
	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorControlNurse frame = new DoctorControlNurse();
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
	public DoctorControlNurse() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR CONTROL NURSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NURSE CONTROL");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNewLabel.setBounds(224, 11, 306, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nurse ID:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(156, 73, 90, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(234, 70, 298, 32);
		contentPane.add(textField);
		
		JLabel lblNurseId = new JLabel("Nurse ID    :");
		lblNurseId.setForeground(Color.BLACK);
		lblNurseId.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNurseId.setBounds(48, 147, 104, 20);
		contentPane.add(lblNurseId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(136, 149, 347, 22);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel2 = new JLabel("Name         :");
		lblNewLabel2.setForeground(Color.BLACK);
		lblNewLabel2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel2.setBounds(48, 178, 90, 20);
		contentPane.add(lblNewLabel2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(136, 180, 347, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(136, 325, 347, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel3 = new JLabel("No phone  :");
		lblNewLabel3.setForeground(Color.BLACK);
		lblNewLabel3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel3.setBounds(48, 213, 108, 20);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Email         :");
		lblNewLabel4.setForeground(Color.BLACK);
		lblNewLabel4.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel4.setBounds(48, 241, 104, 20);
		contentPane.add(lblNewLabel4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(136, 211, 347, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel5 = new JLabel("Password  :");
		lblNewLabel5.setForeground(Color.BLACK);
		lblNewLabel5.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel5.setBounds(48, 349, 108, 26);
		contentPane.add(lblNewLabel5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(136, 242, 347, 22);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Address     :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_2.setBounds(48, 272, 90, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username :");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_3.setBounds(48, 323, 106, 22);
		contentPane.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(136, 353, 347, 22);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_4 = new JLabel("Doctor ID  : ");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_4.setBounds(48, 383, 108, 20);
		contentPane.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_7.setEditable(false);
		textField_7.setBounds(136, 385, 347, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setEnabled(false); 
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the data that you want to update!");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_8.setText("");
					textField_7.setText("");
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
							String NewNophone = textField_4.getText().trim();
							String NewEmail = textField_5.getText().trim();
							String NewAddress = textField_8.getText().trim();
							String NewUsername = textField_3.getText().trim();
							String NewPassword = textField_6.getText().trim();
							
							
							Nurse nurse = new Nurse();
							
							nurse.setNurse_name(NewName);
							nurse.setNurse_nophone(NewNophone);
							nurse.setNurse_email(NewEmail);
							nurse.setNurse_address(NewAddress);
							nurse.setNurse_username(NewUsername);
							nurse.setNurse_password(NewPassword);
							nurse.setNurse_id(x);
							int success = -1;
							NurseController nurseController = new NurseController();
							try {
								success = nurseController.UpdateNurse(nurse);
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
								JOptionPane.showMessageDialog(null, "The nurse data has been updated.");
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_5.setText("");
								textField_4.setText("");
								textField_3.setText("");
								textField_6.setText("");
								textField_8.setText("");
								textField_7.setText("");
								
								btnNewButton_1.setEnabled(false);
							}	
					}
				}
			}			
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1.setBounds(375, 420, 108, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3_1 = new JButton("EXIT UPDATE");
		btnNewButton_3_1.setForeground(Color.BLACK);
		btnNewButton_3_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input1 = JOptionPane.showConfirmDialog(null, "Do you want to stop updating current record?");
				
				if(input1 == 0)
				{
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_8.setText("");
					textField_1.setEditable(false);
					textField_3.setEditable(false);
					textField_5.setEditable(false);
					textField_2.setEditable(false);
					textField_4.setEditable(false);
					textField_8.setEditable(false);
					textField.setEditable(true);
					btnNewButton_3_1.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					
					
				}
			}
		});
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_1.setBounds(526, 371, 142, 32);
		contentPane.add(btnNewButton_3_1);
		
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setEnabled(false); 
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Nurse id!");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						int id= Integer.parseInt(textField.getText().trim());
						Nurse nurse2=new Nurse();
						nurse2.setNurse_id(id);
						
						int success=-1;
						NurseController nurseController=new NurseController();
						try {
							success = nurseController.DeleteNurse(nurse2);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "A nurse has been deleted.");
							textField_1.setText("");
							textField_2.setText("");
							textField_5.setText("");
							textField_4.setText("");
							textField_3.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField.setText("");
							btnNewButton_1_1.setEnabled(false);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(254, 420, 108, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("UPDATE RECORD");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Please update information!");
				btnNewButton_1.setEnabled(true);
				btnNewButton_3_1.setEnabled(true);
				textField_1.setEditable(false);
				textField_2.setEditable(true);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				
				textField_8.setEditable(true);
				btnNewButton_1_1.setEnabled(false);
				textField.setEditable(false);
				
			}
		});
		btnNewButton_2_1.setBounds(526, 325, 142, 32);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2_1.setEnabled(false);
		
		
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if there is no input in the text field
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Nurse id!");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_8.setText("");
					textField_7.setText("");
				}
				else
				{
					int id= Integer.parseInt(textField.getText().trim());
					Nurse nurse= new Nurse();
					nurse.setNurse_id(id);
					
					NurseController nurseController = new NurseController();
					Nurse nurse1 = new Nurse();
					
					try {
						nurse1 = nurseController.SearchNurse(nurse);
							
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					//if the record is found
					if(nurse1 != null)
						{
							textField_1.setText(Integer.toString(id));
							textField_2.setText(nurse1.getNurse_name());
							textField_4.setText(nurse1.getNurse_nophone());
							textField_5.setText(nurse1.getNurse_email());
							textField_8.setText(nurse1.getNurse_address());
							textField_3.setText(nurse1.getNurse_username());
							textField_6.setText(nurse1.getNurse_password());
							textField_7.setText(Integer.toString(nurse1.getDoctor().getDoctor_id()));
							btnNewButton_2_1.setEnabled(true);
							btnNewButton_1_1.setEnabled(true);
							
						}
			
					else 
					{
						JOptionPane.showMessageDialog(null, "The nurse does not exist!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_5.setText("");
						textField_4.setText("");
						textField_3.setText("");
						textField_6.setText("");
						textField_8.setText("");
						textField_7.setText("");
						btnNewButton_1.setEnabled(false);
						btnNewButton_1_1.setEnabled(false);
						
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton.setBounds(542, 69, 108, 32);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1_1_1 = new JButton("ADD");
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(textField_1.getText().trim().equals("")||textField_3.getText().trim().equals("")||textField_5.getText().trim().equals("")||
						textField_2.getText().trim().equals("")||textField_4.getText().trim().equals("")||textField_8.getText().trim().equals("")||textField_6.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill the information of the medicine!");
					//textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField_8.setText("");
					textField_7.setText("");
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to add the record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						int id= Integer.parseInt(textField_1.getText().trim());
						String name = textField_2.getText().trim();
						String nophone = textField_4.getText().trim();
						String email = textField_5.getText().trim();
						String address = textField_8.getText().trim();
						String username = textField_3.getText().trim();
						String password = textField_6.getText().trim();
						
						Nurse nurse1=new Nurse();
						String status = "Active";
						int IDdoc = Integer.parseInt(textField_7.getText().trim());
						Doctor doctor = new Doctor();
						doctor.setDoctor_id(IDdoc);
						
						
						nurse1.setNurse_name(name);
						nurse1.setNurse_nophone(nophone);
						nurse1.setNurse_email(email);
						nurse1.setNurse_address(address);
						nurse1.setNurse_username(username);
						nurse1.setNurse_password(password);
						nurse1.setNurse_id(id);
						nurse1.setNurse_status(status);
						nurse1.setDoctor(doctor);
						
						int success=-1;
						NurseController nurseController=new NurseController();
						try {
							success = nurseController.insertUser(nurse1);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "Record of the nurse has been added.");
							textField_1.setText("");
							textField_2.setText("");
							textField_5.setText("");
							textField_4.setText("");
							textField_3.setText("");
							textField_6.setText("");
							textField_8.setText("");
							textField_7.setText("");
							btnNewButton_1_1.setEnabled(true);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(136, 420, 108, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblInformation = new JLabel("INFORMATION");
		lblInformation.setForeground(Color.BLACK);
		lblInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformation.setFont(new Font("Cambria", Font.BOLD, 25));
		lblInformation.setBounds(47, 104, 199, 32);
		contentPane.add(lblInformation);
		
		
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
					textField_8.setText("");
					textField_7.setText("");
					textField_1.setEditable(false);
					textField_3.setEditable(false);
					textField_5.setEditable(false);
					textField_2.setEditable(false);
					textField_4.setEditable(false);
					textField.setEditable(true);
					textField_8.setEditable(false);
					textField_7.setEditable(false);
					btnNewButton.setEnabled(true);
					btnNewButton_1_1_1.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					btnNewButton_1_1.setEnabled(false);
					
				}
			}
		});
		btnNewButton_3.setBounds(526, 284, 142, 32);
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
				textField_8.setEditable(true);
				textField_7.setEditable(true);
				textField_1.setText("");
				textField_2.setText("");
				textField_5.setText("");
				textField_4.setText("");
				textField_3.setText("");
				textField_6.setText("");
				textField_8.setText("");
				textField_7.setText("");
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				textField_8.setEditable(true);
				textField_7.setEditable(true);
				
			}
		});
		btnNewButton_2.setBounds(526, 241, 142, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int idnum = 0;
					DoctorMenu frame = new DoctorMenu(idnum);
					frame.setVisible(true);
					dispose();
			}
		});
		btnNewButton_4.setBounds(22, 11, 90, 22);
		contentPane.add(btnNewButton_4);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_8.setEditable(false);
		textField_8.setBounds(136, 272, 347, 45);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		
		
	}
}
