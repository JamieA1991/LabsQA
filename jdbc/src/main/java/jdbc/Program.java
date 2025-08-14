package jdbc;

import java.sql.*;

public class Program {
	public static void main(String[] args) {
		
		new MSSQLExample().read();
	}
	
}

	class MSSQLExample {
		public void read() {
		    	String url = "jdbc:sqlserver://(localdb)\\MSSQLLocalDB;databaseName=qastore;user=bob;password=password1;encrypt=false;";
		        try (Connection conn = DriverManager.getConnection(url); 
		             Statement stmt = conn.createStatement()) {
		            String query = "SELECT * FROM sale'";
		            ResultSet rs = stmt.executeQuery(query);
		            while (rs.next()) {
		                System.out.println(rs.getString(1)+ "," + rs.getString(2));
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        
		            
		        }
		        
		}
		
	}
	




