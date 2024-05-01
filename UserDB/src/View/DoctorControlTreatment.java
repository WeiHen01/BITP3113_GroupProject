package View;

import java.awt.EventQueue;
import Model.Payment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.TreatmentController;
import Model.Treatment;
import Model.Doctor;
import Model.Patient;

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

public class DoctorControlTreatment extends JFrame {

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
					DoctorControlTreatment frame = new DoctorControlTreatment();
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
	public DoctorControlTreatment() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR CONTROL TREATMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TREATMENT CONTROL");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNewLabel.setBounds(224, 11, 326, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Treatment ID  :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(111, 87, 121, 29);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(234, 84, 298, 32);
		contentPane.add(textField);
		
		JLabel lblNurseId = new JLabel("Treatment ID :");
		lblNurseId.setForeground(Color.BLACK);
		lblNurseId.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNurseId.setBounds(48, 176, 128, 20);
		contentPane.add(lblNurseId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(160, 173, 347, 23);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel2 = new JLabel("Name               :");
		lblNewLabel2.setForeground(Color.BLACK);
		lblNewLabel2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel2.setBounds(48, 209, 121, 20);
		contentPane.add(lblNewLabel2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(160, 207, 347, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(160, 306, 347, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel3 = new JLabel("Type                :");
		lblNewLabel3.setForeground(Color.BLACK);
		lblNewLabel3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel3.setBounds(48, 240, 128, 20);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Description    :");
		lblNewLabel4.setForeground(Color.BLACK);
		lblNewLabel4.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel4.setBounds(48, 275, 121, 20);
		contentPane.add(lblNewLabel4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(160, 240, 347, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel5 = new JLabel("Date                 :");
		lblNewLabel5.setForeground(Color.BLACK);
		lblNewLabel5.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel5.setBounds(48, 308, 121, 20);
		contentPane.add(lblNewLabel5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(160, 273, 347, 22);
		contentPane.add(textField_5);
		
	
		
		
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
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField.setText("");
					
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
							String NewDescription = textField_5.getText().trim();
							String NewType = textField_4.getText().trim();
							String NewDate = textField_3.getText().trim();
							String Price = textField_6.getText().trim();
							double NewPrice = Double.parseDouble(Price);
							
							Treatment treatment = new Treatment();
							
							treatment.setTreatment_name(NewName);
							treatment.setTreatment_description(NewDescription);
							treatment.setTreatment_type(NewType);
							treatment.setTreatment_date(NewDate);
							treatment.setTreatment_price(NewPrice);
							treatment.setTreatment_id(x);
							int success = -1;
							TreatmentController treatmentController = new TreatmentController();
							try {
								success = treatmentController.UpdateTreatment(treatment);
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
								JOptionPane.showMessageDialog(null, "The treatment data has been updated.");
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_5.setText("");
								textField_4.setText("");
								textField_3.setText("");
								textField_6.setText("");
								textField_7.setText("");
								btnNewButton_1.setEnabled(false);
							}	
					}
				}
			}			
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1.setBounds(400, 407, 108, 32);
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
					textField_3.setText("");
					textField_5.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField_6.setText("");
					textField.setText("");
					textField_1.setEditable(false);
					textField_3.setEditable(false);
					textField_5.setEditable(false);
					textField_2.setEditable(false);
					textField_4.setEditable(false);
					textField_6.setEditable(false);
					textField.setEditable(true);
					btnNewButton_3_1.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					
					
				}
			}
		});
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_1.setBounds(542, 356, 142, 32);
		contentPane.add(btnNewButton_3_1);
		
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setEnabled(false); 
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Treatment id!");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						int id= Integer.parseInt(textField.getText().trim());
						Treatment treatment=new Treatment();
						treatment.setTreatment_id(id);
						
						int success=-1;
						TreatmentController treatmentController=new TreatmentController();
						try {
							success = treatmentController.DeleteTreatment(treatment);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "A treatment has been deleted.");
							textField_1.setText("");
							textField_2.setText("");
							textField_5.setText("");
							textField_4.setText("");
							textField_3.setText("");
							textField_6.setText("");
							
							btnNewButton_1_1.setEnabled(false);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(282, 407, 108, 32);
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
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				textField.setEditable(false);
				btnNewButton_1_1.setEnabled(false);
				
			}
		});
		btnNewButton_2_1.setBounds(542, 317, 142, 29);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2_1.setEnabled(false);
		
		
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if there is no input in the text field
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Treatment id!");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
					textField.setText("");
					
				}
				
				else
				{
					int id= Integer.parseInt(textField.getText().trim());
					Treatment treatment= new Treatment();
					treatment.setTreatment_id(id);
					
					TreatmentController treatmentController = new TreatmentController();
					Treatment treatment1 = new Treatment();
					
					try {
						treatment1 = treatmentController.SearchTreatment(treatment);
						
						
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					//if the record is found
					if(treatment1 != null)
						{
							textField_1.setText(Integer.toString(id));
							textField_2.setText(treatment1.getTreatment_name());
							textField_4.setText(treatment1.getTreatment_type());
							textField_5.setText(treatment1.getTreatment_description());
							textField_6.setText(Double.toString(treatment1.getTreatment_price()));
							textField_3.setText(treatment1.getTreatment_date());
							textField_7.setText(Integer.toString(treatment1.getPayment().getPayment_id()));
							
							btnNewButton_2_1.setEnabled(true);
							btnNewButton_1_1.setEnabled(true);
							
						}
			
					else 
					{
						JOptionPane.showMessageDialog(null, "The treatment does not exist!");
						textField_1.setText("");
						textField_2.setText("");
						textField_5.setText("");
						textField_4.setText("");
						textField_3.setText("");
						textField_6.setText("");
						textField_7.setText("");
						btnNewButton_1.setEnabled(false);
						btnNewButton_1_1.setEnabled(false);
						
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton.setBounds(542, 84, 108, 32);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1_1_1 = new JButton("ADD");
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(textField_1.getText().trim().equals("")||textField_3.getText().trim().equals("")||textField_5.getText().trim().equals("")||
						textField_2.getText().trim().equals("")||textField_4.getText().trim().equals("")||textField_6.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill the information of the treatment!");
					textField_1.setText("");
					textField_3.setText("");
					textField_5.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField_6.setText("");
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
						String type = textField_4.getText().trim();
						String description = textField_5.getText().trim();
						String date = textField_3.getText().trim();
						int payment_id= Integer.parseInt(textField_7.getText().trim());
						double price = Double.parseDouble(textField_6.getText().trim());
						String status = "Available";
						Payment payments = new Payment(payment_id);
						
						Treatment treatment1=new Treatment();
						
						treatment1.setTreatment_id(id);
						treatment1.setTreatment_name(name);
						treatment1.setTreatment_type(type);
						treatment1.setTreatment_description(description);
						treatment1.setTreatment_date(date);
						treatment1.setTreatment_price(price);
						treatment1.setTreatment_status(status);
						treatment1.setPayment(payments);
						
						
						
						int success=-1;
						TreatmentController treatmentController=new TreatmentController();
						try {
							success = treatmentController.AddTreatment(treatment1);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "Record of the treatment has been added.");
							textField_1.setText("");
							textField_3.setText("");
							textField_5.setText("");
							textField_2.setText("");
							textField_4.setText("");
							textField_6.setText("");
							textField_7.setText("");
							
							btnNewButton_1_1.setEnabled(true);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(160, 407, 108, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblInformation = new JLabel("INFORMATION");
		lblInformation.setForeground(Color.BLACK);
		lblInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformation.setFont(new Font("Cambria", Font.BOLD, 25));
		lblInformation.setBounds(48, 120, 172, 45);
		contentPane.add(lblInformation);
		
		
		JButton btnNewButton_3 = new JButton("EXIT INSERT");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input1 = JOptionPane.showConfirmDialog(null, "Do you want to stop inserting new record?");
				
				if(input1 == 0)
				{
					textField_1.setText("");
					textField_3.setText("");
					textField_5.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField_6.setText("");
					
					textField_1.setEditable(false);
					textField_2.setEditable(false);
					textField_5.setEditable(false);
					textField_4.setEditable(false);
					textField_3.setEditable(false);
					textField_6.setEditable(false);
					textField_7.setEditable(false);
					textField.setEditable(true);
					btnNewButton.setEnabled(true);
					btnNewButton_1_1_1.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					btnNewButton_1_1.setEnabled(false);
					
				}
			}
		});
		btnNewButton_3.setBounds(542, 275, 142, 31);
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
				textField_3.setEditable(true);
				textField_5.setEditable(true);
				textField_2.setEditable(true);
				textField_4.setEditable(true);
				textField_7.setEditable(true);
				textField_1.setText("");
				textField_3.setText("");
				textField_5.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
			
				
				
			}
		});
		btnNewButton_2.setBounds(542, 235, 142, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Price                :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_2.setBounds(48, 336, 121, 20);
		contentPane.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setBounds(160, 339, 347, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Payment ID    :");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_3.setBounds(48, 371, 121, 17);
		contentPane.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_7.setEditable(false);
		textField_7.setBounds(160, 369, 347, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
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
		btnNewButton_4.setBounds(22, 11, 89, 23);
		contentPane.add(btnNewButton_4);
		
		
		
		
		
	}
}