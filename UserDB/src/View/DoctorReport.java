package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.util.ArrayList;

import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import com.itextpdf.awt.DefaultFontMapper;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

//import org.jfree.chart.plot;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

import Database.MyDatabase;
import Model.Treatment;
import Controller.TreatmentController;
import java.awt.Toolkit;
import javax.swing.SwingConstants;



public class DoctorReport extends JFrame {

	private JPanel contentPane;
	private DefaultPieDataset pieDataset;
	private JFreeChart pieChart;
	//private JFreeChart barChart;
	private PiePlot piePlot;
	private ChartPanel chartPanel;
	//private BarPanel barPanel;
	private ArrayList<Treatment> treats=new ArrayList<Treatment>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorReport frame = new DoctorReport();
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
	public DoctorReport() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\User\\Documents\\WhatsApp Image 2023-01-01 at 11.58.09.jpeg"));
		setTitle("DOCTOR REPORT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TREATMENT REPORT");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel.setBounds(240, 21, 260, 49);
		contentPane.add(lblNewLabel);
		
		
		//Create pie chart
		pieDataset=new DefaultPieDataset();
		TreatmentController treatCtrl = new TreatmentController();
		
		try {
			treats = treatCtrl.getTreatment();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for(Treatment treat: treats)
		{
			pieDataset.setValue(treat.getTreatment_name(), new Double(treat.getTreatment_price()));
		}
		
		pieChart=ChartFactory.createPieChart3D("Report", pieDataset, true, true, false);
		
		piePlot=(PiePlot) pieChart.getPlot();
		
		piePlot.setBackgroundPaint(new Color(204,204,255));
		
		
		chartPanel=new ChartPanel(pieChart);
		chartPanel.setDisplayToolTips(false);
		chartPanel.setBounds(151, 75, 442, 308);
		contentPane.add(chartPanel);
		
		//barPanel = new BarPanel(barChart);
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int idnum = 0;
					DoctorMenu frame = new DoctorMenu(idnum);
					frame.setVisible(true);
					dispose();
			}
		});
		btnNewButton.setBounds(10, 21, 89, 23);
		contentPane.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(547, 392, 133, 49);
		contentPane.add(btnNewButton_1);
	}
}
