package jdbctopic.com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.com.bean.StudentBean;
import jdbctopic.com.util.DBConnection;

// StudentDao ---Student(Table)
public class StudentDao 
{
	// Insert
	public int insertStudent(StudentBean s) 
	{
		int rowsAffected = 0;
		
		Statement stmt = null;
		// 1. Create SQL Query
		String insertStudentQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ s.getName() +"',"+ s.getStd() +","+s.getStd()+")";
		
		System.out.println("insertStudentQuery : " + insertStudentQuery);
		
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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();

		
		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(s);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}
