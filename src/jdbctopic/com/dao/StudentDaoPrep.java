package jdbctopic.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	
	// Update
	public int updateStudent(StudentBean s,int id) 
	{
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE id=?";
		
		System.out.println("updateQuery : " + updateQuery);
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				pstmt.setInt(4, id);
				
				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---updateStudent()---Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int id) 
	{
		String deleteQuery = "DELETE FROM student WHERE id=?";
		System.out.println("deleteQuery : " + deleteQuery);
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt =null;
		int rowsAffected = 0;
		if (conn != null) 
		{
			try 
			{
				pstmt =conn.prepareStatement(deleteQuery);
				pstmt.setInt(1, id);
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---deleteStudent()----Db not connected");
		}
		return rowsAffected;
	}
	public void getAllStudentRecords() 
	{

	}
	
	
	// SELECT
	public ArrayList<StudentBean> getAllStudents() 
	{
		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean s = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					s = new StudentBean(id, name, std, marks);
					
//						System.out.println(s.getId()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
					
					list.add(s);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---getAllRecords() Db not connected");
		}
		return list;
	}
		
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//-------------------SELECT Student-----------------

		StudentDaoPrep dao = new StudentDaoPrep();

		ArrayList<StudentBean> list = dao.getAllStudents();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getId()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
/*		
		//-------------------Update Student-----------------
		System.out.println("Enter Rno Which You want to Update Student : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();

		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.updateStudent(s,id);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}		
		//-------------------Delete Student-----------------
		System.out.println("Enter Rno Which You want to Delete Student : ");
		int rno = sc.nextInt();

		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		
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
*/		
	}
}
