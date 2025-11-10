package jdbctopic.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	// 1. Make Credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/evebatch24";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	
	// 2. getConnection Method
	public static void getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3. Load Driver Class
			Class.forName(DRIVERCLASS);
			
			// 4. Passs credentials into DriverManager's getConnection
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			// 5. Validae conn object
			if (conn !=null) 
			{
				System.out.println("Db Connected : " + conn);
			} else 
			{
				System.out.println("Db not connected : " + conn);
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		DBConnection.getConnection();
	}
}
