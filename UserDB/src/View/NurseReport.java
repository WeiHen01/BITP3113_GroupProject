package View;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.itextpdf.text.Document;
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

import Controller.PatientController;
import Model.Patient;
import java.awt.Toolkit;


public class NurseReport extends JFrame {

	private JPanel contentPane;
	private DefaultPieDataset pieDataset;
	private JFreeChart pieChart;
	private PiePlot piePlot;
	private ChartPanel chartPanel;
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NurseReport frame = new NurseReport();
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
	public NurseReport() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("NURSE REPORT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PATIENT REPORT ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(324, 11, 232, 49);
		contentPane.add(lblNewLabel);
		
		PatientController patientCtrl = new PatientController();
		pieDataset=new DefaultPieDataset();
		try {
			patients = new ArrayList<>();
			patients = patientCtrl.getPatientGender();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(Patient patient : patients)
		{
			pieDataset.setValue("M", new Integer(patient.getSumGenderM()));
			pieDataset.setValue("F", new Integer(patient.getSumGenderF()));
		}
		
		pieChart=ChartFactory.createPieChart3D("Number of Patient based on Gender", pieDataset, true, true, false);
		
		piePlot=(PiePlot) pieChart.getPlot();
		
		piePlot.setBackgroundPaint(new Color(204,204,255));
		
		StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(
				"{0} = {2}", new DecimalFormat("0"), new DecimalFormat("0.00%"));
		piePlot.setLabelGenerator(generator);
		
		chartPanel=new ChartPanel(pieChart);
		chartPanel.setDisplayToolTips(false);
		chartPanel.setBounds(116, 71, 615, 312);
		contentPane.add(chartPanel);
		
		JButton btnNewButton_1 = new JButton("EXPORT");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					
					PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(path));
					doc.open();
					
					PdfContentByte pdfContentByte = writer.getDirectContent();
					int width = 540;
					int height = 380;
					PdfTemplate pdfTemp = pdfContentByte.createTemplate(width, height);
					
					Graphics2D graphics = pdfTemp.createGraphics(width, height, new DefaultFontMapper());
					
					java.awt.geom.Rectangle2D rectangle = new java.awt.geom.Rectangle2D.Double(0, 0, 540, 380);
					pieChart.draw(graphics, rectangle);
					
					graphics.dispose();
					pdfContentByte.addTemplate(pdfTemp, 40, 450);
					doc.close();
				}
				catch(FileNotFoundException ex)
				{
					ex.printStackTrace();
				}
				catch(DocumentException ex)
				{
					ex.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "The report is saved!");
				
			}
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_1.setBounds(733, 394, 133, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idnum = 0;
				NurseMenu frame = new NurseMenu(idnum);
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
	}

}