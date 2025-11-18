package jdbctopic.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbctopic.com.bean.StudentBean;
import jdbctopic.com.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean s) 
	{
		// 1. Create SQL Query
		String insertStudentQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		
		Connection conn  = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertStudentQuery);
			
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				
				System.out.println("pstmt : " + pstmt);
			
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---insertStudent()----Db not connected");
		}
		return rowsAffected;
	}
	
	public void updateStudent() 
	{

	}
	public void deleteStudent() 
	{

	}
	public void getAllStudentRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//-------------------Insert Student-----------------
   		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();

		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
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
