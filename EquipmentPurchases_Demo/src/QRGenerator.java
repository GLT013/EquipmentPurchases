
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException; 

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRGenerator {
	
	public static void Generate()
	{
		try{
		String vendor = "Vendor: " + QuickLookUpGUI.Vendor_txtField.getText() + "\n";
		String vendorquote ="Vendor Quote #: " + QuickLookUpGUI.VendorQuote_txtField.getText() + "\n";
		String project = "Project: " + QuickLookUpGUI.eqList.getSelectedValue().toString() + "\n";
		String projectnum ="Project #: " + QuickLookUpGUI.eq2List.getSelectedValue().toString()+ "\n";
		String partnum ="Part #: " + QuickLookUpGUI.eq3List.getSelectedValue().toString()+ "\n";
		String cost ="Cost: " + QuickLookUpGUI.Cost_txtField.toString()+ "\n";
		String pocode ="PO Code: " + QuickLookUpGUI.pocode_txtField.getText().toString()+ "\n";
		String shipper ="Shipper: " + QuickLookUpGUI.shipper_txtField.getText().toString()+ "\n";
		String tracking ="Tracking #: " + QuickLookUpGUI.trackingnumber_txtField.getText().toString()+ "\n";
		String comments ="Comments: " + QuickLookUpGUI.comments_txtArea.getText().toString()+ "\n";		
		String description ="Description: " + QuickLookUpGUI.Description_textArea.getText()+ "\n";
		String quantity = "Quantity: " + QuickLookUpGUI.Quantity_txtField.getText().toString() + "\n";
		String ordersubm = "";
		String orderrec = "";
		String posub = "";
		String ordersubdate = "";
		String orderrecdate = "";
		String posubdate = "";
		  
		if (QuickLookUpGUI.OrderSubmitted_chkBox.isSelected())
		{
			ordersubm = "Order Submitted: " +"Yes"+ "\n";
			ordersubdate = "Order Submit Date: " + QuickLookUpGUI.OrderSubmittedDate_lbl.getText().toString() + "\n";
		}
		else
		{
			ordersubm = "Order Submitted: " +"No"+ "\n";
			ordersubdate = "Order Submit Date: Order Has Not Been Submitted \n";
		}
	
		if (QuickLookUpGUI.OrderReceived_chkBox.isSelected())
		{
			orderrec = "Order Received: " +"Yes"+ "\n";
			orderrecdate = "Order Received Date: "  + QuickLookUpGUI.OrderReceived_Date.getText().toString() + "\n";
		}
		else
		{
			orderrec = "Order Received: " +"No"+ "\n";
			orderrecdate = "Order Received Date: Order Has Not Been Received \n";
		}
		if (QuickLookUpGUI.posubmit_chkbox.isSelected())
		{
			posub = "PO Submitted: " +"Yes"+ "\n";
			posubdate = "PO Submitted Date: " + QuickLookUpGUI.posubmitteddate_lbl.getText().toString() + "\n";
		}
		else
		{
			posub = "PO Submitted: " +"No"+ "\n";
			posubdate = "PO Submitted Date: PO Has Not Been Submitted \n";
		}
		String combine = project + projectnum + partnum + description + vendor + vendorquote + quantity + comments + ordersubm + ordersubdate + orderrec + orderrecdate + pocode + posub + posubdate + shipper + tracking;
		
		ByteArrayOutputStream out = QRCode.from(combine)
                .to(ImageType.PNG).stream();
        
        
        
        JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("Save QR As");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "jpg", "jpg");
		jfc.setFileFilter(filter);
		
		int result = jfc.showSaveDialog(jfc);
		if (result == JFileChooser.CANCEL_OPTION)
		{
		    return;
		}
		
		File file = jfc.getSelectedFile();				
		String qrfilepath = file.getAbsolutePath() + ".jpg";
		//JOptionPane.showMessageDialog(null, "Creating PDF. This may take a few minutes...");
		
        
        try {

        	FileOutputStream fout = new FileOutputStream(qrfilepath);
 
            fout.write(out.toByteArray());
            
            fout.flush();
            fout.close();
            
            JOptionPane.showMessageDialog(null, "QR Created Successfully at \n" + qrfilepath);
 
        } catch (FileNotFoundException e) {
            // Do Logging
        } catch (IOException e) {
            // Do Logging
        }
    }	
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, "Please Select Your Data First");
		return;
	}
}
}

