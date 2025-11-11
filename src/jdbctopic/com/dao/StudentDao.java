package jdbctopic.com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctopic.com.util.DBConnection;

// StudentDao ---Student(Table)
public class StudentDao 
{
	// Insert
	public int insertStudent() 
	{
		int rowsAffected = 0;
		
		Statement stmt = null;
		// 1. Create SQL Query
		String insertStudentQuery = "INSERT INTO student(name,std,marks) VALUES ('Ankur',7,90)";
		
		// 2. get Database connection object
		Connection conn = DBConnection.getConnection();
		
		// 3. validate Database connection object
		if (conn != null) 
		{
			try 
			{
				// 4. create Statement object by db connection object
				stmt = conn.createStatement();
				
				// 5. insertSQL query---execute---stmt
				rowsAffected = stmt.executeUpdate(insertStudentQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---insertStudent()---Db not connected");
		}
		return rowsAffected;
	}
	
	// Update
	public void updateStudent() 
	{

	}
	// Delete
	public void deleteStudent() 
	{

	}
	// SELECT
	public void getAllStudents() 
	{
		
	}
	public static void main(String[] args)
	{
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent();
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}
