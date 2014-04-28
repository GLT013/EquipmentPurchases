import it.cnr.imaa.essi.lablib.gui.checkboxtree.CheckboxTree;
import it.cnr.imaa.essi.lablib.gui.checkboxtree.TreeCheckingModel;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.toedter.calendar.JDateChooser;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import sun.invoke.util.Wrapper;

public class ReportGUI {


	public static JFrame frmReportGenerator;
	private static CheckboxTree tree;
	private static JList<Report> repList;
	public static DefaultListModel<Report> repListModel;
	public static Report rep;
	private static JDateChooser StartDate;
	private static JDateChooser EndDate;
	private static JTextField txtReportTitle;
	private static JCheckBox chckbxOrderSubmitted;
	private static JCheckBox chckbxOrderReceived;
	private static boolean ordersub; 
	private static boolean orderrec; 
	private static JComboBox comboBox;
	private static JCheckBox chckBoxPOSubmitted;
	private static boolean posub;
	private static JTable repTable;
	private static Color color;
	private static JButton btnFirstColor;
	private static JButton btnSecondColor;
	public static String color1 = "#b6cbe2";
	public static String color2 = "#cccccc";
	public static String font = "#000000";
	public static String titlecolor = "#cccccc";
	private static java.sql.Connection c;
	private static java.sql.PreparedStatement stmt;
	private static String OrderBy1;
	private static String OrderBy2;
	private static String OrderBy3;
	private static JComboBox comboBox_1;
	private static JComboBox comboBox_2;
	private static JEditorPane editorPane;
	private static JButton btnExpand;
	private static JButton btnHide;
	private static JButton btnReset;
	public static String titlefont;
	public static String titlesize;
	public static String title2;
	public static String titleweight2;
	public static String headersize;
	public static String headerfontcolor;
	public static String headerweight2;
	public static String fontsize;
	public static String fontcolor1;
	public static String backgroundcolor;
	public static String backgroundcolor2;
	public static String fontweight2;
	public static String fontname;
	public static String headerfont;
	private static JScrollPane scrollPane;
	public static TreePath[] help;
	public static TreePath[] tmp = null;
	public static boolean ReportGUI = false;
	/**
	 * Launch the application.
	 */
	public static void run()
	{
	if(ConnectToAccess.Connect(DatabaseSettings.filepath) == false)
	{
		JOptionPane.showMessageDialog(null, "Unable to connect to Access Database.");		
		//return;
	}
	try {
		ReportGUI window = new ReportGUI();
		window.frmReportGenerator.setVisible(true);
		frmReportGenerator.setLocationRelativeTo(MainMenuGUI.frmEquipmentPurchases);			
		
	} catch (Exception e) {
		e.printStackTrace();
	}				
		PopulateCheckboxTree();
		PreviewPane();
	}

	/**
	 * Create the application.
	 */
	public ReportGUI() {
		initialize();
	}
	
	public static void PreviewPane()
	{
		txtReportTitle.getText();
		title2 = txtReportTitle.getText();
		backgroundcolor = color1;
		backgroundcolor2 = color2;
		fontsize = ChooseFont.ReportSize;
		int fontweight = ChooseFont.ReportWeight;
		fontname = ChooseFont.ReportFont;
		fontcolor1 = ChooseFont.ReportColor;
		fontweight2 = null;
		if (fontweight == 0)
		{
			fontweight2 = "font-weight: normal;";
		}
		else if (fontweight == 1)
		{
			fontweight2 = "font-weight: bold;";
		}
		else if (fontweight == 2)
		{
			fontweight2 = "font-style: italic;";
		}
		
		
		headersize = ChooseHeaderFont.HeaderSize;
		int headerweight = ChooseHeaderFont.HeaderWeight;
		headerfont = ChooseHeaderFont.HeaderFont;
		headerfontcolor = ChooseHeaderFont.HeaderColor;
		headerweight2 = "font-weight: bold;";
		if (headerweight == 0)
		{
			headerweight2 = "font-weight: normal;";
		}
		else if (headerweight == 1)
		{
			headerweight2 = "font-weight: bold;";
		}
		else if (headerweight == 2)
		{
			headerweight2 = "font-style: italic;";
		}
		
		
		titlesize = ChooseTitleFont.TitleSize;
		int titleweight = ChooseTitleFont.TitleWeight;
		titlefont = ChooseTitleFont.TitleFont;
		titlecolor = ChooseTitleFont.TitleColor;
		titleweight2 = null;
		
		if (titleweight == 0)
		{
			titleweight2 = "font-weight: normal";
		}
		else if (titleweight == 1)
		{
			titleweight2 = "font-weight: bold";
		}
		else if (titleweight == 2)
		{
			titleweight2 = "font-style: italic";
		}		
		
		UpdatePreviewPane();
	}
	
	public static void GenerateReport()
	{
		TreePath[] tp = tree.getCheckingPaths();		
		int length = tp.length;	
		String RootNode;
		String ProjectNode;
		String ProjectNumNode;
		repListModel = new DefaultListModel<Report>();
		Date start = StartDate.getDate();
		String start2 = String.format("%1$tm/%1$td/%1$tY", start);
		Date end = EndDate.getDate();
		String end2 = String.format("%1$tm/%1$td/%1$tY", end);		
		ordersub = chckbxOrderSubmitted.isSelected();
		orderrec = chckbxOrderReceived.isSelected();
		posub = chckBoxPOSubmitted.isSelected();
		String commandText = "";
		try{			
			 DriverManager.registerDriver(new org.h2.Driver());
		        c = DriverManager.getConnection("jdbc:h2:mem:test");
		        stmt = c.prepareStatement("CREATE TABLE TEMP (Project TEXT,ProjectNumber TEXT,PartNumber TEXT,Description TEXT,Vendor TEXT," +
		        		"VendorQuote TEXT,CostfromSupplier TEXT,Quantity TEXT,Comments TEXT,OrderSubmitted TEXT,OrderSubmittedDate TEXT,OrderReceived TEXT,OrderReceivedDate TEXT," +
		        		"POCode TEXT,POSubmitted TEXT,POSubmittedDate TEXT,Shipper TEXT,TrackingNumber TEXT)");	        
		        stmt.execute();	        
		        stmt.close();
		      
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}


		
		for (int i = 0; i < length; i++)
		{
			String[] splits = null;
			try
			{
			splits = tp[i].toString().split(",");
			RootNode = splits[0].toString().substring(1,splits[0].toString().length()-1);
			}
			catch(Exception e)
			{
				
			}
			try
			{
			ProjectNode = splits[1].toString().substring(1,splits[1].toString().length());
			}
			catch(Exception e)
			{
				ProjectNode = null;
			}
			if (ProjectNode == null)
			{
				// do nothing
			}
			try
			{
				ProjectNumNode = splits[2].toString().substring(1,splits[2].toString().length()-1);				
			}
			catch(Exception e)
			{
				ProjectNumNode = null;
			}
			
			if (ProjectNumNode == null)
			{
				//do nothing
			}
			
			else
			{
				if ((start == null) && (end == null))
				{
					if ((ordersub == true) && (orderrec == true) && (posub == true))				
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmitted=YES AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true) && (orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmitted=YES AND OrderReceived=YES";				
					}
					else if ((ordersub == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmitted=YES AND POSubmitted=YES";				
					}
					else if ((orderrec == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmitted=YES";				
					}
					else if ((orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "OrderReceived=YES";				
					}
					else if ((posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND POSubmitted=YES";				
					}
					else
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode;	
					}
				}
				else if (start == null)
				{
					if ((ordersub == true) && (orderrec == true) && (posub == true))				
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true) && (orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES AND OrderReceived=YES";				
					}
					else if ((ordersub == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES AND POSubmitted=YES";				
					}
					else if ((orderrec == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES";				
					}
					else if ((orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#" + "OrderReceived=YES";				
					}
					else if ((posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND POSubmitted=YES";				
					}
					else
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + "AND OrderSubmittedDate <=" + "#" + end2 + "#";	
					}
				}
				else if (end == null)
				{
					if ((ordersub == true) && (orderrec == true) && (posub == true))				
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND OrderSubmitted=YES AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true) && (orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND OrderSubmitted=YES AND OrderReceived=YES";				
					}
					else if ((ordersub == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND OrderSubmitted=YES AND POSubmitted=YES";				
					}
					else if ((orderrec == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND OrderSubmitted=YES";				
					}
					else if ((orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND OrderReceived=YES";				
					}
					else if ((posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + "AND POSubmitted=YES";				
					}
					else
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#";	
					}
				}
				else
				{
					if ((ordersub == true) && (orderrec == true) && (posub == true))				
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true) && (orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES AND OrderReceived=YES";				
					}
					else if ((ordersub == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES AND POSubmitted=YES";				
					}
					else if ((orderrec == true) && (posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderReceived=YES AND POSubmitted=YES";
					}
					else if ((ordersub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND OrderSubmitted=YES";				
					}
					else if ((orderrec == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "OrderReceived=YES";				
					}
					else if ((posub == true))
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#" + "AND POSubmitted=YES";				
					}
					else
					{
						commandText = "SELECT * FROM Equipment_Purchases WHERE Project=" + "'" + ProjectNode + "'" + " AND ProjectNumber=" + ProjectNumNode + " AND OrderSubmittedDate >=" + "#"+ start2 + "#" + " AND OrderSubmittedDate <=" + "#" + end2 + "#";	
					}
				}
				
				ResultSet rs = Query.ExecuteResultSet(commandText);

				try 
				{
					while ((rs!=null) && (rs.next()))
					{
						String project = rs.getString("Project");
						String project_number = rs.getString("ProjectNumber");
						String description = rs.getString("Description");
						String vendor = rs.getString("Vendor");
						String vendor_quote = rs.getString("VendorQuote");						
						String quantity = rs.getString("Quantity");
						String comments = rs.getString("Comments");
						String order_submitted = rs.getString("OrderSubmitted");
						String order_submitted_date = rs.getString("OrderSubmittedDate");
						String order_received = rs.getString("OrderReceived");
						String order_received_date = rs.getString("OrderReceivedDate");
						String po_code = rs.getString("POCode");
						String po_submitted_date = rs.getString("POSubmittedDate");
						String shipper = rs.getString("Shipper");
						String tracking_number = rs.getString("TrackingNumber");
						String part_number = rs.getString("PartNumber");
						String po_submitted = rs.getString("POSubmitted");							
						
						stmt = c.prepareStatement("INSERT INTO TEMP (Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,Quantity,Comments," +
								"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
								"VALUES (" + "'" + project + "'," + "'" + project_number + "'," + "'" + part_number+ "'," + "'" + description + "'," + "'" + vendor+ "'," + "'" + vendor_quote + "',"
								+ "'" + quantity + "'," + "'" + comments + "'," + "'" + order_submitted+ "'," + "'" + order_submitted_date+ "'," + "'" + order_received+ "'," + "'" + order_received_date+ "'," + "'" + po_code+ "',"
								+ "'" + po_submitted + "',"+ "'" + po_submitted_date + "'," + "'" + shipper+ "'," + "'" + tracking_number+ "'," +")");
						stmt.execute();
					    stmt.close();
					}
				}
				catch (SQLException e)
				{
					
				}	
			
			}			
			
		}	
		
		CreatePreview();
			
	}
	
	public static void CreatePreview()
	{
		String cmdText = "SELECT * FROM TEMP";
		OrderBy1 = comboBox.getSelectedItem().toString();
		OrderBy2 = comboBox_1.getSelectedItem().toString();
		OrderBy3 = comboBox_2.getSelectedItem().toString();
		String title = txtReportTitle.getText();		
		boolean c1 = comboBox_1.isEnabled();
		boolean c2 = comboBox_2.isEnabled();
		if (OrderBy1.compareTo("") == 0)
		{
			OrderBy1 = "Project";
			
		}
		if (OrderBy2.compareTo("") == 0)
		{
			OrderBy2 = "ProjectNumber";
		}
		if (OrderBy3.compareTo("") == 0)
		{
			OrderBy3 = "OrderSubmittedDate";
		}
		try{		
		Statement stmt2 = c.createStatement();
		if (c1 == false)			
		{
			cmdText = "SELECT * FROM TEMP ORDER BY " + OrderBy1 + " ASC";
		}
		else if ((c1 == true) && (c2 == false))
		{
			cmdText = "SELECT * FROM TEMP ORDER BY " + OrderBy1 + " ASC, " + OrderBy2;
		}
		else
		{
			cmdText = "SELECT * FROM TEMP ORDER BY " + OrderBy1 + " ASC, " + OrderBy2 + " , " + OrderBy3;
		}
	    
	    ResultSet rs2 = stmt2.executeQuery(cmdText);
	        
	       
	        while((rs2.next()) && (rs2 != null))
	        {
	        	String project = rs2.getString("Project");
				String project_number = rs2.getString("ProjectNumber");
				String description = rs2.getString("Description");
				String vendor = rs2.getString("Vendor");
				String vendor_quote = rs2.getString("VendorQuote");						
				String quantity = rs2.getString("Quantity");
				String comments = rs2.getString("Comments");
				String order_submitted = rs2.getString("OrderSubmitted");
				String order_submitted_date = rs2.getString("OrderSubmittedDate");
				String order_received = rs2.getString("OrderReceived");
				String order_received_date = rs2.getString("OrderReceivedDate");
				String po_code = rs2.getString("POCode");
				String po_submitted_date = rs2.getString("POSubmittedDate");
				String shipper = rs2.getString("Shipper");
				String tracking_number = rs2.getString("TrackingNumber");
				String part_number = rs2.getString("PartNumber");
				String po_submitted = rs2.getString("POSubmitted");							
				
				
				rep = new Report(project,project_number,part_number,description,vendor,vendor_quote,quantity,comments,
						order_submitted,order_submitted_date,order_received,order_received_date,po_code,po_submitted,
						po_submitted_date,shipper,tracking_number);
				
				repListModel.addElement(rep);	        
			
	        }
	        stmt2.close();	
	        stmt = c.prepareStatement("DROP TABLE TEMP");
			stmt.execute();
			stmt.close();
	        c.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		PreviewGUI.GeneratePreview(repListModel, title);
	}
	

	public void OpenProfile()
	{
		JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("Open Profile");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "GLT", "GLT");
		jfc.setFileFilter(filter);
		
		int result = jfc.showOpenDialog(jfc);
		if (result == JFileChooser.CANCEL_OPTION)
		{
		    return;
		}
		
		File file = jfc.getSelectedFile();				
		String gltFilepath = file.getAbsolutePath();
		
		try {
			
		
			FileReader reader = new FileReader(gltFilepath);
			BufferedReader br = new BufferedReader(reader); 
			
			String s;
			int i = 0;
			int  inc = 0;
			tree.expandAll();
			String[] projnum = new String[tree.getRowCount() + 5];
			while ((s = br.readLine()) != null)
			{
					String[] split = s.split(",");
					String t;
				try
				{
					String proj =  (split[2].toString().substring(1,split[2].toString().length()-1));				
					projnum[inc] = proj;				
					inc = inc + 1;
				}
				catch (Exception f)
				{
					//do nothing
				}
				
			}
			
			br.close();
			reader.close();
			
			

			TreePath[] checkpaths = new TreePath[tree.getRowCount() + 5];
			int loc = 0;
			for (int ii = 0; ii < inc; ii++)
			{
				for (int kk = 0; kk < tree.getRowCount()-1; kk++)
				{
					String temp = tree.getPathForRow(kk).toString();
					try
					{			
						String[] split = temp.split(",");
						split[2] = (split[2].substring(1,split[2].length()-1));
						
						if (split[2].compareTo(projnum[ii]) == 0)
						{
							
							checkpaths[loc] = tree.getPathForRow(kk);					
							loc = loc + 1;
							
						}
					}
					catch (Exception e)
					{
						
					}
				
				}
			}
			tree.setSelectionPaths(checkpaths);
			tree.setCheckingPaths(checkpaths);
			
			  }catch (Exception e){//Catch exception if any
			  
			  }
		
		
	}
	
	public void SaveProfile()
	{	
		
		
		JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("Save File");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "GLT", "GLT");
		jfc.setFileFilter(filter);
		
		int result = jfc.showSaveDialog(jfc);
		if (result == JFileChooser.CANCEL_OPTION)
		{
		    return;
		}	
		
		try {
			File file = new File (jfc.getSelectedFile() + ".glt");
			String gltFilepath = file.getAbsolutePath();
			if (file.exists() && jfc.getDialogType() == jfc.SAVE_DIALOG)
			{
				int answer = JOptionPane.showConfirmDialog(null,"The file exists, overwrite?","Existing file",JOptionPane.YES_NO_CANCEL_OPTION);				
	            switch(answer){
	                case JOptionPane.YES_OPTION:
	                	file.delete();	                	
	                	FileWriter writer = new FileWriter(gltFilepath);     
	        			tmp = tree.getCheckingPaths();      				        					
	        			for(int i = 0; i < tmp.length; i++)
	        			{				
	        				writer.append(tmp[i].toString() + "\n");
	        			}
	        			
	        			writer.close();
	                case JOptionPane.NO_OPTION:
	                    return;
	                case JOptionPane.CLOSED_OPTION:
	                    return;
	                case JOptionPane.CANCEL_OPTION:	                    
	                    return;
	            }
			}			
			else
			{
			
			FileWriter writer = new FileWriter(gltFilepath);     
			tmp = tree.getCheckingPaths();
			
			
			for(int i = 0; i < tmp.length; i++)
			{	
				writer.append(tmp[i].toString() + "\n");
			}
			
			writer.close();
			}
			  }catch (Exception e){//Catch exception if any
			  //System.err.println("Error: " + e.getMessage());
				  e.printStackTrace();
				  JOptionPane.showMessageDialog(null, "An error has occured while trying to save the file.");
				 
			  }
			
	}
	

	public static void PopulateCheckboxTree()
	{
		
		try {
			tree.setModel(new DefaultTreeModel(
					new DefaultMutableTreeNode("Projects") {
						{
							DefaultMutableTreeNode proj;
							DefaultMutableTreeNode projnum;
							String commandText = "SELECT DISTINCT Project FROM Equipment_Purchases ORDER BY Project ASC";
							ResultSet rs = Query.ExecuteResultSet(commandText);
							
							while((rs!=null) && (rs.next()))
							{
								String projectname = rs.getString(1);
								proj = new DefaultMutableTreeNode(projectname);								
									String commandText2 = "SELECT DISTINCT ProjectNumber FROM Equipment_Purchases WHERE Project=" + "'" + projectname + "'" + "ORDER BY ProjectNumber ASC";
									ResultSet rs2 = Query.ExecuteResultSet(commandText2);
									
									while((rs2!=null) && (rs2.next()))
									{
										int tmp = rs2.getInt("ProjectNumber");
										String tmp2 = Integer.toString(tmp);
										projnum = new DefaultMutableTreeNode(tmp2);
										proj.add(projnum);
									}
																	
								add(proj);
							
							}
						}
					}
				));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmReportGenerator = new JFrame();
		frmReportGenerator.setIconImage(Toolkit.getDefaultToolkit().getImage(ReportGUI.class.getResource("/075794-3d-glossy-blue-orb-icon-business-gears1-sc44_43x43.png")));
		frmReportGenerator.setResizable(false);		
		frmReportGenerator.getContentPane().setForeground(Color.BLACK);
		frmReportGenerator.setTitle("Report Generator");		
		frmReportGenerator.setSize(620, 680);
		frmReportGenerator.setLocationRelativeTo(null);		
		frmReportGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReportGenerator.getContentPane().setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 252, 408);
			frmReportGenerator.getContentPane().add(scrollPane);
		
			 
			tree = new CheckboxTree();
			tree.getCheckingModel().setCheckingMode(TreeCheckingModel.CheckingMode.PROPAGATE_PRESERVING_CHECK);
			tree.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			tree.setBackground(Color.WHITE);
			tree.setBorder(UIManager.getBorder("DesktopIcon.border"));
			scrollPane.setViewportView(tree);
			
			
			JButton btnPreviewReport = new JButton("");
			btnPreviewReport.setIcon(new ImageIcon(ReportGUI.class.getResource("/075711-3d-glossy-blue-orb-icon-business-charts1-sc1_128x128.png")));
			btnPreviewReport.setToolTipText("Generate Report");
			btnPreviewReport.setOpaque(false);			
			btnPreviewReport.setContentAreaFilled(false);
			btnPreviewReport.setBorderPainted(false);
			btnPreviewReport.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (tree.getSelectionCount() == 0)
					{
						JOptionPane.showMessageDialog(null, "You have not selected any project data.");				
						tree.setBorder(new LineBorder(new Color(255, 0, 0), 4));
						return;
					}					
					tree.setBorder(new LineBorder(new Color(0, 0, 0), 1));
					GenerateReport();
				}
			});
			btnPreviewReport.setBounds(254, 422, 128, 128);
			frmReportGenerator.getContentPane().add(btnPreviewReport);
			
			JButton btnMainMenu = new JButton("");
			btnMainMenu.setIcon(new ImageIcon(ReportGUI.class.getResource("/075802-3d-glossy-blue-orb-icon-business-home5_128x128.png")));
			btnMainMenu.setToolTipText("Main Menu");
			btnMainMenu.setOpaque(false);			
			btnMainMenu.setContentAreaFilled(false);
			btnMainMenu.setBorderPainted(false);
			btnMainMenu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frmReportGenerator.dispose();
					ReportGUI = true;
					MainMenuGUI.run();
				}
			});
			btnMainMenu.setBounds(54, 422, 128, 128);
			frmReportGenerator.getContentPane().add(btnMainMenu);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setToolTipText("Optional Filters");
			panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
			panel.setBounds(310, 11, 296, 293);
			frmReportGenerator.getContentPane().add(panel);
			panel.setLayout(null);
		
			StartDate = new JDateChooser();
			StartDate.setBounds(92, 36, 187, 20);
			panel.add(StartDate);
			StartDate.setDateFormatString("MM-dd-yyyy");
			
			JLabel lblNewLabel = new JLabel("Start Date:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(10, 37, 76, 14);
			panel.add(lblNewLabel);
			
			EndDate = new JDateChooser();
			EndDate.setBounds(92, 68, 187, 20);
			panel.add(EndDate);
			EndDate.setDateFormatString("MM/dd/yyyy");
			
			JLabel lblEndDate = new JLabel("End Date:");
			lblEndDate.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblEndDate.setBounds(10, 70, 76, 14);
			panel.add(lblEndDate);
			
			txtReportTitle = new JTextField();
			txtReportTitle.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					PreviewPane();
				}
			});
			
			txtReportTitle.setBounds(92, 99, 187, 20);
			panel.add(txtReportTitle);
			txtReportTitle.setColumns(10);
			
			JLabel lblReportTitle = new JLabel("Report Title:");
			lblReportTitle.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblReportTitle.setBounds(10, 102, 80, 14);
			panel.add(lblReportTitle);
			
			JLabel lblRequiredFields = new JLabel("Optional Filters");
			lblRequiredFields.setBounds(8, 2, 284, 14);
			panel.add(lblRequiredFields);
			lblRequiredFields.setHorizontalAlignment(SwingConstants.CENTER);
			lblRequiredFields.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			chckbxOrderSubmitted = new JCheckBox("Order Submitted");
			chckbxOrderSubmitted.setBounds(16, 130, 129, 23);
			panel.add(chckbxOrderSubmitted);
			chckbxOrderSubmitted.setFont(new Font("Times New Roman", Font.BOLD, 14));
			chckbxOrderSubmitted.setBackground(Color.WHITE);
			
			chckbxOrderReceived = new JCheckBox("Order Received");
			chckbxOrderReceived.setBounds(150, 130, 129, 23);
			panel.add(chckbxOrderReceived);
			chckbxOrderReceived.setBackground(Color.WHITE);
			chckbxOrderReceived.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			chckBoxPOSubmitted = new JCheckBox("PO Submitted");
			chckBoxPOSubmitted.setBounds(16, 165, 129, 23);
			panel.add(chckBoxPOSubmitted);
			chckBoxPOSubmitted.setBackground(Color.WHITE);
			chckBoxPOSubmitted.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			JLabel lblOrderBy = new JLabel("Order By");
			lblOrderBy.setBounds(19, 193, 77, 14);
			panel.add(lblOrderBy);
			lblOrderBy.setHorizontalAlignment(SwingConstants.LEFT);
			lblOrderBy.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			comboBox = new JComboBox();
			comboBox.setMaximumRowCount(15);
			comboBox.setBackground(Color.WHITE);
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {					
					comboBox_1.setEnabled(true);
					comboBox_1.setBackground(Color.white);
				
					
				}
			});
			comboBox.setBounds(115, 191, 173, 22);
			panel.add(comboBox);
			comboBox.setModel(new DefaultComboBoxModel(new String[]{"", "Project", "ProjectNumber", "PartNumber", "Vendor", "Quantity", "OrderSubmittedDate", "OrderReceivedDate", "POCode", "POSubmittedDate", "Shipper"}));
			comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			JLabel lblSecondOrder = new JLabel("And Then By");
			lblSecondOrder.setHorizontalAlignment(SwingConstants.LEFT);
			lblSecondOrder.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblSecondOrder.setBounds(19, 228, 86, 14);
			panel.add(lblSecondOrder);
			
			comboBox_1 = new JComboBox();
			comboBox_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboBox_2.setEnabled(true);
					comboBox_2.setBackground(color.white);
				}
			});
			comboBox_1.setMaximumRowCount(15);
			comboBox_1.setEnabled(false);
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Project", "ProjectNumber", "PartNumber", "Vendor", "Quantity", "OrderSubmittedDate", "OrderReceivedDate", "POCode", "POSubmittedDate", "Shipper"}));
			comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			comboBox_1.setBounds(115, 226, 173, 22);
			panel.add(comboBox_1);
			
			JLabel lblThirdOrder = new JLabel("And Then");
			lblThirdOrder.setHorizontalAlignment(SwingConstants.LEFT);
			lblThirdOrder.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblThirdOrder.setBounds(19, 265, 86, 14);
			panel.add(lblThirdOrder);
			
			comboBox_2 = new JComboBox();
			comboBox_2.setMaximumRowCount(15);
			comboBox_2.setEnabled(false);
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Project", "ProjectNumber", "PartNumber", "Vendor", "Quantity", "OrderSubmittedDate", "OrderReceivedDate", "POCode", "POSubmittedDate", "Shipper"}));
			comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
			comboBox_2.setBounds(115, 263, 173, 22);
			panel.add(comboBox_2);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setToolTipText("Customize Report");
			panel_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(310, 315, 296, 104);
			frmReportGenerator.getContentPane().add(panel_1);
			
			JLabel lblOptionalFilters = new JLabel("Customize Report");
			lblOptionalFilters.setHorizontalAlignment(SwingConstants.CENTER);
			lblOptionalFilters.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblOptionalFilters.setBounds(8, 4, 284, 14);
			panel_1.add(lblOptionalFilters);
			
			btnFirstColor = new JButton("");
			btnFirstColor.setBackground(new Color(182, 203, 226));
			btnFirstColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					
					color = JColorChooser.showDialog(frmReportGenerator, "Select First Row Color", color);				
					
					if (color != null)
					{
					btnFirstColor.setBackground(color);
					color1 = Integer.toHexString(color.getRGB());
					color1 = "#" + color1.substring(2, color1.length());
					
					}
					else
					{
						//do nothing
					}
					PreviewPane();
					
				}
			});
			btnFirstColor.setBounds(25, 25, 27, 23);
			panel_1.add(btnFirstColor);
			
			btnSecondColor = new JButton("");
			btnSecondColor.setBackground(new Color(204,204,204));
			btnSecondColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					color = JColorChooser.showDialog(frmReportGenerator, "Select Second Row Color", color);
					if (color != null)
					{
					btnSecondColor.setBackground(color);
					color2 = Integer.toHexString(color.getRGB());
					color2 = "#" + color2.substring(2, color2.length());
					}
					PreviewPane();
				}
			});
			btnSecondColor.setBounds(157, 25, 27, 23);
			panel_1.add(btnSecondColor);
			
			JLabel lblFirstColor = new JLabel("First Color");
			lblFirstColor.setHorizontalAlignment(SwingConstants.CENTER);
			lblFirstColor.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblFirstColor.setBounds(60, 30, 73, 14);
			panel_1.add(lblFirstColor);
			
			JLabel lblSecondColor = new JLabel("Second Color");
			lblSecondColor.setHorizontalAlignment(SwingConstants.CENTER);
			lblSecondColor.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblSecondColor.setBounds(190, 30, 91, 14);
			panel_1.add(lblSecondColor);
			
			JLabel lblFontColor = new JLabel("Header");
			lblFontColor.setHorizontalAlignment(SwingConstants.CENTER);
			lblFontColor.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblFontColor.setBounds(147, 75, 44, 17);
			panel_1.add(lblFontColor);
			
			JLabel lblTitleColor = new JLabel("Title");
			lblTitleColor.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitleColor.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblTitleColor.setBounds(55, 75, 28, 17);
			panel_1.add(lblTitleColor);
			
			JButton button = new JButton("");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ChooseTitleFont.run();		
				}
			});
			button.setIcon(new ImageIcon(ReportGUI.class.getResource("/075794-3d-glossy-blue-orb-icon-business-gears1-sc44_32x32.png")));
			button.setToolTipText("Title Font");
			button.setOpaque(false);
			button.setContentAreaFilled(false);
			button.setBorderPainted(false);
			button.setBackground(SystemColor.activeCaptionBorder);
			button.setBounds(17, 65, 32, 32);
			panel_1.add(button);
			
			JButton button_1 = new JButton("");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ChooseHeaderFont.run();
				}
			});
			button_1.setIcon(new ImageIcon(ReportGUI.class.getResource("/075794-3d-glossy-blue-orb-icon-business-gears1-sc44_32x32.png")));
			button_1.setToolTipText("Header Font");
			button_1.setOpaque(false);
			button_1.setContentAreaFilled(false);
			button_1.setBorderPainted(false);
			button_1.setBackground(SystemColor.activeCaptionBorder);
			button_1.setBounds(108, 65, 32, 32);
			panel_1.add(button_1);
			
			JButton button_2 = new JButton("");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ChooseFont.run();
				}
			});
			button_2.setIcon(new ImageIcon(ReportGUI.class.getResource("/075794-3d-glossy-blue-orb-icon-business-gears1-sc44_32x32.png")));
			button_2.setToolTipText("Report Font");
			button_2.setOpaque(false);
			button_2.setContentAreaFilled(false);
			button_2.setBorderPainted(false);
			button_2.setBackground(SystemColor.activeCaptionBorder);
			button_2.setBounds(201, 65, 32, 32);
			panel_1.add(button_2);
			
			JLabel label = new JLabel("Report");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Times New Roman", Font.BOLD, 14));
			label.setBounds(240, 75, 44, 17);
			panel_1.add(label);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setToolTipText("EN Engineering");
			
			lblNewLabel_1.setIcon(new ImageIcon(ReportGUI.class.getResource("/enengineering_transparent_444x67.png")));
			lblNewLabel_1.setBounds(10, 553, 452, 57);
			frmReportGenerator.getContentPane().add(lblNewLabel_1);
			
			JLabel lblV = new JLabel("");
			lblV.setText(MainMenuGUI.version);
			lblV.setHorizontalAlignment(SwingConstants.CENTER);
			lblV.setBounds(560, 596, 46, 14);
			frmReportGenerator.getContentPane().add(lblV);
			
			editorPane = new JEditorPane();
			editorPane.setEditable(false);
			editorPane.setContentType("text/html");
			editorPane.setBounds(634, 11, 932, 408);
			frmReportGenerator.getContentPane().add(editorPane);
			editorPane.setVisible(false);
			
			btnExpand = new JButton("");
			btnExpand.setOpaque(false);
			btnExpand.setContentAreaFilled(false);
			btnExpand.setBorderPainted(false);
			btnExpand.setToolTipText("Show Preview");
			btnExpand.setIcon(new ImageIcon(ReportGUI.class.getResource("/004238-3d-glossy-blue-orb-icon-arrows-arrow-more_128x128.png")));
			btnExpand.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmReportGenerator.setBounds(frmReportGenerator.getX(), frmReportGenerator.getY(), 1584, 680);
					frmReportGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frmReportGenerator.getContentPane().setLayout(null);
					editorPane.setVisible(true);
					btnExpand.setVisible(false);
					btnHide.setVisible(true);
					frmReportGenerator.setLocationRelativeTo(frmReportGenerator);
					
				}
			});
			btnExpand.setBounds(460, 422, 128, 128);
			frmReportGenerator.getContentPane().add(btnExpand);
			
			btnHide = new JButton("");
			btnHide.setOpaque(false);
			btnHide.setContentAreaFilled(false);
			btnHide.setBorderPainted(false);
			btnHide.setIcon(new ImageIcon(ReportGUI.class.getResource("/004296-3d-glossy-blue-orb-icon-arrows-cut-arrow-left_128x128.png")));
			btnHide.setToolTipText("Hide Preview");
			btnHide.setVisible(false);
			
			btnHide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					editorPane.setVisible(false);
					btnExpand.setVisible(false);
					frmReportGenerator.setBounds(frmReportGenerator.getX(), frmReportGenerator.getY(), 624, 680);
					btnHide.setVisible(false);
					btnExpand.setVisible(true);
					frmReportGenerator.setLocationRelativeTo(frmReportGenerator);
				}
			});
			btnHide.setBounds(460, 422, 128, 128);
			frmReportGenerator.getContentPane().add(btnHide);
			
			btnReset = new JButton("");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ResetPreview();
				}
			});
			btnReset.setIcon(new ImageIcon(ReportGUI.class.getResource("/075834-3d-glossy-blue-orb-icon-business-magic-wand_128x128.png")));
			btnReset.setToolTipText("Reset");
			btnReset.setContentAreaFilled(false);
			btnReset.setOpaque(false);
			btnReset.setBorderPainted(false);
			btnReset.setBounds(1450, 422, 128, 128);
			frmReportGenerator.getContentPane().add(btnReset);
			
			JMenuBar menuBar = new JMenuBar();
			frmReportGenerator.setJMenuBar(menuBar);
			
			JMenu mnFile = new JMenu("File");
			menuBar.add(mnFile);
			
			JMenuItem mntmOpenProfile = new JMenuItem("Open Profile");
			mntmOpenProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					OpenProfile();
				}
			});
			mnFile.add(mntmOpenProfile);
			
			JMenuItem mntmSaveProfile = new JMenuItem("Save Profile");
			mntmSaveProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					SaveProfile();
				}
			});
			mnFile.add(mntmSaveProfile);
			
	}
	
	public static void ResetPreview()
	{
		
		ChooseHeaderFont.firstrun = true;
		ChooseTitleFont.firstrun = true;
		ChooseFont.firstrun = true;
		
		titlefont = null;
		titlesize=  null;
		titlecolor = "#000000";
		title2 = txtReportTitle.getText();
		titleweight2 = null;
		headersize = null;
		headerfontcolor = null;
		headerweight2 = null;
		fontsize = null;
		fontcolor1 = null;
		backgroundcolor = "#b6cbe2";
		backgroundcolor2 = "#cccccc";
		color1= "#b6cbe2";
		color2= "#cccccc";
		fontweight2 = null;
		
		UpdatePreviewPane();
	}
	
	public static void UpdatePreviewPane()
	{
		
		String formatDate = "<table border=\"0\" style=\"width:100%\"><tr><td style=\"font-size: 10px;font-face: Arial Black; text-align: right;\"> " + "Date Created"+ "</td></tr>";
		String formatTitle = "<tr><td style=\"color: " + titlecolor + ";text-align:center;font-face:" + titlefont + ";" + titleweight2 + ";font-size:" + titlesize + "px; \"> " + title2 + "</td></tr></table>";
		String formatHeader1 = "<table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"><tr style=\"font-size: " + headersize + "px;color:" + headerfontcolor +";text-align:center;" + headerweight2 + "\"><td>Project</td><td>Project #</td><td>Part #</td><td>Description</td><td>Vendor</td><td>Vendor Quote #</td><td>Quantity</td><td>Comments</td><td>Order Submitted</td></tr>";
		String formatHeader2 = "<tr style=\"font-size: " + headersize + "px;color:" + headerfontcolor +";text-align:center;" + headerweight2 + "\"><td></td><td>Order Submit Date</td><td>Order Received</td><td>Order Received Date</td><td>PO Code</td><td>PO Submitted</td><td>PO Submitted Date</td><td>Shipper</td><td>Tracking Number</td></tr>";
		String data1 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data2 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		String data3 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data4 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		String data5 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data6 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		String data7 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data8 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		String data9 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data10 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		String data11 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data12 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		String data13 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor + ";text-align:center;\"><td>" + "Project" + "</td><td>" + "Project #" + "</td><td>" + "Part #" + "</td><td>" + "Description" + "</td><td>" + "Vendor"+ "</td><td>" + "Vendor Quote"+ "</td><td>" + "Quantity" + "</td><td>" + "Comments"+ "</td><td>" + "Order Submitted" + "</td></tr>";
		String data14 = "<tr style=\"font-size: " + fontsize + "px;" + fontweight2 + "color: " + fontcolor1 + ";background-color: " + backgroundcolor2 + ";text-align:center;\"><td></td><td>" + "Order Submitted Date"+ "</td><td>" + "Order Received"+ "</td><td>" + "Order Received Date"+ "</td><td>" + "PO Code"+ "</td><td>" + "PO Submitted"+ "</td><td>" + "PO Submitted Date"+ "</td><td>" + "Shipper"+ "</td><td>" + "Tracking Number" + "</td></tr>";
		editorPane.setText(formatDate + formatTitle + formatHeader1 + formatHeader2 + data1 + data2 + data3 + data4 + data5 + data6 + data7 + data8 + data9 + data10 + data11 + data12 + data13 + data14);
		
		
	}
}
