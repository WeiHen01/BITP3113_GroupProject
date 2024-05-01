package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class NurseMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int idnum = 0;
					NurseMenu frame = new NurseMenu(idnum);
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
	public NurseMenu(int num) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewPatient = new JButton("View Patient");
		btnViewPatient.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnViewPatient.setForeground(Color.BLACK);
		btnViewPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseViewPatient frame = new NurseViewPatient();
				frame.setVisible(true);
				dispose();
			}
		});
		btnViewPatient.setBounds(356, 143, 240, 48);
		contentPane.add(btnViewPatient);
		
		JButton btnPaymentMedicine = new JButton("Payment of Medicine");
		btnPaymentMedicine.setForeground(Color.BLACK);
		btnPaymentMedicine.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnPaymentMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakePaymentMedicine frame = new MakePaymentMedicine();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPaymentMedicine.setBounds(68, 218, 240, 48);
		contentPane.add(btnPaymentMedicine);
		
		JButton btnNewButton_1_1 = new JButton("LOGOUT");
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseLogin frame = new NurseLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(602, 91, 115, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnOwnAccount = new JButton("");
		btnOwnAccount.setIcon(new ImageIcon("D:\\User\\Documents\\nurse baru 1.png"));
		btnOwnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseAccount frame = new NurseAccount(num);
				frame.setVisible(true);
				dispose();
			}
		});
		btnOwnAccount.setBounds(629, 23, 66, 57);
		contentPane.add(btnOwnAccount);
		
		JButton btnPatientData = new JButton("Patient Data");
		btnPatientData.setForeground(Color.BLACK);
		btnPatientData.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnPatientData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseControlPatient frame = new NurseControlPatient();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPatientData.setBounds(68, 143, 240, 48);
		contentPane.add(btnPatientData);
		
		JButton btnReport = new JButton("Patient Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseReport frame = new NurseReport();
				frame.setVisible(true);
				dispose();
			}
		});
		btnReport.setForeground(Color.BLACK);
		btnReport.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnReport.setBounds(356, 288, 240, 48);
		contentPane.add(btnReport);
		
		JButton btnPaymentTreatment = new JButton("Payment of Treatment");
		btnPaymentTreatment.setForeground(Color.BLACK);
		btnPaymentTreatment.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnPaymentTreatment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakePaymentTreatment frame = new MakePaymentTreatment();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPaymentTreatment.setBounds(356, 218, 240, 48);
		contentPane.add(btnPaymentTreatment);
		
		JButton btnMedicineData = new JButton("Medicine Data");
		btnMedicineData.setForeground(Color.BLACK);
		btnMedicineData.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnMedicineData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseControlMedicine frame = new NurseControlMedicine();
				frame.setVisible(true);
				dispose();
			}
		});
		btnMedicineData.setBounds(68, 288, 240, 48);
		contentPane.add(btnMedicineData);
		
		JLabel lblNurseMenu = new JLabel("NURSE MENU");
		lblNurseMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNurseMenu.setForeground(Color.BLACK);
		lblNurseMenu.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNurseMenu.setBounds(214, 60, 225, 42);
		contentPane.add(lblNurseMenu);
	}

}
