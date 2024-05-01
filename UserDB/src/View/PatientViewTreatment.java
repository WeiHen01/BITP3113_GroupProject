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

import Controller.TreatmentController;
import Model.Treatment;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

public class PatientViewTreatment extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model; 
	private ArrayList<Treatment> treatments;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientViewTreatment frame = new PatientViewTreatment();
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
	public PatientViewTreatment() {
		setTitle("PATIENT VIEW TREATMENT");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("LIST OF ALL TREATMENT");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(308, 10, 304, 29);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 50, 852, 356);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Treatment ID", "Name", "Type", "Description", "Price"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(0).setMinWidth(6);
		table.getColumnModel().getColumn(1).setPreferredWidth(58);
		table.getColumnModel().getColumn(2).setPreferredWidth(99);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(205);
		table.getColumnModel().getColumn(4).setPreferredWidth(41);
		table.getColumnModel().getColumn(4).setMinWidth(41);
		scrollPane.setViewportView(table);
		
		btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int idnum = 0;
					PatientMenu frame = new PatientMenu(idnum);
					frame.setVisible(true);
					dispose();
			}
		});
		btnBack.setBounds(10, 10, 89, 23);
		contentPane.add(btnBack);
		
		TreatmentController treatController = new TreatmentController();
		
		try {
			treatments = new ArrayList<>();
			treatments = treatController.viewTreatment();
			System.out.println(treatments.size());
			
			DefaultTableModel temp = (DefaultTableModel) table.getModel();
			
			for(Treatment treatment : treatments ) {
		    	
		    	Object[] objs = {treatment.getTreatment_id(), treatment.getTreatment_name(), treatment.getTreatment_type(), treatment.getTreatment_description(), 
		    			treatment.getTreatment_price()};
		    	temp.addRow(objs);			
		    	
		    }	
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
