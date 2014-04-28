import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Date;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.DefaultFontMapper;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import javax.swing.JProgressBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;


public class PreviewGUI {

	private static JFrame frmPreviewGUI;
	private static JEditorPane editorPane;
	private JScrollPane scrollPane;	
	private static int inch;
	private static float pixelToPoint;	
	private static PdfContentByte cb;
	private static com.lowagie.text.pdf.PdfTemplate tp;
	private static Document document;
	private static FileOutputStream fos;
	private static  Graphics2D g2;
	private static PdfWriter writer;
	
	protected com.lowagie.text.pdf.FontMapper fontMapper;
	private JButton btnBack;
	private JButton btnExportCsv;
	/**
	 * Launch the application.
	 */
	
	public static void run() {
		try {
			PreviewGUI window = new PreviewGUI();
			PreviewGUI.frmPreviewGUI.setVisible(true);
			//frmPreviewGUI.setLocationRelativeTo(MainMenuGUI.frmEquipmentPurchases);
		} catch (Exception e) {
		e.printStackTrace();
	}

	}

	/**
	 * Create the application.
	 */
	public PreviewGUI() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPreviewGUI = new JFrame();
		frmPreviewGUI.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				ReportGUI.frmReportGenerator.dispose();
				ReportGUI.run();
			}
		});
		frmPreviewGUI.setTitle("Preview Report");
		//frmPreviewGUI.setBounds(100, 100, 2006, 1060);
		frmPreviewGUI.setSize(2006,1060);
		frmPreviewGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmPreviewGUI.setLocationRelativeTo(null);
		frmPreviewGUI.getContentPane().setLayout(null);
		frmPreviewGUI.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(10, 11, 1650, 950);
		frmPreviewGUI.getContentPane().add(scrollPane);
		
		editorPane = new JEditorPane();
		editorPane.setEditable(false);
		scrollPane.setViewportView(editorPane);
		editorPane.setContentType("text/html");
				
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(PreviewGUI.class.getResource("/pdfIcon_128x111.png")));
		btnNewButton.setToolTipText("Generate PDF");
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {				
				SaveToPDF();
			}
		});
		btnNewButton.setBounds(1686, 170, 128, 128);
		frmPreviewGUI.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(PreviewGUI.class.getResource("/004244-3d-glossy-blue-orb-icon-arrows-arrow-redirect-left1-ps_128x128.png")));
		btnBack.setToolTipText("Back");
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPreviewGUI.dispose();
				
			}
		});
		btnBack.setBounds(1686, 833, 128, 128);
		frmPreviewGUI.getContentPane().add(btnBack);
		
		btnExportCsv = new JButton("");
		btnExportCsv.setIcon(new ImageIcon(PreviewGUI.class.getResource("/csv-text_128x128.png")));
		btnExportCsv.setToolTipText("Export CSV");
		btnExportCsv.setBackground(SystemColor.activeCaptionText);
		btnExportCsv.setOpaque(false);
		btnExportCsv.setContentAreaFilled(false);
		btnExportCsv.setBorderPainted(false);
		
		
		btnExportCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExportToCSV(ReportGUI.repListModel);
			}
		});
		btnExportCsv.setBounds(1686, 22, 128, 111);
		frmPreviewGUI.getContentPane().add(btnExportCsv);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PreviewGUI.class.getResource("/enengineering_transparent_444x67.png")));
		label.setToolTipText("EN Engineering");
		label.setBounds(628, 974, 452, 57);
		frmPreviewGUI.getContentPane().add(label);
	}
	
	public static void ExportToCSV(DefaultListModel<Report> repListModel)
	{
		JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("Save File");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "CSV", "CSV");
		jfc.setFileFilter(filter);
		
		int result = jfc.showSaveDialog(jfc);
		if (result == JFileChooser.CANCEL_OPTION)
		{
		    return;
		}
	
		File file = jfc.getSelectedFile();				
		String csvFilepath = file.getAbsolutePath() + ".csv";
		
		try {
			FileWriter writer = new FileWriter(csvFilepath);
			writer.append("Project");
			writer.append(',');
			writer.append("ProjectNumber");
			writer.append(',');
			writer.append("PartNumber");
			writer.append(',');
			writer.append("Description");
			writer.append(',');
			writer.append("Vendor");
			writer.append(',');
			writer.append("VendorQuote");
			writer.append(',');
			writer.append("Quantity");
			writer.append(',');
			writer.append("Comments");
			writer.append(',');
			writer.append("OrderSubmitted");
			writer.append(',');
			writer.append("OrderSubmittedDate");
			writer.append(',');
			writer.append("OrderReceived");
			writer.append(',');
			writer.append("OrderReceivedDate");
			writer.append(',');
			writer.append("POCode");
			writer.append(',');
			writer.append("POSubmitted");
			writer.append(',');
			writer.append("POSubmittedDate");
			writer.append(',');
			writer.append("Shipper");
			writer.append(',');
			writer.append("TrackingNumber");
			writer.append('\n');

			for (int i = 0; i < repListModel.getSize(); i++)
			{
				
				String proj = repListModel.getElementAt(i).getproject();
				String projnum = repListModel.getElementAt(i).getprojectnumber();
				String partnum = repListModel.getElementAt(i).getpartnumber();
				String desc = repListModel.getElementAt(i).getdescription();
				String vendor = repListModel.getElementAt(i).getvendor();
				String vendorquote = repListModel.getElementAt(i).getvendor_quote();
				String quantity = repListModel.getElementAt(i).getquantity();
				String comments = repListModel.getElementAt(i).getcomments();
				String ordersubmitted = repListModel.getElementAt(i).getordersubmitted();
				String ordersubmitteddate = repListModel.getElementAt(i).getordersubmitteddate();
				String orderreceived = repListModel.getElementAt(i).getorderreceived();
				String orderreceiveddate = repListModel.getElementAt(i).getorderreceiveddate();
				String pocode = repListModel.getElementAt(i).getpocode();
				String posubmitted = repListModel.getElementAt(i).getposubmitted();
				String posubmitteddate = repListModel.getElementAt(i).getposubmitteddate();
				String shipper = repListModel.getElementAt(i).getshipper();
				String trackingnumber = repListModel.getElementAt(i).gettrackingnumber();
				
				if (ordersubmitted.compareTo("1") == 0)
				{
					ordersubmitted = "Yes";
				}
				else
				{
					ordersubmitted = "No";
				}
				if (orderreceived.compareTo("1") == 0)
				{
					orderreceived = "Yes";
				}
				else
				{
					orderreceived = "No";
				}
				if (posubmitted.compareTo("1") == 0)
				{
					posubmitted = "Yes";
				}
				else
				{
					posubmitted = "No";
				}
				
					writer.append(proj);
					writer.append(',');
					writer.append(projnum);
					writer.append(',');
					writer.append(desc);
					writer.append(',');
					writer.append(vendor);
					writer.append(',');
					writer.append(vendorquote);
					writer.append(',');
					writer.append(quantity);
					writer.append(',');
					writer.append(comments);
					writer.append(',');
					writer.append(ordersubmitted);
					writer.append(',');
					writer.append(ordersubmitteddate);
					writer.append(',');
					writer.append(orderreceived);
					writer.append(',');
					writer.append(orderreceiveddate);
					writer.append(',');
					writer.append(pocode);
					writer.append(',');
					writer.append(posubmitted);
					writer.append(',');
					writer.append(posubmitteddate);
					writer.append(',');
					writer.append(shipper);
					writer.append(',');
					writer.append(trackingnumber);
					writer.append(',');
					writer.append('\n');
			}
				
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "CSV Created Successfully");
		
	}
	
		
	public static void SaveToPDF()
	{
		JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("Save File");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "PDF", "PDF");
		jfc.setFileFilter(filter);
		
		int result = jfc.showSaveDialog(jfc);
		if (result == JFileChooser.CANCEL_OPTION)
		{
		    return;
		}
		
		File file = jfc.getSelectedFile();				
		String pdfFilepath = file.getAbsolutePath() + ".pdf";
		JOptionPane.showMessageDialog(null, "Creating PDF. This may take a few minutes...");
		paintToPDF(editorPane, pdfFilepath);
		
	}


	public static void GeneratePreview(DefaultListModel<Report> repListModel, String title) {
		run();
		String fontcolor = ReportGUI.font;
		String fontsize = ReportGUI.fontsize;		
		String fontname = ReportGUI.fontname;
		String fontcolor1 = ReportGUI.fontcolor1;
		String fontweight2 = ReportGUI.fontweight2;
		String headersize = ReportGUI.headersize;
		String headerfont = ReportGUI.headerfont;
		String headerfontcolor = ReportGUI.headerfontcolor;
		String headerweight2 = ReportGUI.headerweight2;
		
		
		String titlesize = ReportGUI.titlesize;
		
		String titlefont = ReportGUI.titlefont;
		String titlecolor = ReportGUI.titlecolor;
		String titleweight2 = ReportGUI.titleweight2;
		
		inch = Toolkit.getDefaultToolkit().getScreenResolution();
		pixelToPoint = (float) 94 / (float) inch;
		Date currentdate = new Date();
		editorPane.setFont(null);
		String formatDate = "<table border=\"0\" style=\"color: " + fontcolor + ";width:100%\"><tr><td style=\"font-size: 10px;text-align: right;\"> " + currentdate + "</td></tr>";
		String formatTitle = "<tr><td style=\"color: " + titlecolor + ";text-align:center;font-face:" + titlefont + ";" + titleweight2 + ";font-size:" + titlesize + "px; \"> " + title + "</td></tr></table>";
		String formatHeader1 = "<table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"><tr style=\"font-size: " + headersize + "px;color:" + headerfontcolor +";text-align:center;" + headerweight2 + "\"><td>Project</td><td>Project #</td><td>Part #</td><td>Description</td><td>Vendor</td><td>Vendor Quote #</td><td>Quantity</td><td>Comments</td><td>Order Submitted</td></tr>";
		String formatHeader2 = "<tr style=\"font-size: " + headersize + "px;color:" + headerfontcolor +";text-align:center;" + headerweight2 + "\"><td></td><td>Order Submit Date</td><td>Order Received</td><td>Order Received Date</td><td>PO Code</td><td>PO Submitted</td><td>PO Submitted Date</td><td>Shipper</td><td>Tracking Number</td></tr>";
		Boolean flag = false;
		
		String data1="";
		String data2="";
		String combineData = "";
		String proj = "";
		String projnum = "";
		String partnum = "";
		String desc = "";
		String vendor = "";
		String vendorquote = "";
		String quantity = "";
		String comments = "";
		String ordersubmitted = "";
		String ordersubmitteddate = "";
		String orderreceived = "";
		String orderreceiveddate = "";
		String pocode = "";
		String posubmitted = "";
		String posubmitteddate = "";
		String shipper = "";
		String trackingnumber = "";
		String backgroundcolor = "";
		
		for (int i = 0; i < repListModel.getSize(); i++)
		{
			if (flag == false)
			{
				backgroundcolor = ReportGUI.color1;
				flag = true;
			}
			else
			{
				backgroundcolor = ReportGUI.color2;
				flag = false;				
			}
			proj = repListModel.getElementAt(i).getproject();
			projnum = repListModel.getElementAt(i).getprojectnumber();
			partnum = repListModel.getElementAt(i).getpartnumber();
			desc = repListModel.getElementAt(i).getdescription();
			vendor = repListModel.getElementAt(i).getvendor();
			vendorquote = repListModel.getElementAt(i).getvendor_quote();
			quantity = repListModel.getElementAt(i).getquantity();
			comments = repListModel.getElementAt(i).getcomments();
			ordersubmitted = repListModel.getElementAt(i).getordersubmitted();
			ordersubmitteddate = repListModel.getElementAt(i).getordersubmitteddate();
			orderreceived = repListModel.getElementAt(i).getorderreceived();
			orderreceiveddate = repListModel.getElementAt(i).getorderreceiveddate();
			pocode = repListModel.getElementAt(i).getpocode();
			posubmitted = repListModel.getElementAt(i).getposubmitted();
			posubmitteddate = repListModel.getElementAt(i).getposubmitteddate();
			shipper = repListModel.getElementAt(i).getshipper();
			trackingnumber = repListModel.getElementAt(i).gettrackingnumber();
			
			if (ordersubmitted.compareTo("1") == 0)
			{
				ordersubmitted = "Yes";
			}
			else
			{
				ordersubmitted = "No";
			}
			if (orderreceived.compareTo("1") == 0)
			{
				orderreceived = "Yes";
			}
			else
			{
				orderreceived = "No";
			}
			if (posubmitted.compareTo("1") == 0)
			{
				posubmitted = "Yes";
			}
			else
			{
				posubmitted = "No";
			}
			
			data1 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + proj + "</td><td>" + projnum + "</td><td>" + partnum + "</td><td>" + desc + "</td><td>" + vendor+ "</td><td>" + vendorquote+ "</td><td>" + quantity + "</td><td>" + comments+ "</td><td>" + ordersubmitted + "</td></tr>";
			data2 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"</td><td>" + orderreceived+ "</td><td>" + orderreceiveddate+ "</td><td>" + pocode+ "</td><td>" + posubmitted+ "</td><td>" + posubmitteddate+ "</td><td>" + shipper+ "</td><td>" + trackingnumber + "</td></tr>";
			combineData += data1 + data2;
		}
		String reportGen = formatDate + formatTitle + formatHeader1 + formatHeader2 + combineData + "</table>";
		editorPane.setText(reportGen);
		
	}
	
	
	
	public static void paintToPDF(JEditorPane ta, String filepath) {
	
	    try {
	      
		  DefaultFontMapper mapper = new DefaultFontMapper();
		  BaseFont bf = BaseFont.createFont();
		  mapper.insertDirectory("c:/windows/fonts");    
	      AffineTransform at = new AffineTransform();
	      at.translate(convertToPixels(20), convertToPixels(20));
	      at.scale(pixelToPoint, pixelToPoint);
	      double tmp_pages = (editorPane.getHeight() / 1000.00);	      
	      double pages = Math.ceil(tmp_pages);	      
		  int vpos = 1000;
			for (int i = 1; i <= pages; i++)
			{
				if (i == 1)
				{
					document = new Document();		     
					fos = new FileOutputStream(filepath);				
					writer = PdfWriter.getInstance(document, fos);				
					document.setPageSize(new com.lowagie.text.Rectangle(1650, 1000));		
					document.open();
				}
				else
				{
					document.newPage();
				}
				cb = writer.getDirectContentUnder();
			    tp = cb.createTemplate(1650, vpos);
			    g2 = tp.createGraphicsShapes(1650, vpos);
			    
				cb.saveState();    
				
				cb.beginText();
				cb.setTextMatrix(825, 7);
				cb.setFontAndSize(bf, 12);
				cb.showText("Page #" + i);
				cb.endText();
		   
		      g2.transform(at);

		      g2.setColor(Color.WHITE);
		      g2.fill(ta.getBounds());		     
		      Rectangle alloc = getVisibleEditorRect(ta);
		      ta.getUI().getRootView(ta).paint(g2, alloc);
		      
		      cb.addTemplate(tp, 0, 29);

		      g2.dispose();
		      cb.restoreState();
		      if (i == 1)
		      {
		      vpos += 970;
		      }
		      else
		      {
		    	  vpos += 965;
		      }
		      
		     
			}
			
	      document.close();
	      fos.flush();
	      fos.close();
	      JOptionPane.showMessageDialog(null, "PDF Created Successfully!");
	      frmPreviewGUI.dispose();
	    } catch (Exception e) {
	     JOptionPane.showMessageDialog(null, "There was an error creating the PDF.");
	      e.printStackTrace();
	    }
	  }

	
	  public float convertToPoints(int pixels) {
	    return pixels * pixelToPoint;
	  }

	  public static float convertToPixels(int points) {
	    return points / pixelToPoint;
	  }

	  protected static Rectangle getVisibleEditorRect(JEditorPane ta) {
	    Rectangle alloc = ta.getBounds();
	    if ((alloc.width > 0) && (alloc.height > 0)) {
	      alloc.x = alloc.y = 0;
	      Insets insets = ta.getInsets();
	      alloc.x += insets.left;
	      alloc.y += insets.top;
	      alloc.width -= insets.left + insets.right;
	      alloc.height -= insets.top + insets.bottom;
	      return alloc;
	    }
	    return null;
	  }
	}


