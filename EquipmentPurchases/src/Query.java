import java.sql.*;

import javax.swing.JOptionPane;


public class Query {
	
public static java.sql.Connection connection;
public static Statement statement;

			
		public static ResultSet ExecuteResultSet(String query){
			ResultSet rs = null;	
			connection = ConnectToAccess.con;
			statement = ConnectToAccess.stmt;
			
			
			try{
				statement = connection.createStatement();
				rs = statement.executeQuery(query);			
				
			}catch (SQLException e) {
				e.printStackTrace();
				String tmp = e.toString();			
				JOptionPane.showMessageDialog(null, "Could not execute query or no data was found \n " + "Error Message: " + tmp,"Query error",JOptionPane.ERROR_MESSAGE);
				try{
					QuickLookUpGUI.frmQuickLookupGUI.dispose();
				}
				catch (Exception e1)
				{
					
				}
				try{
					ReportGUI.frmReportGenerator.dispose();
				}
				catch (Exception e2)
				{
					
				}
				MainMenuGUI.run();
				
			}		
			return rs;
			
			
		}
		
		
		

}
