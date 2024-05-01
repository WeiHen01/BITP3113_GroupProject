package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.MedicineController;
import Model.Medicine;
import Model.Nurse;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Color;

public class NurseControlMedicine extends JFrame {

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
					NurseControlMedicine frame = new NurseControlMedicine();
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
	public NurseControlMedicine() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE CONTROL MEDICINE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MEDICINE CONTROL");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNewLabel.setBounds(224, 11, 326, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Medicine ID :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(125, 88, 106, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(234, 84, 298, 32);
		contentPane.add(textField);
		
		JLabel lblNurseId = new JLabel("Medicine ID :");
		lblNurseId.setForeground(Color.BLACK);
		lblNurseId.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNurseId.setBounds(37, 227, 106, 20);
		contentPane.add(lblNurseId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(138, 228, 347, 22);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel2 = new JLabel("Name             :");
		lblNewLabel2.setForeground(Color.BLACK);
		lblNewLabel2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel2.setBounds(37, 260, 106, 20);
		contentPane.add(lblNewLabel2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(138, 261, 347, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(138, 362, 347, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel3 = new JLabel("Type              :");
		lblNewLabel3.setForeground(Color.BLACK);
		lblNewLabel3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel3.setBounds(37, 296, 106, 20);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Company      :");
		lblNewLabel4.setForeground(Color.BLACK);
		lblNewLabel4.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel4.setBounds(37, 327, 121, 20);
		contentPane.add(lblNewLabel4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(138, 294, 347, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel5 = new JLabel("Cost               :");
		lblNewLabel5.setForeground(Color.BLACK);
		lblNewLabel5.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel5.setBounds(37, 361, 106, 20);
		contentPane.add(lblNewLabel5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(138, 327, 347, 22);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Nurse ID       :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_2.setBounds(37, 194, 106, 24);
		contentPane.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Cambria", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setBounds(138, 196, 347, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
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
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to update record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						
							String ID = textField.getText().trim();
							int x = Integer.parseInt(ID);
							String NewCompany = textField_5.getText().trim();
							String NewName = textField_2.getText().trim();
							String NewType = textField_4.getText().trim();
							String cost = textField_3.getText().trim();
							double NewCost = Double.parseDouble(cost);
							Medicine medicine = new Medicine();
							medicine.setMedicine_company(NewCompany);
							medicine.setMedicine_name(NewName);
							medicine.setMedicine_type(NewType);
							medicine.setMedicine_cost(NewCost);
							medicine.setMedicine_id(x);
							int success = -1;
							MedicineController medicineController = new MedicineController();
							try {
								success = medicineController.UpdateMedicine(medicine);
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
								JOptionPane.showMessageDialog(null, "The medicine data has been updated.");
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_5.setText("");
								textField_4.setText("");
								textField_3.setText("");
								textField_6.setText("");
								
								btnNewButton_1.setEnabled(false);
							}	
					}
				}
			}			
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 13));
		btnNewButton_1.setBounds(374, 408, 108, 32);
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
					textField_1.setEditable(false);
					textField_3.setEditable(false);
					textField_5.setEditable(false);
					textField_2.setEditable(false);
					textField_4.setEditable(false);
					textField_6.setEditable(false);
					btnNewButton_3_1.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					
					
				}
			}
		});
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_1.setBounds(526, 353, 142, 32);
		contentPane.add(btnNewButton_3_1);
		
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setEnabled(false); 
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Medicine id!");
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
						Medicine medicine2=new Medicine();
						medicine2.setMedicine_id(id);
						
						int success=-1;
						MedicineController medicineController=new MedicineController();
						try {
							success = medicineController.DeleteMedicine(medicine2);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "A medicine has been deleted.");
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
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 13));
		btnNewButton_1_1.setBounds(256, 408, 108, 32);
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
				btnNewButton_1_1.setEnabled(false);
				
			}
		});
		btnNewButton_2_1.setBounds(526, 318, 142, 29);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2_1.setEnabled(false);
		
		
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if there is no input in the text field
				if(textField.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the Medicine id!");
					textField_1.setText("");
					textField_2.setText("");
					textField_5.setText("");
					textField_4.setText("");
					textField_3.setText("");
					textField_6.setText("");
				}
				else
				{
					int id= Integer.parseInt(textField.getText().trim());
					Medicine medicine= new Medicine();
					medicine.setMedicine_id(id);
					
					//int idnum= Integer.parseInt(textField.getText().trim());
					
					MedicineController medicineController = new MedicineController();
					Medicine medicine1 = new Medicine();
					
					try {
						medicine1 = medicineController.SearchMedicine(medicine);
						
						
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					//if the record is found
					if(medicine1 != null)
						{
							textField_1.setText(Integer.toString(id));
							textField_2.setText(medicine1.getMedicine_name());
							textField_5.setText(medicine1.getMedicine_type());
							textField_4.setText(medicine1.getMedicine_company());
							textField_3.setText(Double.toString(medicine1.getMedicine_cost()));
							textField_6.setText(Integer.toString(medicine1.getNurse().getNurse_id()));
							btnNewButton_2_1.setEnabled(true);
							btnNewButton_1_1.setEnabled(true);
							
						}
			
					else 
					{
						JOptionPane.showMessageDialog(null, "The medicine does not exist!");
						textField_1.setText("");
						textField_2.setText("");
						textField_5.setText("");
						textField_4.setText("");
						textField_3.setText("");
						textField_6.setText("");
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
					JOptionPane.showMessageDialog(null, "Please fill the information of the medicine!");
					textField_1.setText("");
					textField_3.setText("");
					textField_5.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField_6.setText("");
				}
				else
				{
					int input = JOptionPane.showConfirmDialog(null, "Do you want to add the record?");
					//0 = yes, 1 = no, 2 = cancel
					
					if(input == 0)
					{
						int id= Integer.parseInt(textField_1.getText().trim());
						String name = textField_2.getText().trim();
						String type = textField_5.getText().trim();
						String company = textField_4.getText().trim();
						float cost = Float.parseFloat(textField_3.getText().trim());
						Medicine medicine1=new Medicine();
						String status = "Available";
						int idnum = Integer.parseInt(textField_6.getText().trim());
						Nurse nurse = new Nurse();
						nurse.setNurse_id(idnum);
						
						medicine1.setMedicine_id(id);
						medicine1.setMedicine_name(name);
						medicine1.setMedicine_type(type);
						medicine1.setMedicine_company(company);
						medicine1.setMedicine_cost(cost);
						medicine1.setMedicine_status(status);
						medicine1.setNurse(nurse);
						
						
						int success=-1;
						MedicineController medicineController=new MedicineController();
						try {
							success = medicineController.AddMedicine(medicine1);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(success !=-1)
						{
							JOptionPane.showMessageDialog(null, "Record of the medicine has been added.");
							textField_1.setText("");
							textField_3.setText("");
							textField_5.setText("");
							textField_2.setText("");
							textField_4.setText("");
							textField_6.setText("");
							btnNewButton_1_1.setEnabled(true);
						}
					}
				}
			
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 13));
		btnNewButton_1_1_1.setBounds(138, 408, 108, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblInformation = new JLabel("INFORMATION");
		lblInformation.setForeground(Color.BLACK);
		lblInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformation.setFont(new Font("Cambria", Font.BOLD, 25));
		lblInformation.setBounds(37, 138, 172, 45);
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
					textField_3.setEditable(false);
					textField_5.setEditable(false);
					textField_2.setEditable(false);
					textField_4.setEditable(false);
					textField_6.setEditable(false);
					textField.setEditable(true);
					btnNewButton.setEnabled(true);
					btnNewButton_1_1_1.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					btnNewButton_1_1.setEnabled(false);
					
				}
			}
		});
		btnNewButton_3.setBounds(526, 281, 142, 32);
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
				textField_6.setEditable(true);
				textField_1.setText("");
				textField_3.setText("");
				textField_5.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_6.setText("");
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_3.setEditable(true);
				textField_6.setEditable(true);
				
			}
		});
		btnNewButton_2.setBounds(526, 241, 142, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int idnum = 0;
					NurseMenu frame = new NurseMenu(idnum);
					frame.setVisible(true);
					dispose();
			}
		});
		btnBack.setBounds(10, 24, 89, 23);
		contentPane.add(btnBack);
		
		
		
		
		
		
		
		
	}
}
