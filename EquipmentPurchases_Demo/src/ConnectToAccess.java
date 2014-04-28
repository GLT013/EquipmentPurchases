import java.io.EOFException;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class ConnectToAccess {
	public static java.sql.Connection c;
	public static java.sql.PreparedStatement stmt;
	
		
	public static void CreateDemoData_Report()
	{
		try{			
			 DriverManager.registerDriver(new org.h2.Driver());
		        c = DriverManager.getConnection("jdbc:h2:mem:test");
		        
		        try
		        {
		        	stmt = c.prepareStatement("DROP TABLE Equipment_Purchases");
		        	stmt.execute();
			        stmt.close();
		        }
		        catch (Exception e)
		        {
		        	
		        }
		        
		        
		        stmt = c.prepareStatement("CREATE TABLE Equipment_Purchases (Project TEXT,ProjectNumber TEXT,PartNumber TEXT,Description TEXT,Vendor TEXT," +
		        		"VendorQuote TEXT,CostfromSupplier TEXT,Quantity TEXT,Comments TEXT,OrderSubmitted TEXT,OrderSubmittedDate TEXT,OrderReceived TEXT,OrderReceivedDate TEXT," +
		        		"POCode TEXT,POSubmitted TEXT,POSubmittedDate TEXT,Shipper TEXT,TrackingNumber TEXT)");	        
		        stmt.execute();	        
		        stmt.close();
		        

		        stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP50E','POWER SUPPLY 1PH 50W 24-48VDC 2.1','Resenhouse','','','1','','Yes','8/16/2012','No','8/16/2012','XX-OO-33','No','8/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-508A-MM-SC','Moxa 8 port managed switch','Logic','','','4','','Yes','8/16/2012','Yes','8/17/2012','XX-OO-33','Yes','8/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-516A-MM-SC','Moxa 16 port managed switch','Logic','','','1','','Yes','8/16/2012','No','8/18/2012','XX-OO-33','No','8/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5F10012P','12F LC LOADED MNT PLT','Resenhouse','','','5','','Yes','8/16/2012','Yes','8/19/2012','XX-OO-33','Yes','8/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5W120N','WALL MOUNT FIBER PATCH PANEL','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/20/2012','XX-OO-33','Yes','8/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','62DLCM01','1M DPLX PATCH CORD','Resenhouse','','','10','','Yes','8/16/2012','Yes','8/21/2012','XX-OO-33','Yes','8/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SMT1500','1500VA LCD 120V UPS','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/22/2012','XX-OO-33','Yes','8/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH010','CIRCUIT BREAKER 250V 22-10AWG','Resenhouse','','','24','','Yes','8/16/2012','Yes','8/23/2012','XX-OO-33','Yes','8/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH020','CIRCUIT BREAKER 250V 22-A10AWG','Resenhouse','','','15','','Yes','8/16/2012','Yes','8/24/2012','XX-OO-33','Yes','8/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH025','SP250V-2.5A CKT BRKR','Resenhouse','','','9','','Yes','8/16/2012','Yes','8/25/2012','XX-OO-33','Yes','8/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH050','CIRCUIT BREAKER 250V 5A 22-10AWG','Resenhouse','','','17','','Yes','8/16/2012','Yes','8/26/2012','XX-OO-33','Yes','8/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH100','CIRCUIT BREAKER 250V 10A 22-10AWG','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/27/2012','XX-OO-33','Yes','8/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GS1G200','CIRCUIT BREAKER','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/28/2012','XX-OO-33','Yes','8/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-PDM3111','115A 3CKT TERM BLK','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/29/2012','XX-OO-33','Yes','8/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XL240E','POWER SUPPLY 1PH 240W 24-28VDC 10','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/30/2012','XX-OO-33','Yes','8/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-AENT','24V DC ETHERNET ADPT','Resenhouse','','','13','','Yes','8/16/2012','Yes','8/31/2012','XX-OO-33','Yes','8/31/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB2','2PT 24VDC SNK DIG INPUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/1/2012','XX-OO-33','Yes','9/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB8','8PT 24VDC SNK DIG INPUT','Resenhouse','','','7','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IE2C','2PT CURRENT AN IN A','Resenhouse','','','17','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB2','2 CHNL SINKING OPT MOD','Resenhouse','','','3','','Yes','8/16/2012','No','9/4/2012','XX-OO-33','No','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB4','4 CHNL SINKING OPT MOD','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB8','24V DC 8 CHANNEL STND OUTPUT','Resenhouse','','','5','','Yes','8/16/2012','No','9/6/2012','XX-OO-33','No','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OE2C','2PT CURRENT AN OUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/7/2012','XX-OO-33','Yes','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OW2','DISTR I/O 24VDC DSPT RELAY','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-TB','DISTR I/O MODULE BASE','Resenhouse','','','65','','No','8/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-VHSC24','24VDC HI SPD COUNTER','Resenhouse','','','11','','Yes','8/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-A10','10SLOT CNTRL LOGIC CHASSI','Resenhouse','','','1','','No','8/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-EN2T','ETHERNET/IP MODULE','Resenhouse','','','2','','Yes','8/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-L64','LOGIX 5564 16MB CONTROLLER','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-N2','EMPTY SLOT FILLER CARD (2PER PKG)','Resenhouse','','','3','','Yes','8/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-OW16I','N.O. ISO RELAY OUTPUT 16PT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-PA75','13A PWR SUPPLY 85-265V','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/16/2012','XX-OO-33','Yes','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1783-MX08T','COP EXPANSION MODULE','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194E-E32-1753','LOAD SWITCH 3P 32A FRONT MOUNT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194L-HE6G-175','ACTUATOR','Resenhouse','','','1','','No','10/16/2012','Yes','9/4/2012','XX-OO-33','Yes','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','600-TEX5','2P TGL MAN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700S-CF620DC','SAFTEY CONTROL RELAY 120V 6NO 2NC','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/6/2012','XX-OO-33','Yes','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','9/7/2012','XX-OO-33','No','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116DEXMSINHCGW','AC/DC DR OPENER','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116EXP','PENDANT MOUNT BRACKET','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A72P60','PANEL ONLY','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A74H6012LP3PT','ENCL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AASHLF1818','18X18 SHELF','Resenhouse','','','3','','No','10/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ALGDSTOP2','LG ENCL DOOR STOP','Resenhouse','','','5','','Yes','10/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ATEMNO','TEMP CONTROL SWITCH','Resenhouse','','','2','','No','10/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DAH4001B','400W 115V HEATER','Resenhouse','','','2','','Yes','10/16/2012','No','9/16/2012','XX-OO-33','No','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','56EATM-TMANAGERMSSQL','OLDI TMANAGER MODULE','Resenhouse','','','1','','No','10/16/2012','Yes','9/17/2012','XX-OO-33','Yes','9/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','MVI56-AFC','PROSOFT GAS & FLOW MODULE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/18/2012','XX-OO-33','Yes','9/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SDU500','OFF-LINE DIN RAIL UPS','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/19/2012','XX-OO-33','Yes','9/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-C16ZJ10','IEC CONTACTOR 600V 16A 24VDC COIL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/20/2012','XX-OO-33','Yes','9/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-FA11','IEC AUX CONTACT 1NO-1NC FRONT MOU','Resenhouse','','','1','','Yes','10/16/2012','No','9/21/2012','XX-OO-33','No','9/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH030','CIRCUIT BREAKER 250V 3A 22-10AWG','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/22/2012','XX-OO-33','Yes','9/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH070','SP250V-7.0A CKT BRKR','Resenhouse','','','1','','Yes','10/16/2012','No','9/23/2012','XX-OO-33','No','9/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB4','DIST I/O 4INPUT 24VDC SINK','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/24/2012','XX-OO-33','Yes','9/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-CJJ6-10','CENTER JUMPER 10 POLE FOR J4 J4M','Resenhouse','','','10','','No','10/16/2012','No','9/25/2012','XX-OO-33','No','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33A1','3PDT 120VAC GEN RELAY 10A 11 PIN','Resenhouse','','','4','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33Z24','3PDT 24VDC GEN RELAY 10A 11 PIN','Resenhouse','','','3','','Yes','10/16/2012','Yes','9/29/2012','XX-OO-33','Yes','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HN126','SOCKET FOR 11 PIN 3PDT 700HA RELA','Resenhouse','','','7','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-30WN','LEGEND DIAL ACCY','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/1/2012','XX-OO-33','Yes','10/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-ALP','PLASTIC MOUNTING LATCH','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X01','CONTACT BLOCK 1 NC BACK OF PANEL','Resenhouse','','','10','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X10','CONTACT BLOCK 1 NO BACK OF PANEL','Resenhouse','','','10','','No','10/16/2012','Yes','9/25/2012','XX-OO-33','Yes','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F2PX10','MOMENTARY PBTN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F3PX10','MOMENTARY PBTN','Resenhouse','','','1','','No','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-P7PD5C','PLS PILOT LGT','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM22','SEL SW MAINT 2POS PLAST NON-ILLUM','Resenhouse','','','1','','No','10/16/2012','No','9/29/2012','XX-OO-33','No','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM32','SEL SW MAINT 3POS PLAST NON-ILLUM','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','10/1/2012','XX-OO-33','No','10/1/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD1','CONTACT BLOCK 1NO','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD4','CONT BLK 1NC','Resenhouse','','','1','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','855TP-G24D4','24V STACK LIGHT','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/4/2012','XX-OO-33','Yes','10/4/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-POT6','POTENTIOMETER 22.5MM 10K OHM','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/5/2012','XX-OO-33','Yes','10/5/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48H36DLP','12-IN DEEP NMA4 ENC','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/6/2012','XX-OO-33','Yes','10/6/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AFK2412','ENCL FLOOR STAND-SET2','Resenhouse','','','1','','No','10/16/2012','Yes','10/7/2012','XX-OO-33','Yes','10/7/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48P36','HOFFMAN 45X33 PANEL','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/8/2012','XX-OO-33','Yes','10/8/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP100E','POWER SUPPLY 1PH 100W 24-28V 4.2A','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/9/2012','XX-OO-33','Yes','10/9/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HLT1U1X','ELECTROMECH OPT RLY','Resenhouse','','','30','','Yes','10/16/2012','Yes','10/10/2012','XX-OO-33','Yes','10/10/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DSPSX000','RED LION DSPX','Barthorp','','','3','','Yes','10/16/2012','No','10/11/2012','XX-OO-33','No','10/11/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2865340','Phoenix Contact:   MACX MCR-EX-SL-RPSSI-I Repeater Power Supply (Analogs)','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/12/2012','XX-OO-33','Yes','10/12/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2869728','PHOENIX CONTACT DIN CONNECTOR','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/13/2012','XX-OO-33','Yes','10/13/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2966281','Phoenix Contact Relay/Base','Resenhouse','','','24','','Yes','10/16/2012','Yes','10/14/2012','XX-OO-33','Yes','10/14/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','PLS257','A.P.C.S. Pulse Splitters for Main Skid and VFD Panel','Resenhouse','','','11','','No','10/16/2012','Yes','10/15/2012','XX-OO-33','Yes','10/15/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','E1200','Linksys Wireless Router','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/16/2012','XX-OO-33','Yes','10/16/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP50E','POWER SUPPLY 1PH 50W 24-48VDC 2.1','Resenhouse','','','1','','Yes','8/16/2012','No','8/16/2012','XX-OO-33','No','8/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-508A-MM-SC','Moxa 8 port managed switch','Logic','','','4','','Yes','8/16/2012','Yes','8/17/2012','XX-OO-33','Yes','8/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-516A-MM-SC','Moxa 16 port managed switch','Logic','','','1','','Yes','8/16/2012','No','8/18/2012','XX-OO-33','No','8/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5F10012P','12F LC LOADED MNT PLT','Resenhouse','','','5','','Yes','8/16/2012','Yes','8/19/2012','XX-OO-33','Yes','8/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5W120N','WALL MOUNT FIBER PATCH PANEL','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/20/2012','XX-OO-33','Yes','8/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','62DLCM01','1M DPLX PATCH CORD','Resenhouse','','','10','','Yes','8/16/2012','Yes','8/21/2012','XX-OO-33','Yes','8/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SMT1500','1500VA LCD 120V UPS','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/22/2012','XX-OO-33','Yes','8/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH010','CIRCUIT BREAKER 250V 22-10AWG','Resenhouse','','','24','','Yes','8/16/2012','Yes','8/23/2012','XX-OO-33','Yes','8/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH020','CIRCUIT BREAKER 250V 22-A10AWG','Resenhouse','','','15','','Yes','8/16/2012','Yes','8/24/2012','XX-OO-33','Yes','8/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH025','SP250V-2.5A CKT BRKR','Resenhouse','','','9','','Yes','8/16/2012','Yes','8/25/2012','XX-OO-33','Yes','8/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH050','CIRCUIT BREAKER 250V 5A 22-10AWG','Resenhouse','','','17','','Yes','8/16/2012','Yes','8/26/2012','XX-OO-33','Yes','8/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH100','CIRCUIT BREAKER 250V 10A 22-10AWG','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/27/2012','XX-OO-33','Yes','8/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GS1G200','CIRCUIT BREAKER','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/28/2012','XX-OO-33','Yes','8/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-PDM3111','115A 3CKT TERM BLK','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/29/2012','XX-OO-33','Yes','8/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XL240E','POWER SUPPLY 1PH 240W 24-28VDC 10','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/30/2012','XX-OO-33','Yes','8/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-AENT','24V DC ETHERNET ADPT','Resenhouse','','','13','','Yes','8/16/2012','Yes','8/31/2012','XX-OO-33','Yes','8/31/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB2','2PT 24VDC SNK DIG INPUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/1/2012','XX-OO-33','Yes','9/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB8','8PT 24VDC SNK DIG INPUT','Resenhouse','','','7','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IE2C','2PT CURRENT AN IN A','Resenhouse','','','17','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB2','2 CHNL SINKING OPT MOD','Resenhouse','','','3','','Yes','8/16/2012','No','9/4/2012','XX-OO-33','No','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB4','4 CHNL SINKING OPT MOD','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB8','24V DC 8 CHANNEL STND OUTPUT','Resenhouse','','','5','','Yes','8/16/2012','No','9/6/2012','XX-OO-33','No','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OE2C','2PT CURRENT AN OUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/7/2012','XX-OO-33','Yes','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OW2','DISTR I/O 24VDC DSPT RELAY','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-TB','DISTR I/O MODULE BASE','Resenhouse','','','65','','No','8/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-VHSC24','24VDC HI SPD COUNTER','Resenhouse','','','11','','Yes','8/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-A10','10SLOT CNTRL LOGIC CHASSI','Resenhouse','','','1','','No','8/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-EN2T','ETHERNET/IP MODULE','Resenhouse','','','2','','Yes','8/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-L64','LOGIX 5564 16MB CONTROLLER','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-N2','EMPTY SLOT FILLER CARD (2PER PKG)','Resenhouse','','','3','','Yes','8/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-OW16I','N.O. ISO RELAY OUTPUT 16PT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-PA75','13A PWR SUPPLY 85-265V','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/16/2012','XX-OO-33','Yes','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1783-MX08T','COP EXPANSION MODULE','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194E-E32-1753','LOAD SWITCH 3P 32A FRONT MOUNT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194L-HE6G-175','ACTUATOR','Resenhouse','','','1','','No','10/16/2012','Yes','9/4/2012','XX-OO-33','Yes','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','600-TEX5','2P TGL MAN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700S-CF620DC','SAFTEY CONTROL RELAY 120V 6NO 2NC','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/6/2012','XX-OO-33','Yes','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','9/7/2012','XX-OO-33','No','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116DEXMSINHCGW','AC/DC DR OPENER','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116EXP','PENDANT MOUNT BRACKET','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A72P60','PANEL ONLY','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A74H6012LP3PT','ENCL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AASHLF1818','18X18 SHELF','Resenhouse','','','3','','No','10/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ALGDSTOP2','LG ENCL DOOR STOP','Resenhouse','','','5','','Yes','10/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ATEMNO','TEMP CONTROL SWITCH','Resenhouse','','','2','','No','10/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DAH4001B','400W 115V HEATER','Resenhouse','','','2','','Yes','10/16/2012','No','9/16/2012','XX-OO-33','No','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','56EATM-TMANAGERMSSQL','OLDI TMANAGER MODULE','Resenhouse','','','1','','No','10/16/2012','Yes','9/17/2012','XX-OO-33','Yes','9/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','MVI56-AFC','PROSOFT GAS & FLOW MODULE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/18/2012','XX-OO-33','Yes','9/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SDU500','OFF-LINE DIN RAIL UPS','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/19/2012','XX-OO-33','Yes','9/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-C16ZJ10','IEC CONTACTOR 600V 16A 24VDC COIL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/20/2012','XX-OO-33','Yes','9/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-FA11','IEC AUX CONTACT 1NO-1NC FRONT MOU','Resenhouse','','','1','','Yes','10/16/2012','No','9/21/2012','XX-OO-33','No','9/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH030','CIRCUIT BREAKER 250V 3A 22-10AWG','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/22/2012','XX-OO-33','Yes','9/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH070','SP250V-7.0A CKT BRKR','Resenhouse','','','1','','Yes','10/16/2012','No','9/23/2012','XX-OO-33','No','9/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB4','DIST I/O 4INPUT 24VDC SINK','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/24/2012','XX-OO-33','Yes','9/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-CJJ6-10','CENTER JUMPER 10 POLE FOR J4 J4M','Resenhouse','','','10','','No','10/16/2012','No','9/25/2012','XX-OO-33','No','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33A1','3PDT 120VAC GEN RELAY 10A 11 PIN','Resenhouse','','','4','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33Z24','3PDT 24VDC GEN RELAY 10A 11 PIN','Resenhouse','','','3','','Yes','10/16/2012','Yes','9/29/2012','XX-OO-33','Yes','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HN126','SOCKET FOR 11 PIN 3PDT 700HA RELA','Resenhouse','','','7','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-30WN','LEGEND DIAL ACCY','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/1/2012','XX-OO-33','Yes','10/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-ALP','PLASTIC MOUNTING LATCH','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X01','CONTACT BLOCK 1 NC BACK OF PANEL','Resenhouse','','','10','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X10','CONTACT BLOCK 1 NO BACK OF PANEL','Resenhouse','','','10','','No','10/16/2012','Yes','9/25/2012','XX-OO-33','Yes','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F2PX10','MOMENTARY PBTN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F3PX10','MOMENTARY PBTN','Resenhouse','','','1','','No','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-P7PD5C','PLS PILOT LGT','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM22','SEL SW MAINT 2POS PLAST NON-ILLUM','Resenhouse','','','1','','No','10/16/2012','No','9/29/2012','XX-OO-33','No','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			   
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM32','SEL SW MAINT 3POS PLAST NON-ILLUM','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','10/1/2012','XX-OO-33','No','10/1/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD1','CONTACT BLOCK 1NO','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD4','CONT BLK 1NC','Resenhouse','','','1','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','855TP-G24D4','24V STACK LIGHT','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/4/2012','XX-OO-33','Yes','10/4/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-POT6','POTENTIOMETER 22.5MM 10K OHM','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/5/2012','XX-OO-33','Yes','10/5/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48H36DLP','12-IN DEEP NMA4 ENC','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/6/2012','XX-OO-33','Yes','10/6/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AFK2412','ENCL FLOOR STAND-SET2','Resenhouse','','','1','','No','10/16/2012','Yes','10/7/2012','XX-OO-33','Yes','10/7/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48P36','HOFFMAN 45X33 PANEL','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/8/2012','XX-OO-33','Yes','10/8/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP100E','POWER SUPPLY 1PH 100W 24-28V 4.2A','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/9/2012','XX-OO-33','Yes','10/9/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HLT1U1X','ELECTROMECH OPT RLY','Resenhouse','','','30','','Yes','10/16/2012','Yes','10/10/2012','XX-OO-33','Yes','10/10/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DSPSX000','RED LION DSPX','Barthorp','','','3','','Yes','10/16/2012','No','10/11/2012','XX-OO-33','No','10/11/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2865340','Phoenix Contact:   MACX MCR-EX-SL-RPSSI-I Repeater Power Supply (Analogs)','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/12/2012','XX-OO-33','Yes','10/12/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2869728','PHOENIX CONTACT DIN CONNECTOR','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/13/2012','XX-OO-33','Yes','10/13/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2966281','Phoenix Contact Relay/Base','Resenhouse','','','24','','Yes','10/16/2012','Yes','10/14/2012','XX-OO-33','Yes','10/14/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','PLS257','A.P.C.S. Pulse Splitters for Main Skid and VFD Panel','Resenhouse','','','11','','No','10/16/2012','Yes','10/15/2012','XX-OO-33','Yes','10/15/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','E1200','Linksys Wireless Router','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/16/2012','XX-OO-33','Yes','10/16/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

	
			    
		    
		      
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}
	
	
	public static void CreateDemoData_QuickView()
	{
		try{			
			 DriverManager.registerDriver(new org.h2.Driver());
		        c = DriverManager.getConnection("jdbc:h2:mem:test");
		        
		        try
		        {
		        	stmt = c.prepareStatement("DROP TABLE Equipment_Purchases");
		        	stmt.execute();
			        stmt.close();
		        }
		        catch (Exception e)
		        {
		        	
		        }
		        
		        
		        stmt = c.prepareStatement("CREATE TABLE Equipment_Purchases (Project TEXT,ProjectNumber TEXT,PartNumber TEXT,Description TEXT,Vendor TEXT," +
		        		"VendorQuote TEXT,CostfromSupplier TEXT,Quantity TEXT,Comments TEXT,OrderSubmitted TEXT,OrderSubmittedDate TEXT,OrderReceived TEXT,OrderReceivedDate TEXT," +
		        		"POCode TEXT,POSubmitted TEXT,POSubmittedDate TEXT,Shipper TEXT,TrackingNumber TEXT)");	        
		        stmt.execute();	        
		        stmt.close();
		        
		        
		        
		        stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP50E','POWER SUPPLY 1PH 50W 24-48VDC 2.1','Resenhouse','','','1','','Yes','8/16/2012','No','8/16/2012','XX-OO-33','No','8/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-508A-MM-SC','Moxa 8 port managed switch','Logic','','','4','','Yes','8/16/2012','Yes','8/17/2012','XX-OO-33','Yes','8/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-516A-MM-SC','Moxa 16 port managed switch','Logic','','','1','','Yes','8/16/2012','No','8/18/2012','XX-OO-33','No','8/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5F10012P','12F LC LOADED MNT PLT','Resenhouse','','','5','','Yes','8/16/2012','Yes','8/19/2012','XX-OO-33','Yes','8/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5W120N','WALL MOUNT FIBER PATCH PANEL','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/20/2012','XX-OO-33','Yes','8/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','62DLCM01','1M DPLX PATCH CORD','Resenhouse','','','10','','Yes','8/16/2012','Yes','8/21/2012','XX-OO-33','Yes','8/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SMT1500','1500VA LCD 120V UPS','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/22/2012','XX-OO-33','Yes','8/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH010','CIRCUIT BREAKER 250V 22-10AWG','Resenhouse','','','24','','Yes','8/16/2012','Yes','8/23/2012','XX-OO-33','Yes','8/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH020','CIRCUIT BREAKER 250V 22-A10AWG','Resenhouse','','','15','','Yes','8/16/2012','Yes','8/24/2012','XX-OO-33','Yes','8/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH025','SP250V-2.5A CKT BRKR','Resenhouse','','','9','','Yes','8/16/2012','Yes','8/25/2012','XX-OO-33','Yes','8/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH050','CIRCUIT BREAKER 250V 5A 22-10AWG','Resenhouse','','','17','','Yes','8/16/2012','Yes','8/26/2012','XX-OO-33','Yes','8/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH100','CIRCUIT BREAKER 250V 10A 22-10AWG','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/27/2012','XX-OO-33','Yes','8/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GS1G200','CIRCUIT BREAKER','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/28/2012','XX-OO-33','Yes','8/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-PDM3111','115A 3CKT TERM BLK','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/29/2012','XX-OO-33','Yes','8/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XL240E','POWER SUPPLY 1PH 240W 24-28VDC 10','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/30/2012','XX-OO-33','Yes','8/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-AENT','24V DC ETHERNET ADPT','Resenhouse','','','13','','Yes','8/16/2012','Yes','8/31/2012','XX-OO-33','Yes','8/31/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB2','2PT 24VDC SNK DIG INPUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/1/2012','XX-OO-33','Yes','9/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB8','8PT 24VDC SNK DIG INPUT','Resenhouse','','','7','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IE2C','2PT CURRENT AN IN A','Resenhouse','','','17','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB2','2 CHNL SINKING OPT MOD','Resenhouse','','','3','','Yes','8/16/2012','No','9/4/2012','XX-OO-33','No','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB4','4 CHNL SINKING OPT MOD','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB8','24V DC 8 CHANNEL STND OUTPUT','Resenhouse','','','5','','Yes','8/16/2012','No','9/6/2012','XX-OO-33','No','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OE2C','2PT CURRENT AN OUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/7/2012','XX-OO-33','Yes','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OW2','DISTR I/O 24VDC DSPT RELAY','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-TB','DISTR I/O MODULE BASE','Resenhouse','','','65','','No','8/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-VHSC24','24VDC HI SPD COUNTER','Resenhouse','','','11','','Yes','8/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-A10','10SLOT CNTRL LOGIC CHASSI','Resenhouse','','','1','','No','8/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-EN2T','ETHERNET/IP MODULE','Resenhouse','','','2','','Yes','8/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-L64','LOGIX 5564 16MB CONTROLLER','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-N2','EMPTY SLOT FILLER CARD (2PER PKG)','Resenhouse','','','3','','Yes','8/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-OW16I','N.O. ISO RELAY OUTPUT 16PT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-PA75','13A PWR SUPPLY 85-265V','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/16/2012','XX-OO-33','Yes','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1783-MX08T','COP EXPANSION MODULE','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194E-E32-1753','LOAD SWITCH 3P 32A FRONT MOUNT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194L-HE6G-175','ACTUATOR','Resenhouse','','','1','','No','10/16/2012','Yes','9/4/2012','XX-OO-33','Yes','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','600-TEX5','2P TGL MAN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700S-CF620DC','SAFTEY CONTROL RELAY 120V 6NO 2NC','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/6/2012','XX-OO-33','Yes','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','9/7/2012','XX-OO-33','No','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116DEXMSINHCGW','AC/DC DR OPENER','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116EXP','PENDANT MOUNT BRACKET','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A72P60','PANEL ONLY','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A74H6012LP3PT','ENCL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AASHLF1818','18X18 SHELF','Resenhouse','','','3','','No','10/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ALGDSTOP2','LG ENCL DOOR STOP','Resenhouse','','','5','','Yes','10/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ATEMNO','TEMP CONTROL SWITCH','Resenhouse','','','2','','No','10/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DAH4001B','400W 115V HEATER','Resenhouse','','','2','','Yes','10/16/2012','No','9/16/2012','XX-OO-33','No','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','56EATM-TMANAGERMSSQL','OLDI TMANAGER MODULE','Resenhouse','','','1','','No','10/16/2012','Yes','9/17/2012','XX-OO-33','Yes','9/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','MVI56-AFC','PROSOFT GAS & FLOW MODULE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/18/2012','XX-OO-33','Yes','9/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SDU500','OFF-LINE DIN RAIL UPS','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/19/2012','XX-OO-33','Yes','9/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-C16ZJ10','IEC CONTACTOR 600V 16A 24VDC COIL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/20/2012','XX-OO-33','Yes','9/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-FA11','IEC AUX CONTACT 1NO-1NC FRONT MOU','Resenhouse','','','1','','Yes','10/16/2012','No','9/21/2012','XX-OO-33','No','9/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH030','CIRCUIT BREAKER 250V 3A 22-10AWG','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/22/2012','XX-OO-33','Yes','9/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH070','SP250V-7.0A CKT BRKR','Resenhouse','','','1','','Yes','10/16/2012','No','9/23/2012','XX-OO-33','No','9/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB4','DIST I/O 4INPUT 24VDC SINK','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/24/2012','XX-OO-33','Yes','9/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-CJJ6-10','CENTER JUMPER 10 POLE FOR J4 J4M','Resenhouse','','','10','','No','10/16/2012','No','9/25/2012','XX-OO-33','No','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33A1','3PDT 120VAC GEN RELAY 10A 11 PIN','Resenhouse','','','4','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33Z24','3PDT 24VDC GEN RELAY 10A 11 PIN','Resenhouse','','','3','','Yes','10/16/2012','Yes','9/29/2012','XX-OO-33','Yes','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HN126','SOCKET FOR 11 PIN 3PDT 700HA RELA','Resenhouse','','','7','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-30WN','LEGEND DIAL ACCY','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/1/2012','XX-OO-33','Yes','10/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-ALP','PLASTIC MOUNTING LATCH','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X01','CONTACT BLOCK 1 NC BACK OF PANEL','Resenhouse','','','10','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X10','CONTACT BLOCK 1 NO BACK OF PANEL','Resenhouse','','','10','','No','10/16/2012','Yes','9/25/2012','XX-OO-33','Yes','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F2PX10','MOMENTARY PBTN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F3PX10','MOMENTARY PBTN','Resenhouse','','','1','','No','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-P7PD5C','PLS PILOT LGT','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM22','SEL SW MAINT 2POS PLAST NON-ILLUM','Resenhouse','','','1','','No','10/16/2012','No','9/29/2012','XX-OO-33','No','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM32','SEL SW MAINT 3POS PLAST NON-ILLUM','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','10/1/2012','XX-OO-33','No','10/1/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD1','CONTACT BLOCK 1NO','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD4','CONT BLK 1NC','Resenhouse','','','1','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','855TP-G24D4','24V STACK LIGHT','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/4/2012','XX-OO-33','Yes','10/4/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-POT6','POTENTIOMETER 22.5MM 10K OHM','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/5/2012','XX-OO-33','Yes','10/5/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48H36DLP','12-IN DEEP NMA4 ENC','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/6/2012','XX-OO-33','Yes','10/6/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AFK2412','ENCL FLOOR STAND-SET2','Resenhouse','','','1','','No','10/16/2012','Yes','10/7/2012','XX-OO-33','Yes','10/7/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48P36','HOFFMAN 45X33 PANEL','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/8/2012','XX-OO-33','Yes','10/8/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP100E','POWER SUPPLY 1PH 100W 24-28V 4.2A','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/9/2012','XX-OO-33','Yes','10/9/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HLT1U1X','ELECTROMECH OPT RLY','Resenhouse','','','30','','Yes','10/16/2012','Yes','10/10/2012','XX-OO-33','Yes','10/10/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DSPSX000','RED LION DSPX','Barthorp','','','3','','Yes','10/16/2012','No','10/11/2012','XX-OO-33','No','10/11/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2865340','Phoenix Contact:   MACX MCR-EX-SL-RPSSI-I Repeater Power Supply (Analogs)','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/12/2012','XX-OO-33','Yes','10/12/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2869728','PHOENIX CONTACT DIN CONNECTOR','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/13/2012','XX-OO-33','Yes','10/13/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2966281','Phoenix Contact Relay/Base','Resenhouse','','','24','','Yes','10/16/2012','Yes','10/14/2012','XX-OO-33','Yes','10/14/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','PLS257','A.P.C.S. Pulse Splitters for Main Skid and VFD Panel','Resenhouse','','','11','','No','10/16/2012','Yes','10/15/2012','XX-OO-33','Yes','10/15/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','E1200','Linksys Wireless Router','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/16/2012','XX-OO-33','Yes','10/16/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP50E','POWER SUPPLY 1PH 50W 24-48VDC 2.1','Resenhouse','','','1','','Yes','8/16/2012','No','8/16/2012','XX-OO-33','No','8/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-508A-MM-SC','Moxa 8 port managed switch','Logic','','','4','','Yes','8/16/2012','Yes','8/17/2012','XX-OO-33','Yes','8/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','EDS-516A-MM-SC','Moxa 16 port managed switch','Logic','','','1','','Yes','8/16/2012','No','8/18/2012','XX-OO-33','No','8/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5F10012P','12F LC LOADED MNT PLT','Resenhouse','','','5','','Yes','8/16/2012','Yes','8/19/2012','XX-OO-33','Yes','8/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','5W120N','WALL MOUNT FIBER PATCH PANEL','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/20/2012','XX-OO-33','Yes','8/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','62DLCM01','1M DPLX PATCH CORD','Resenhouse','','','10','','Yes','8/16/2012','Yes','8/21/2012','XX-OO-33','Yes','8/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SMT1500','1500VA LCD 120V UPS','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/22/2012','XX-OO-33','Yes','8/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH010','CIRCUIT BREAKER 250V 22-10AWG','Resenhouse','','','24','','Yes','8/16/2012','Yes','8/23/2012','XX-OO-33','Yes','8/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH020','CIRCUIT BREAKER 250V 22-A10AWG','Resenhouse','','','15','','Yes','8/16/2012','Yes','8/24/2012','XX-OO-33','Yes','8/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH025','SP250V-2.5A CKT BRKR','Resenhouse','','','9','','Yes','8/16/2012','Yes','8/25/2012','XX-OO-33','Yes','8/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH050','CIRCUIT BREAKER 250V 5A 22-10AWG','Resenhouse','','','17','','Yes','8/16/2012','Yes','8/26/2012','XX-OO-33','Yes','8/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH100','CIRCUIT BREAKER 250V 10A 22-10AWG','Resenhouse','','','3','','Yes','8/16/2012','Yes','8/27/2012','XX-OO-33','Yes','8/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GS1G200','CIRCUIT BREAKER','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/28/2012','XX-OO-33','Yes','8/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-PDM3111','115A 3CKT TERM BLK','Resenhouse','','','1','','Yes','8/16/2012','Yes','8/29/2012','XX-OO-33','Yes','8/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XL240E','POWER SUPPLY 1PH 240W 24-28VDC 10','Resenhouse','','','2','','Yes','8/16/2012','Yes','8/30/2012','XX-OO-33','Yes','8/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-AENT','24V DC ETHERNET ADPT','Resenhouse','','','13','','Yes','8/16/2012','Yes','8/31/2012','XX-OO-33','Yes','8/31/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB2','2PT 24VDC SNK DIG INPUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/1/2012','XX-OO-33','Yes','9/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB8','8PT 24VDC SNK DIG INPUT','Resenhouse','','','7','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IE2C','2PT CURRENT AN IN A','Resenhouse','','','17','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB2','2 CHNL SINKING OPT MOD','Resenhouse','','','3','','Yes','8/16/2012','No','9/4/2012','XX-OO-33','No','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB4','4 CHNL SINKING OPT MOD','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OB8','24V DC 8 CHANNEL STND OUTPUT','Resenhouse','','','5','','Yes','8/16/2012','No','9/6/2012','XX-OO-33','No','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OE2C','2PT CURRENT AN OUT','Resenhouse','','','4','','Yes','8/16/2012','Yes','9/7/2012','XX-OO-33','Yes','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-OW2','DISTR I/O 24VDC DSPT RELAY','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-TB','DISTR I/O MODULE BASE','Resenhouse','','','65','','No','8/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-VHSC24','24VDC HI SPD COUNTER','Resenhouse','','','11','','Yes','8/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-A10','10SLOT CNTRL LOGIC CHASSI','Resenhouse','','','1','','No','8/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-EN2T','ETHERNET/IP MODULE','Resenhouse','','','2','','Yes','8/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-L64','LOGIX 5564 16MB CONTROLLER','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-N2','EMPTY SLOT FILLER CARD (2PER PKG)','Resenhouse','','','3','','Yes','8/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-OW16I','N.O. ISO RELAY OUTPUT 16PT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1756-PA75','13A PWR SUPPLY 85-265V','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/16/2012','XX-OO-33','Yes','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1783-MX08T','COP EXPANSION MODULE','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/2/2012','XX-OO-33','Yes','9/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194E-E32-1753','LOAD SWITCH 3P 32A FRONT MOUNT','Resenhouse','','','1','','Yes','8/16/2012','Yes','9/3/2012','XX-OO-33','Yes','9/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','194L-HE6G-175','ACTUATOR','Resenhouse','','','1','','No','10/16/2012','Yes','9/4/2012','XX-OO-33','Yes','9/4/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','600-TEX5','2P TGL MAN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/5/2012','XX-OO-33','Yes','9/5/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700S-CF620DC','SAFTEY CONTROL RELAY 120V 6NO 2NC','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/6/2012','XX-OO-33','Yes','9/6/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','9/7/2012','XX-OO-33','No','9/7/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/8/2012','XX-OO-33','Yes','9/8/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116DEXMSINHCGW','AC/DC DR OPENER','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/9/2012','XX-OO-33','Yes','9/9/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','116EXP','PENDANT MOUNT BRACKET','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/10/2012','XX-OO-33','Yes','9/10/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A72P60','PANEL ONLY','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/11/2012','XX-OO-33','Yes','9/11/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A74H6012LP3PT','ENCL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/12/2012','XX-OO-33','Yes','9/12/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AASHLF1818','18X18 SHELF','Resenhouse','','','3','','No','10/16/2012','Yes','9/13/2012','XX-OO-33','Yes','9/13/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ALGDSTOP2','LG ENCL DOOR STOP','Resenhouse','','','5','','Yes','10/16/2012','Yes','9/14/2012','XX-OO-33','Yes','9/14/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','ATEMNO','TEMP CONTROL SWITCH','Resenhouse','','','2','','No','10/16/2012','Yes','9/15/2012','XX-OO-33','Yes','9/15/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DAH4001B','400W 115V HEATER','Resenhouse','','','2','','Yes','10/16/2012','No','9/16/2012','XX-OO-33','No','9/16/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','56EATM-TMANAGERMSSQL','OLDI TMANAGER MODULE','Resenhouse','','','1','','No','10/16/2012','Yes','9/17/2012','XX-OO-33','Yes','9/17/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','MVI56-AFC','PROSOFT GAS & FLOW MODULE','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/18/2012','XX-OO-33','Yes','9/18/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','SDU500','OFF-LINE DIN RAIL UPS','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/19/2012','XX-OO-33','Yes','9/19/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-C16ZJ10','IEC CONTACTOR 600V 16A 24VDC COIL','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/20/2012','XX-OO-33','Yes','9/20/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','100-FA11','IEC AUX CONTACT 1NO-1NC FRONT MOU','Resenhouse','','','1','','Yes','10/16/2012','No','9/21/2012','XX-OO-33','No','9/21/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH030','CIRCUIT BREAKER 250V 3A 22-10AWG','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/22/2012','XX-OO-33','Yes','9/22/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-GH070','SP250V-7.0A CKT BRKR','Resenhouse','','','1','','Yes','10/16/2012','No','9/23/2012','XX-OO-33','No','9/23/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1734-IB4','DIST I/O 4INPUT 24VDC SINK','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/24/2012','XX-OO-33','Yes','9/24/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1492-CJJ6-10','CENTER JUMPER 10 POLE FOR J4 J4M','Resenhouse','','','10','','No','10/16/2012','No','9/25/2012','XX-OO-33','No','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-NP40J','PB STATION BASE','Resenhouse','','','2','','Yes','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33A1','3PDT 120VAC GEN RELAY 10A 11 PIN','Resenhouse','','','4','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HA33Z24','3PDT 24VDC GEN RELAY 10A 11 PIN','Resenhouse','','','3','','Yes','10/16/2012','Yes','9/29/2012','XX-OO-33','Yes','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HN126','SOCKET FOR 11 PIN 3PDT 700HA RELA','Resenhouse','','','7','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-30WN','LEGEND DIAL ACCY','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/1/2012','XX-OO-33','Yes','10/1/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-ALP','PLASTIC MOUNTING LATCH','Resenhouse','','','10','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X01','CONTACT BLOCK 1 NC BACK OF PANEL','Resenhouse','','','10','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800F-X10','CONTACT BLOCK 1 NO BACK OF PANEL','Resenhouse','','','10','','No','10/16/2012','Yes','9/25/2012','XX-OO-33','Yes','9/25/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F2PX10','MOMENTARY PBTN','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/26/2012','XX-OO-33','Yes','9/26/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-F3PX10','MOMENTARY PBTN','Resenhouse','','','1','','No','10/16/2012','Yes','9/27/2012','XX-OO-33','Yes','9/27/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-P7PD5C','PLS PILOT LGT','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/28/2012','XX-OO-33','Yes','9/28/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM22','SEL SW MAINT 2POS PLAST NON-ILLUM','Resenhouse','','','1','','No','10/16/2012','No','9/29/2012','XX-OO-33','No','9/29/2012','UPS','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			   
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-SM32','SEL SW MAINT 3POS PLAST NON-ILLUM','Resenhouse','','','1','','Yes','10/16/2012','Yes','9/30/2012','XX-OO-33','Yes','9/30/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800H-FPXJ6A1','SWITCH PUSHBUTTON','Resenhouse','','','1','','Yes','10/16/2012','No','10/1/2012','XX-OO-33','No','10/1/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD1','CONTACT BLOCK 1NO','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/2/2012','XX-OO-33','Yes','10/2/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800T-XD4','CONT BLK 1NC','Resenhouse','','','1','','Yes','10/16/2012','No','10/3/2012','XX-OO-33','No','10/3/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','855TP-G24D4','24V STACK LIGHT','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/4/2012','XX-OO-33','Yes','10/4/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','800FP-POT6','POTENTIOMETER 22.5MM 10K OHM','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/5/2012','XX-OO-33','Yes','10/5/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48H36DLP','12-IN DEEP NMA4 ENC','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/6/2012','XX-OO-33','Yes','10/6/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','AFK2412','ENCL FLOOR STAND-SET2','Resenhouse','','','1','','No','10/16/2012','Yes','10/7/2012','XX-OO-33','Yes','10/7/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','A48P36','HOFFMAN 45X33 PANEL','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/8/2012','XX-OO-33','Yes','10/8/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','1606-XLP100E','POWER SUPPLY 1PH 100W 24-28V 4.2A','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/9/2012','XX-OO-33','Yes','10/9/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','700-HLT1U1X','ELECTROMECH OPT RLY','Resenhouse','','','30','','Yes','10/16/2012','Yes','10/10/2012','XX-OO-33','Yes','10/10/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','DSPSX000','RED LION DSPX','Barthorp','','','3','','Yes','10/16/2012','No','10/11/2012','XX-OO-33','No','10/11/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2865340','Phoenix Contact:   MACX MCR-EX-SL-RPSSI-I Repeater Power Supply (Analogs)','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/12/2012','XX-OO-33','Yes','10/12/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();
			    
			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2869728','PHOENIX CONTACT DIN CONNECTOR','Resenhouse','','','28','','Yes','10/16/2012','Yes','10/13/2012','XX-OO-33','Yes','10/13/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','2966281','Phoenix Contact Relay/Base','Resenhouse','','','24','','Yes','10/16/2012','Yes','10/14/2012','XX-OO-33','Yes','10/14/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','PLS257','A.P.C.S. Pulse Splitters for Main Skid and VFD Panel','Resenhouse','','','11','','No','10/16/2012','Yes','10/15/2012','XX-OO-33','Yes','10/15/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

			    stmt = c.prepareStatement("INSERT INTO Equipment_Purchases(Project,ProjectNumber,PartNumber,Description,Vendor,VendorQuote,CostfromSupplier,Quantity,Comments," +
						"OrderSubmitted,OrderSubmittedDate,OrderReceived,OrderReceivedDate,POCode,POSubmitted,POSubmittedDate,Shipper,TrackingNumber) " +
						"VALUES('Columbus','800881','E1200','Linksys Wireless Router','Resenhouse','','','1','','Yes','10/16/2012','Yes','10/16/2012','XX-OO-33','Yes','10/16/2012','FEDEX','XTGAEEBGEE3134')");
		        stmt.execute();
			    stmt.close();

	
			    
		        
		      
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}
	
	
}
