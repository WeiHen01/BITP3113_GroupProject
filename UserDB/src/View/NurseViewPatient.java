package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.PatientController;
import Model.Nurse;
import Model.Patient;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;

public class NurseViewPatient extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model; 
	private ArrayList<Patient> patients;
	private JButton btnBack;
	private JLabel lblListOfAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NurseViewPatient frame = new NurseViewPatient();
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
	public NurseViewPatient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE VIEW PATIENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 50, 852, 356);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Patient ID", "Name", "Phone Number", "Email", "Address", "Username"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(0).setMinWidth(6);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(68);
		table.getColumnModel().getColumn(4).setPreferredWidth(282);
		table.getColumnModel().getColumn(4).setMinWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		btnBack = new JButton("BACK");
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
		btnBack.setBounds(10, 10, 89, 23);
		contentPane.add(btnBack);
		
		lblListOfAll = new JLabel("LIST OF ALL PATIENT");
		lblListOfAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblListOfAll.setForeground(Color.BLACK);
		lblListOfAll.setFont(new Font("Cambria", Font.BOLD, 25));
		lblListOfAll.setBounds(314, 11, 273, 33);
		contentPane.add(lblListOfAll);
		
		PatientController patientController = new PatientController();
		
		try {
			patients = new ArrayList<>();
			patients = patientController.viewPatient();
			System.out.println(patients.size());
			
			DefaultTableModel temp = (DefaultTableModel) table.getModel();
			
			for(Patient patient : patients ) {
		    	
		    	Object[] objs = {patient.getPatient_id(), patient.getPatient_name(), patient.getPatient_nophone(), patient.getPatient_email(), 
		    			patient.getPatient_address(), patient.getPatient_username()};
		    	temp.addRow(objs);			
		    	
		    }	
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
