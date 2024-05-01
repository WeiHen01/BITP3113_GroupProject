package View;

import java.awt.EventQueue;

//library for create pdf
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

//library iText pdf that enable to generate report as pdf
import com.itextpdf.awt.DefaultFontMapper;
import com.itextpdf.awt.geom.Rectangle2D;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

//library for exporting chart to pdf
import java.awt.Graphics2D;

import com.mysql.jdbc.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.util.HashMap;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleConstants.FontConstants;

//date
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;

import Model.Payment;
import Controller.PaymentController;
import Model.Patient;
import Model.Medicine;
import Controller.MedicineController;
import Database.MyDatabase;

public class MakePaymentMedicine extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboBox;
	private JLabel label1;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakePaymentMedicine frame = new MakePaymentMedicine();
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
	public MakePaymentMedicine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("PAYMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(337, 11, 215, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Payment ID                      :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(37, 57, 162, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 13));
		textField.setBounds(186, 58, 139, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Payment Type   :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(464, 57, 106, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Payment Description   :");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(37, 97, 162, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(186, 99, 500, 27);
		contentPane.add(textField_1);
		
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Medicine ID                      :");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(37, 139, 162, 27);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Company                           :");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(37, 176, 147, 27);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 13));
		textField_2.setBounds(186, 175, 337, 28);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 51, 51));
		textField_3.setFont(new Font("Cambria", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(561, 405, 125, 28);
		contentPane.add(textField_3);
		textField_3.setEditable(false);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Total Amount : RM");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setFont(new Font("Cambria", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(433, 406, 156, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setMaximumRowCount(9999);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "cash", "debit card"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(568, 58, 118, 26);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "56001", "56002", "56003", 
				"56004", "56005", "56006", "56007", "56008", "56009", "56010"}));
		comboBox_1_1.setSelectedIndex(0);
		comboBox_1_1.setBounds(186, 137, 118, 27);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Medicine Type :");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(326, 137, 125, 27);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(425, 137, 261, 28);
		contentPane.add(textField_4);
		textField_4.setEditable(false);
		
		JLabel lblNewLabel_2 = new JLabel("Patient ID:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 17));
		lblNewLabel_2.setBounds(726, 53, 106, 27);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria", Font.PLAIN, 20));
		textField_5.setBounds(726, 84, 110, 40);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnPay = new JButton("PAY");
		btnPay.setForeground(Color.BLACK);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(textField.getText().trim());
				String payType = (String)comboBox_1.getSelectedItem();
				String describe = textField_1.getText().trim(); 
				int id2 = Integer.parseInt(textField_5.getText().trim());
				int numrow = table.getRowCount();
				double total = 0.00;
				
				Date date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				String dateAdd = formatter.format(date);
				
				for(int i=0; i < numrow; i++)
				{
					double value = Double.valueOf(table.getValueAt(i, 3).toString());
					total += value;
				}
				// Format total to 2 decimal places
				DecimalFormat df = new DecimalFormat("#.##");
				total = Double.valueOf(df.format(total));
				
				Payment pays1 = new Payment();
				pays1.setPayment_id(ID);
				pays1.setPayment_type(payType);
				pays1.setPayment_description(describe);
				pays1.setPayment_amount(total);
				pays1.setPayment_date(dateAdd);
				
				Patient patients = new Patient(id2);
				pays1.setPatients(patients);
				int success = -1; 
				
				PaymentController payControl = new PaymentController();
				try {
					success = payControl.insertPayment(pays1);
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(textField.getText().trim().equals("") || textField_1.getText().trim().equals("")  )
				{
					JOptionPane.showMessageDialog(null, "Please enter payment id and payment description!");
				}
				else
				{
					if(success == -1)
					{
						JOptionPane.showMessageDialog(null, "Unsuccessful payment!");
					}
					else
					{
						int input = JOptionPane.showConfirmDialog(null, "Successful pay! Do you want to print the receipt?");
						
						if(input == 0)
						{
							
							//export to pdf
							String path = " ";
							JFileChooser j = new JFileChooser();
							
							//select pdf file to view
							j.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
							int x = j.showSaveDialog(null);
							
							

							if(x == JFileChooser.APPROVE_OPTION)
							{
								File file = new File(j.getSelectedFile().getName() + ".pdf");
								path = j.getSelectedFile().getPath(); 
							}
							
							Document doc = new Document();
							
							try
							{
								PdfWriter.getInstance(doc, new FileOutputStream(path));
								
								doc.open();
								
								doc.add(new Paragraph("MEDICINE RECEIPT \n", FontFactory.getFont(FontFactory.TIMES_ROMAN, 25, Font.BOLD, BaseColor.BLUE)));
								doc.add(new Paragraph("Date: " + dateAdd));
								doc.add(new Paragraph("Patient ID: " + id2));
								doc.add(new Paragraph("Payment ID: " + ID));
								doc.add(new Paragraph("Payment Type: " + payType));
								doc.add(new Paragraph("\n"));
								
								
								//table to be included
								PdfPTable tb1 = new PdfPTable(4); //4 columns
								//BaseColor.<color> = text color in table
								PdfPCell cell = new PdfPCell(new Paragraph("Medicine Payment Query", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18)));
								cell.setHorizontalAlignment(Element.ALIGN_CENTER);
								cell.setColspan(4);
								cell.setBackgroundColor(BaseColor.PINK);
								tb1.addCell(cell);
								
								
								//HEADER
								PdfPCell cell1 = new PdfPCell(new Paragraph("Medicine ID", FontFactory.getFont(FontFactory.TIMES, 12, Font.BOLD)));
								cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
								cell1.setColspan(1);
								cell1.setBackgroundColor(BaseColor.YELLOW);
								tb1.addCell(cell1);
								
								PdfPCell cell2 = new PdfPCell(new Paragraph("Name", FontFactory.getFont(FontFactory.TIMES, 12, Font.BOLD)));
								cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
								cell2.setColspan(1);
								cell2.setBackgroundColor(BaseColor.YELLOW);
								tb1.addCell(cell2);
								
								PdfPCell cell3 = new PdfPCell(new Paragraph("Type", FontFactory.getFont(FontFactory.TIMES, 12, Font.BOLD)));
								cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
								cell3.setColspan(1);
								cell3.setBackgroundColor(BaseColor.YELLOW);
								tb1.addCell(cell3);
								
								PdfPCell cell4 = new PdfPCell(new Paragraph("Price", FontFactory.getFont(FontFactory.TIMES, 12, Font.BOLD)));
								cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
								cell4.setColspan(1);
								cell4.setBackgroundColor(BaseColor.YELLOW);
								tb1.addCell(cell4);
								
								//Adding header
								/*
								 * tb1.addCell("Treatment ID"); tb1.addCell("Name"); tb1.addCell("Type");
								 * tb1.addCell("Price");
								 */
								
								
								double amount = 0.00;
								
								for (int i = 0; i < table.getRowCount(); i++)
								{
									
									String TID = table.getValueAt(i, 0).toString();
									String Tname = table.getValueAt(i, 1).toString();
									String Ttype = table.getValueAt(i, 2).toString();
									String Tprice = table.getValueAt(i, 3).toString();
									double value = Double.valueOf(table.getValueAt(i, 3).toString());
									amount += value;
									
									tb1.addCell(TID);
									tb1.addCell(Tname);
									tb1.addCell(Ttype);
									tb1.addCell(Tprice);
								}
								
								doc.add(tb1);
								
								doc.add(new Paragraph("The total price is: RM" + amount));
								
							}
							catch(FileNotFoundException ex)
							{
								ex.printStackTrace();
							}
							catch(DocumentException ex)
							{
								ex.printStackTrace();
							}

							doc.close();
							JOptionPane.showMessageDialog(null, "The receipt is saved!");
						}
						
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						int rowsToRemove = model.getRowCount();
						for(int i = rowsToRemove - 1; i >= 0; i--)
						{
							model.removeRow(i);
						}
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						comboBox_1.setSelectedIndex(0);
						comboBox_1_1.setSelectedIndex(0);
						btnPay.setEnabled(false);
						
					}
					
				
				
				}
				
			}
		});
		btnPay.setFont(new Font("Cambria", Font.BOLD, 25));
		btnPay.setBounds(719, 391, 113, 50);
		contentPane.add(btnPay);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numrow = table.getRowCount();
				double total = 0.00;
				btnPay.setEnabled(true);
				for(int i=0; i < numrow; i++)
				{
					double value = Double.valueOf(table.getValueAt(i, 3).toString());
					total += value;
					// Format total to 2 decimal places
					DecimalFormat df = new DecimalFormat("#.##");
					total = Double.valueOf(df.format(total));
				}
				textField_3.setText(Double.toString(total));
				
			}
			
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnNewButton.setBounds(37, 395, 113, 39);
		contentPane.add(btnNewButton);
		
				
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				//if single row is selected
				if(table.getSelectedRowCount() == 1)
				{
					model.removeRow(table.getSelectedRow());
				}
				//
				else
				{
					if(table.getRowCount() == 0)
					{
						//if table is empty no data
						JOptionPane.showMessageDialog(null, "Table is empty!");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please select a single row");
					}
					
				}
					
				
			}
		});
		btnDelete.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnDelete.setBounds(719, 268, 113, 32);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int input = JOptionPane.showConfirmDialog(null, "Do you want to clear record?");
				//0 = yes, 1 = no, 2 = cancel
				if(input == 0)
				{
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int rowsToRemove = model.getRowCount();
					
					if(rowsToRemove == 0)
					{
						JOptionPane.showMessageDialog(null, "The table already empty!");
					}
					else
					{
						for(int i = rowsToRemove - 1; i >= 0; i--)
						{
							model.removeRow(i);
						}
						textField_3.setText("");
					}
				}
			}
		});
		btnClear.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnClear.setBounds(719, 311, 113, 32);
		contentPane.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 214, 649, 174);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Type", "Price"
			}
			
		));
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				int id = Integer.parseInt((String)comboBox_1_1.getSelectedItem());
				
				Medicine medics = new Medicine();
				medics.setMedicine_id(id);
				
				MedicineController medicController = new MedicineController();
				Medicine medic = new Medicine();
				
				try {
					medic = medicController.SearchMedicine(medics);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				//if the record is found
				if(medic != null)
				{
					model.addRow(new Object[] {medic.getMedicine_id(), medic.getMedicine_name(), medic.getMedicine_type(), medic.getMedicine_cost()});
					btnAdd.setEnabled(false);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "The treatment does not exist!");
		
				}
			}
		});
		btnAdd.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnAdd.setBounds(719, 225, 113, 32);
		contentPane.add(btnAdd);
		
		btnAdd.setEnabled(false);
		btnDelete.setEnabled(false);
		btnClear.setEnabled(false);
		btnPay.setEnabled(false);
		
		MedicineController medicController = new MedicineController();
		try {
			textField.setEditable(false);
			textField.setText("70" + Integer.toString(medicController.getLatestId() + 1));
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if there is no input in the text field
					int id = Integer.parseInt((String)comboBox_1_1.getSelectedItem());
					Medicine medics = new Medicine();
					medics.setMedicine_id(id);
					
					MedicineController medicController = new MedicineController();
					Medicine meds = new Medicine();
					
					if(textField.getText().trim().equals("") || textField_1.getText().trim().equals("") || comboBox_1.getSelectedIndex() == -1 || comboBox_1_1.getSelectedIndex() == -1)
					{
						JOptionPane.showMessageDialog(null, "Please enter payment id and payment description!");
					}
					else
					{
						try {
							
							meds = medicController.SearchMedicine(medics);
				
							
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					//if the record is found
					if(meds != null)
						{
							textField_4.setText(meds.getMedicine_type());
							textField_2.setText(meds.getMedicine_company());
							btnAdd.setEnabled(true);
							btnDelete.setEnabled(true);
							btnClear.setEnabled(true);
						}
					
					else 
					{
						JOptionPane.showMessageDialog(null, "The nurse does not exist!");
			
					}
						
				}
		});
		btnSearch.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnSearch.setBounds(573, 173, 113, 32);
		contentPane.add(btnSearch);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idnum = 0;
				NurseMenu frame = new NurseMenu(idnum);
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton_1.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}
		
		
		
		
	


