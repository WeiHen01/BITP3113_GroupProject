package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

import com.mysql.jdbc.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Database.MyDatabase;
import Model.Nurse;
import Model.Treatment;
import Controller.NurseController;
import Controller.TreatmentController;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

public class DoctorViewNurse extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model; 
	private ArrayList<Nurse> nurses;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorViewNurse frame = new DoctorViewNurse();
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
	public DoctorViewNurse() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR VIEW NURSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIST OF ALL NURSE");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(291, 11, 307, 54);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 76, 841, 329);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nurse ID", "Name", "Phone Number", "Email", "Address", "Username"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(0).setMinWidth(6);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(94);
		table.getColumnModel().getColumn(4).setPreferredWidth(282);
		table.getColumnModel().getColumn(4).setMinWidth(100);
		scrollPane.setViewportView(table);
		
		btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int idnum = 0;
					DoctorMenu frame = new DoctorMenu(idnum);
					frame.setVisible(true);
					dispose();
			}
		});
		btnBack.setBounds(10, 21, 89, 23);
		contentPane.add(btnBack);
		
		NurseController nurseController = new NurseController();
		
		try {
			nurses = new ArrayList<>();
			nurses = nurseController.viewNurse();
			System.out.println(nurses.size());
			
			DefaultTableModel temp = (DefaultTableModel) table.getModel();
			
			for(Nurse nurse : nurses ) {
		    	
		    	Object[] objs = {nurse.getNurse_id(), nurse.getNurse_name(), nurse.getNurse_nophone(), nurse.getNurse_email(), 
		    			nurse.getNurse_address(), nurse.getNurse_username()};
		    	temp.addRow(objs);			
		    	
		    }	
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}