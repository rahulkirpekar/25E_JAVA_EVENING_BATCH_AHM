package jdbctopic.com.dao;

import java.sql.Connection;

import jdbctopic.com.util.DBConnection;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Connection conn1 = DBConnection.getDBInstance();
		Connection conn2 = DBConnection.getDBInstance();
		Connection conn3 = DBConnection.getDBInstance();
		Connection conn4 = DBConnection.getDBInstance();
		Connection conn5 = DBConnection.getDBInstance();
		
		
		System.out.println("conn1 : " + conn1);
		System.out.println("conn2 : " + conn2);
		System.out.println("conn3 : " + conn3);
		System.out.println("conn4 : " + conn4);
		System.out.println("conn5 : " + conn5);
		
	}
}
