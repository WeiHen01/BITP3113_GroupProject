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
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class PatientMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int idnum = 0;
					PatientMenu frame = new PatientMenu(idnum);
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
	public PatientMenu(int idnum2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("PATIENT MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(204, 102, 102));
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(-38, 0, 739, 442);
		contentPane.add(contentPane_1);
		
		JButton btnViewOwnRecord = new JButton("View Treatment");
		btnViewOwnRecord.setForeground(Color.BLACK);
		btnViewOwnRecord.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnViewOwnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientViewTreatment frame = new PatientViewTreatment();
				frame.setVisible(true);
				dispose();
			}
		});
		btnViewOwnRecord.setBounds(267, 110, 270, 57);
		contentPane_1.add(btnViewOwnRecord);
		
		JButton btnNewButton_1_1 = new JButton("Log out");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientLogin frame = new PatientLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(267, 246, 270, 57);
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnOwnAccount = new JButton("Own Account");
		btnOwnAccount.setForeground(Color.BLACK);
		btnOwnAccount.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnOwnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientAccount frame = new PatientAccount(idnum2);
				frame.setVisible(true);
				dispose();
			}
		});
		btnOwnAccount.setBounds(267, 178, 270, 57);
		contentPane_1.add(btnOwnAccount);
		
		JLabel lblPatientMenu = new JLabel("PATIENT MENU");
		lblPatientMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatientMenu.setForeground(Color.BLACK);
		lblPatientMenu.setFont(new Font("Cambria", Font.BOLD, 30));
		lblPatientMenu.setBounds(283, 42, 225, 42);
		contentPane_1.add(lblPatientMenu);
	}
}
