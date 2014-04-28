import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class ConnectToAccess {
	public static java.sql.Connection con;
	public static Statement stmt;
	
	public static boolean Connect(String path)
	{
	 try
     {
		 //String accessFilePath = "C:\\Documents and Settings\\tjohnston.ENE\\Desktop\\Database51.accdb";
		 
		 //String accessFilePath = "\\\\jackal\\public\\Megan\\Purchase Orders\\Temp.accdb";
		 System.out.println(path);
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + path;
         con = DriverManager.getConnection(database, "", "");
         Statement s = con.createStatement();
         
         //con.close();
         return true;
     }
     catch(Exception ex)
     {
    	 
         ex.printStackTrace();
         
         return false;
     }
	
	}
}
