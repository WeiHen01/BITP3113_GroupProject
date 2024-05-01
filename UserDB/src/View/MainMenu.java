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
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public MainMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("MAIN MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToDental = new JLabel("WELCOME TO");
		lblWelcomeToDental.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToDental.setForeground(Color.BLACK);
		lblWelcomeToDental.setFont(new Font("Cambria", Font.BOLD, 30));
		lblWelcomeToDental.setBounds(209, 36, 217, 35);
		contentPane.add(lblWelcomeToDental);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain frame = new LoginMain();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton.setBounds(230, 187, 161, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register frame = new Register();
				frame.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnNewButton_1.setBounds(230, 266, 161, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Cambria", Font.PLAIN, 18));
		btnExit.setBounds(468, 389, 161, 35);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("DENTAL MANAGEMENT SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNewLabel.setBounds(90, 88, 478, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\User\\Documents\\png-clipart-dentist-and-tooth-illustration-dentistry-human-tooth-cartoon-cartoon-tooth-cartoon-character-cartoon-arms-removebg-preview.png"));
		lblNewLabel_1.setBounds(22, 285, 198, 139);
		contentPane.add(lblNewLabel_1);
	}
}
