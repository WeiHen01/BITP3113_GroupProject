package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class DoctorMenu extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int idnum = 0;
					DoctorMenu frame = new DoctorMenu(idnum);
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
	public DoctorMenu(int idcore) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nurse Data");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorControlNurse frame = new DoctorControlNurse();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(207, 98, 270, 57);
		contentPane.add(btnNewButton);
		
		JButton btnOwnAccount = new JButton("");
		btnOwnAccount.setIcon(new ImageIcon("D:\\User\\Documents\\doctor baru 1.png"));
		btnOwnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorAccount frame = new DoctorAccount(idcore);
				frame.setVisible(true);
				dispose();
			}
		});
		btnOwnAccount.setBounds(599, 20, 66, 57);
		contentPane.add(btnOwnAccount);
		
		JButton btnNewButton_1_1 = new JButton("LOGOUT");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorLogin frame = new DoctorLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(565, 88, 130, 35);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnViewTheNurse = new JButton("View Nurse");
		btnViewTheNurse.setForeground(Color.BLACK);
		btnViewTheNurse.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnViewTheNurse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorViewNurse frame = new DoctorViewNurse();
				frame.setVisible(true);
				dispose();
			}
		});
		btnViewTheNurse.setBounds(207, 166, 270, 57);
		contentPane.add(btnViewTheNurse);
		
		JButton btnTreatmentData = new JButton("Treatment Data");
		btnTreatmentData.setForeground(Color.BLACK);
		btnTreatmentData.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnTreatmentData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorControlTreatment frame = new DoctorControlTreatment();
				frame.setVisible(true);
				dispose();
			}
		});
		btnTreatmentData.setBounds(207, 234, 270, 57);
		contentPane.add(btnTreatmentData);
		
		JButton btnReport = new JButton("Treatment Report");
		btnReport.setForeground(Color.BLACK);
		btnReport.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorReport frame = new DoctorReport();
				frame.setVisible(true);
				dispose();
			}
		});
		btnReport.setBounds(207, 302, 270, 57);
		contentPane.add(btnReport);
		
		JLabel lblNewLabel = new JLabel("DOCTOR MENU");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNewLabel.setBounds(236, 30, 225, 42);
		contentPane.add(lblNewLabel);
	}
}
