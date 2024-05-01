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

public class LoginMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMain frame = new LoginMain();
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
	public LoginMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("LOGIN MAIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN PAGE");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Cambria", Font.BOLD, 25));
		lblLogin.setBounds(247, 66, 150, 29);
		contentPane.add(lblLogin);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\User\\Documents\\doctor baru.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorLogin frame = new DoctorLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(58, 146, 161, 138);
		contentPane.add(btnNewButton);
		
		JButton btnNurse = new JButton("");
		btnNurse.setIcon(new ImageIcon("D:\\User\\Documents\\nurse baru.png"));
		btnNurse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NurseLogin frame = new NurseLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNurse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNurse.setBounds(247, 146, 161, 138);
		contentPane.add(btnNurse);
		
		JButton btnPatient = new JButton("");
		btnPatient.setIcon(new ImageIcon("D:\\User\\Documents\\patient baru.png"));
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientLogin frame = new PatientLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPatient.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPatient.setBounds(437, 146, 161, 138);
		contentPane.add(btnPatient);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnBack.setBounds(467, 390, 161, 35);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("DOCTOR");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel.setBounds(102, 295, 78, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNurse = new JLabel("NURSE");
		lblNurse.setForeground(Color.BLACK);
		lblNurse.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNurse.setBounds(299, 295, 63, 29);
		contentPane.add(lblNurse);
		
		JLabel lblPatient = new JLabel("PATIENT");
		lblPatient.setForeground(Color.BLACK);
		lblPatient.setFont(new Font("Cambria", Font.BOLD, 18));
		lblPatient.setBounds(485, 295, 78, 29);
		contentPane.add(lblPatient);
	}
}
