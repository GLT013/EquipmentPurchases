import java.sql.*;


public class Query {
	
public static java.sql.Connection connection;
public static Statement statement;

			
		public static ResultSet ExecuteResultSet(String query){
			ResultSet rs = null;	
			connection = ConnectToAccess.c;
			statement = ConnectToAccess.stmt;
			
			
			try{
				statement = connection.createStatement();
				rs = statement.executeQuery(query);			
				
			}catch (SQLException e) {
				e.printStackTrace();
			}		
			return rs;
			
			
		}
		
		
		

}
