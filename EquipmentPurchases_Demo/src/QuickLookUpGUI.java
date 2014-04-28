import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JCheckBox;
import java.awt.TextArea;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class QuickLookUpGUI {
	

	public static JFrame frmQuickLookupGUI;
	public JScrollPane eq2ScrollPane;	
	public static JList<Equipment> eqList;
	public static JList<Equipment> eq2List;
	public static JList<Equipment> eq3List;
	
	public static DefaultListModel<Equipment> eqListModel;
	public static DefaultListModel<Equipment> eqListModel2;
	public static DefaultListModel<Equipment> eqListModel3 = new DefaultListModel<Equipment>();	
	public static JTextField Vendor_txtField;
	public static JTextField VendorQuote_txtField;
	public static JTextField Cost_txtField;
	public static JTextField Quantity_txtField;
	public static JTextField pocode_txtField;
	public static JTextField shipper_txtField;
	public static JTextField trackingnumber_txtField;
	public JTextField Comments_txtArea;
	public static JCheckBox OrderSubmitted_chkBox;
	
	public static JCheckBox OrderReceived_chkBox;
	public static JLabel OrderSubmittedDate_lbl;
	public static JLabel OrderReceived_Date;
	public static JCheckBox posubmit_chkbox;
	public static JLabel posubmitteddate_lbl;
	public static TextArea comments_txtArea;
	public static TextArea Description_textArea;
	public JLabel lblPoCode;
	public static JTextField txtSearch;
	public static String search;
	public static boolean search1 = true;
	public JLabel lblDemoV;
	public JLabel label_1;
	
	 
	
	public static void run() {
		
	
		try {
			ConnectToAccess.CreateDemoData_QuickView();
			QuickLookUpGUI window = new QuickLookUpGUI();
			window.frmQuickLookupGUI.setVisible(true);
			//frmQuickLookupGUI.setLocationRelativeTo(MainMenuGUI.frmEquipmentPurchases);
		} catch (Exception e) {
			e.printStackTrace();
		}				
		populateProjectFromDB();
	}
		
	
	
	/**
	 * Create the application.
	 */
	public QuickLookUpGUI() {
		initialize();			
	}
	
	public static void populateProjectNumFromDB(String proj)
	{
		eqListModel2 = new DefaultListModel<Equipment>();
		
		String commandText = "SELECT  DISTINCT ProjectNumber FROM Equipment_Purchases WHERE Project= " + "'" + proj + "'";
		ResultSet rs = Query.ExecuteResultSet(commandText);
		try {
			while ((rs!=null) && (rs.next()))
			{
				int projectNum = rs.getInt(1);
				String tmp = Integer.toString(projectNum);
				Equipment projNum = new Equipment(tmp);
				eqListModel2.addElement(projNum);
			}
		}
		catch (SQLException e)
		{
			
		}
		
		eq2List.setModel(eqListModel2);
	}
	
	
	public static void populatePartNumFromDB(String partnum)
	{
		eqListModel3 = new DefaultListModel<Equipment>();
		String tmp = "PartNumber";
		String commandText = "SELECT PartNumber FROM Equipment_Purchases WHERE ProjectNumber= " + partnum + " ORDER BY " + "'" + tmp + "'" + "ASC";
		ResultSet rs = Query.ExecuteResultSet(commandText);
		try {
			while ((rs!=null) && (rs.next()))
			{
				String partNumber = rs.getString(1);			
				Equipment partNum = new Equipment(partNumber);
				eqListModel3.addElement(partNum);
			
			}
		}
		catch (SQLException e)
		{
			
		}
		
		eq3List.setModel(eqListModel3);
		
	}
	
	public static void ClearFields()
	{
		
		
		trackingnumber_txtField.setText(null);	
		shipper_txtField.setText(null);
		Description_textArea.setText(null);
		Vendor_txtField.setText(null);	
		VendorQuote_txtField.setText(null);
		Cost_txtField.setText(null);
		Quantity_txtField.setText(null);	
		pocode_txtField.setText(null);	
		comments_txtArea.setText(null);			
		OrderSubmittedDate_lbl.setText(null);
		OrderSubmitted_chkBox.setSelected(false);
		OrderReceived_chkBox.setSelected(false);
		OrderReceived_Date.setText(null);
		posubmit_chkbox.setSelected(false);
		posubmitteddate_lbl.setText(null);	
		
	
		
	}
	
	public static void Search()
	{
		
		eqListModel3.removeAllElements();		
		search = txtSearch.getText().toUpperCase();		
	
		if ((search.length() == 1) && (search1 == false))
		{
			search1 = true;
			Search();
			
		}
		String commandText = "SELECT PartNumber FROM Equipment_Purchases WHERE upper(PartNumber) LIKE " + "'" + search + "%'";// + "OR PartNumber LIKE " + "'" + searchUpper + "%'";
		ResultSet rs = Query.ExecuteResultSet(commandText);
		try {
			while ((rs!=null) && (rs.next()))
			{
				String partNumber = rs.getString(1);			
				Equipment partNum = new Equipment(partNumber);
				eqListModel3.addElement(partNum);
			
			}
		}
		catch (SQLException e)
		{
			
		}
		
		eq3List.setModel(eqListModel3);
		//eq3List.setSelectedIndex(0);
		
		try
		{
		eq3List.setSelectedValue(eqListModel3.firstElement(), false);
		}
		catch (Exception e)
		{
			ClearFields();
			
		}
		
		
		
	}
	
	
	
	
	

	
	public static void populateProjectFromDB()
	{
		
		eqListModel = new DefaultListModel<Equipment>();
	
        String commandText = "SELECT DISTINCT Project FROM Equipment_Purchases ORDER BY Project Asc";        
        ResultSet rs = Query.ExecuteResultSet(commandText);
     
        try {
			while((rs!=null) && (rs.next()))
			{
				
				String project = rs.getString(1);				
							
				Equipment proj = new Equipment(project);
				
				eqListModel.addElement(proj);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		eqList.setModel(eqListModel);
        
	}
	
	public void populateFieldsfromDB(String partnum)
	{
		String commandText = "SELECT * FROM Equipment_Purchases WHERE PartNumber= " + "'" + partnum + "'";        
	    ResultSet rs = Query.ExecuteResultSet(commandText);
	    

	    
	    try {
			if((rs!=null) && (rs.next()))
			{	
				trackingnumber_txtField.setText(rs.getString("TrackingNumber"));	
				shipper_txtField.setText(rs.getString("Shipper"));
				Description_textArea.setText(rs.getString("Description"));
				Vendor_txtField.setText(rs.getString("Vendor"));
				
				try{					
					int tmp = rs.getInt("VendorQuote");
					String tmp2 = Integer.toString(tmp);
					VendorQuote_txtField.setText(tmp2);
				}
				catch (Exception f)
				{
					
				}
				Cost_txtField.setText("$" + rs.getString("CostfromSupplier"));
				Quantity_txtField.setText(rs.getString("Quantity"));		
				pocode_txtField.setText(rs.getString("POCode"));	
				comments_txtArea.setText(rs.getString("Comments"));			
	
				if(rs.getString("OrderSubmitted").compareTo("0") == 0)
				{
					OrderSubmitted_chkBox.setSelected(false);
					OrderSubmittedDate_lbl.setText("");
				}				
				else
				{
					OrderSubmitted_chkBox.setSelected(true);
					String order = rs.getString("OrderSubmittedDate");
					//String tmp21 = order.substring(0,10);
					OrderSubmittedDate_lbl.setText(order);			
				}
				if(rs.getString("OrderReceived").compareTo("0") == 0)
				{
					OrderReceived_chkBox.setSelected(false);
					OrderReceived_Date.setText("");
				}
				else
				{	
					String order = rs.getString("OrderReceivedDate");
					//String tmp21 = order.substring(0,10);
					OrderReceived_chkBox.setSelected(true);
					OrderReceived_Date.setText(order);				
				}
				if(rs.getString("POSubmitted").compareTo("0") == 0)
				{
					posubmit_chkbox.setSelected(false);
					posubmitteddate_lbl.setText("");	
				}
				else
				{
					String order = rs.getString("POSubmittedDate");
					//String tmp21 = order.substring(0,10);
					posubmit_chkbox.setSelected(true);
					posubmitteddate_lbl.setText(order);
				
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}
	
	private void initialize() {
		frmQuickLookupGUI = new JFrame();
		frmQuickLookupGUI.setTitle("Quick Lookup");
		//frmQuickLookupGUI.setBounds(0, 0, 670, 678);
		frmQuickLookupGUI.setSize(670,678);
		frmQuickLookupGUI.setLocationRelativeTo(null);
		//frmQuickLookupGUI.setLocationRelativeTo(null);
		frmQuickLookupGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuickLookupGUI.getContentPane().setLayout(null);
		
		OrderSubmitted_chkBox = new JCheckBox("");
		OrderSubmitted_chkBox.setEnabled(false);
		OrderSubmitted_chkBox.setBounds(277, 204, 24, 23);
		frmQuickLookupGUI.getContentPane().add(OrderSubmitted_chkBox);
		
		JLabel lblOrderSubmitted = new JLabel("Order Submitted");
		lblOrderSubmitted.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderSubmitted.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOrderSubmitted.setBounds(307, 208, 93, 14);
		frmQuickLookupGUI.getContentPane().add(lblOrderSubmitted);
		
		OrderReceived_chkBox = new JCheckBox("");
		OrderReceived_chkBox.setEnabled(false);
		OrderReceived_chkBox.setBounds(277, 248, 24, 23);
		frmQuickLookupGUI.getContentPane().add(OrderReceived_chkBox);
		
		JLabel lblOrderReceived = new JLabel("Order Received");
		lblOrderReceived.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderReceived.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOrderReceived.setBounds(307, 252, 93, 14);
		frmQuickLookupGUI.getContentPane().add(lblOrderReceived);
		
		OrderSubmittedDate_lbl = new JLabel("");
		OrderSubmittedDate_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		OrderSubmittedDate_lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		OrderSubmittedDate_lbl.setBounds(307, 228, 93, 14);
		frmQuickLookupGUI.getContentPane().add(OrderSubmittedDate_lbl);
		
		OrderReceived_Date = new JLabel("");
		OrderReceived_Date.setHorizontalAlignment(SwingConstants.CENTER);
		OrderReceived_Date.setFont(new Font("Tahoma", Font.BOLD, 10));
		OrderReceived_Date.setBounds(307, 272, 93, 14);
		frmQuickLookupGUI.getContentPane().add(OrderReceived_Date);
		
		posubmit_chkbox = new JCheckBox("");
		posubmit_chkbox.setEnabled(false);
		posubmit_chkbox.setBounds(277, 291, 24, 23);
		frmQuickLookupGUI.getContentPane().add(posubmit_chkbox);
		
		
		comments_txtArea = new TextArea();
		comments_txtArea.setEditable(false);
		comments_txtArea.setBounds(336, 387, 300, 122);
		frmQuickLookupGUI.getContentPane().add(comments_txtArea);
		
		
		JLabel lblNewLabel = new JLabel("Project");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(5, 71, 210, 14);
		frmQuickLookupGUI.getContentPane().add(lblNewLabel);
		
		
		JScrollPane eqScrollPane = new JScrollPane();
		eqScrollPane.setBounds(5, 96, 210, 101);
		frmQuickLookupGUI.getContentPane().add(eqScrollPane);
		

		
		eqList = new JList<Equipment>();
		eqList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()){			
				Equipment selected = eqList.getSelectedValue();
				String selectedValue = selected.toString();			
				eq2List.setSelectedIndex(-1);
				eq3List.setSelectedIndex(-1);
				populateProjectNumFromDB(selectedValue);
				}
				
				
			}
			
		});
		
		eqScrollPane.setViewportView(eqList);
		eqList.setFont(new Font("Tahoma", Font.BOLD, 12));
		eqList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		eqList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		eq2ScrollPane = new JScrollPane();
		eq2ScrollPane.setBounds(223, 96, 210, 101);
		frmQuickLookupGUI.getContentPane().add(eq2ScrollPane);
		
		eq2List = new JList<Equipment>();
		eq2ScrollPane.setViewportView(eq2List);
		eq2List.setFont(new Font("Tahoma", Font.BOLD, 12));
		eq2List.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		eq2List.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (eq2List.getSelectedIndex() == -1)
				{
					eq3List.removeAll();
					//eq3List.setModel(eqListModel3);
					populatePartNumFromDB("-1");
				}
				else
				{
				if(!e.getValueIsAdjusting()){					
				Equipment selected = eq2List.getSelectedValue();				
				String selectedValue = selected.toString();
					
						populatePartNumFromDB(selectedValue);
					}
					
				}
				
			}
			
		});
		
		JLabel lblProjectNumber = new JLabel("Project Number");
		lblProjectNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProjectNumber.setBounds(223, 71, 210, 14);
		frmQuickLookupGUI.getContentPane().add(lblProjectNumber);
		
		JScrollPane eq3scrollPane = new JScrollPane();
		eq3scrollPane.setBounds(440, 96, 210, 101);
		frmQuickLookupGUI.getContentPane().add(eq3scrollPane);
		
		eq3List = new JList<Equipment>();
		eq3scrollPane.setViewportView(eq3List);
		eq3List.setFont(new Font("Tahoma", Font.BOLD, 12));
		eq3List.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		eq3List.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()){			
				Equipment selected = eq3List.getSelectedValue();
				try
				{
				String selectedValue = selected.toString();
				populateFieldsfromDB(selectedValue);
				}
				catch (Exception e1)
				{
					
				}
				
				}
				
				
			}
			
		});
		
		JLabel lblPartNumber = new JLabel("Part Number");
		lblPartNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPartNumber.setBounds(440, 71, 210, 14);
		frmQuickLookupGUI.getContentPane().add(lblPartNumber);
		
		JLabel Description = new JLabel("Description");
		Description.setHorizontalAlignment(SwingConstants.CENTER);
		Description.setFont(new Font("Tahoma", Font.BOLD, 14));
		Description.setBounds(66, 367, 126, 14);
		frmQuickLookupGUI.getContentPane().add(Description);
		
		Vendor_txtField = new JTextField();
		Vendor_txtField.setEditable(false);
		Vendor_txtField.setColumns(10);
		Vendor_txtField.setBounds(139, 208, 128, 20);
		frmQuickLookupGUI.getContentPane().add(Vendor_txtField);
		
		JLabel lblVendor = new JLabel("Vendor");
		lblVendor.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVendor.setBounds(15, 211, 64, 14);
		frmQuickLookupGUI.getContentPane().add(lblVendor);
		
		VendorQuote_txtField = new JTextField();
		VendorQuote_txtField.setEditable(false);
		VendorQuote_txtField.setColumns(10);
		VendorQuote_txtField.setBounds(139, 242, 128, 20);
		frmQuickLookupGUI.getContentPane().add(VendorQuote_txtField);
		
		JLabel lblVendorQuote = new JLabel("Vendor Quote #");
		lblVendorQuote.setHorizontalAlignment(SwingConstants.LEFT);
		lblVendorQuote.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVendorQuote.setBounds(15, 245, 126, 14);
		frmQuickLookupGUI.getContentPane().add(lblVendorQuote);
		
		Cost_txtField = new JTextField();
		Cost_txtField.setEditable(false);
		Cost_txtField.setColumns(10);
		Cost_txtField.setBounds(514, 206, 128, 20);
		frmQuickLookupGUI.getContentPane().add(Cost_txtField);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setHorizontalAlignment(SwingConstants.LEFT);
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCost.setBounds(440, 211, 64, 14);
		frmQuickLookupGUI.getContentPane().add(lblCost);
		
		Quantity_txtField = new JTextField();
		Quantity_txtField.setEditable(false);
		Quantity_txtField.setColumns(10);
		Quantity_txtField.setBounds(139, 272, 128, 20);
		frmQuickLookupGUI.getContentPane().add(Quantity_txtField);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantity.setBounds(15, 275, 64, 14);
		frmQuickLookupGUI.getContentPane().add(lblQuantity);
		
		
		JLabel lblPoSubmitted = new JLabel("PO Submitted");
		lblPoSubmitted.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoSubmitted.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPoSubmitted.setBounds(307, 296, 93, 14);
		frmQuickLookupGUI.getContentPane().add(lblPoSubmitted);
		
		pocode_txtField = new JTextField();
		pocode_txtField.setEditable(false);
		pocode_txtField.setColumns(10);
		pocode_txtField.setBounds(514, 238, 128, 20);
		frmQuickLookupGUI.getContentPane().add(pocode_txtField);
		
		posubmitteddate_lbl = new JLabel("");
		posubmitteddate_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		posubmitteddate_lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		posubmitteddate_lbl.setBounds(307, 314, 93, 14);
		frmQuickLookupGUI.getContentPane().add(posubmitteddate_lbl);
		
		shipper_txtField = new JTextField();
		shipper_txtField.setEditable(false);
		shipper_txtField.setColumns(10);
		shipper_txtField.setBounds(514, 272, 128, 20);
		frmQuickLookupGUI.getContentPane().add(shipper_txtField);
		
		JLabel lblShipper = new JLabel("Shipper");
		lblShipper.setHorizontalAlignment(SwingConstants.LEFT);
		lblShipper.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShipper.setBounds(440, 273, 64, 14);
		frmQuickLookupGUI.getContentPane().add(lblShipper);
		
		JLabel lblTrackingNumber = new JLabel("Tracking #");
		lblTrackingNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblTrackingNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTrackingNumber.setBounds(15, 337, 113, 14);
		frmQuickLookupGUI.getContentPane().add(lblTrackingNumber);
		
		trackingnumber_txtField = new JTextField();
		trackingnumber_txtField.setEditable(false);
		trackingnumber_txtField.setColumns(10);
		trackingnumber_txtField.setBounds(139, 336, 261, 20);
		frmQuickLookupGUI.getContentPane().add(trackingnumber_txtField);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setHorizontalAlignment(SwingConstants.CENTER);
		lblComments.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblComments.setBounds(426, 367, 102, 14);
		frmQuickLookupGUI.getContentPane().add(lblComments);
		
		Description_textArea = new TextArea();
		Description_textArea.setEditable(false);
		Description_textArea.setBounds(15, 387, 300, 120);
		frmQuickLookupGUI.getContentPane().add(Description_textArea);
		
		lblPoCode = new JLabel("PO Code");
		lblPoCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPoCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPoCode.setBounds(440, 243, 64, 14);
		frmQuickLookupGUI.getContentPane().add(lblPoCode);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(QuickLookUpGUI.class.getResource("/075802-3d-glossy-blue-orb-icon-business-home5_128x128.png")));
		btnNewButton.setToolTipText("Main Menu");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmQuickLookupGUI.dispose();
				MainMenuGUI.run();
			}
		});
		btnNewButton.setBounds(262, 507, 128, 128);
		frmQuickLookupGUI.getContentPane().add(btnNewButton);
		
		txtSearch = new JTextField();
		txtSearch.setToolTipText("Search Part Number");
		txtSearch.setFocusable(true);	
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				Search();
			}
			@Override
			public void keyReleased(KeyEvent e) {
				Search();
			}
		
		});
		txtSearch.setBounds(492, 26, 144, 20);
		frmQuickLookupGUI.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(QuickLookUpGUI.class.getResource("/075837-3d-glossy-blue-orb-icon-business-magnifying-glass-ps_64x64.png")));
		lblNewLabel_1.setToolTipText("Search");
		lblNewLabel_1.setBounds(426, 0, 64, 64);
		frmQuickLookupGUI.getContentPane().add(lblNewLabel_1);
		
		lblDemoV = new JLabel("Demo v 1.0.5");
		lblDemoV.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemoV.setBounds(580, 626, 72, 14);
		frmQuickLookupGUI.getContentPane().add(lblDemoV);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(QuickLookUpGUI.class.getResource("/enengineering_transparent_222x33.png")));
		label_1.setToolTipText("EN Engineering");
		label_1.setBounds(15, 617, 222, 33);
		frmQuickLookupGUI.getContentPane().add(label_1);
		
		JButton btnQRCode = new JButton("");
		btnQRCode.setIcon(new ImageIcon(QuickLookUpGUI.class.getResource("/square_blue_button_85_85.png")));
		btnQRCode.setToolTipText("Create QR Code");
		btnQRCode.setOpaque(false);
		btnQRCode.setContentAreaFilled(false);
		btnQRCode.setBorderPainted(false);
		btnQRCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QRGenerator.Generate();
			}
		});
		btnQRCode.setBounds(457, 507, 128, 128);
		frmQuickLookupGUI.getContentPane().add(btnQRCode);
		
	
	
}
}
