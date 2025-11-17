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
		String insertStudentQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ s.getName() +"',"+ s.getStd() +","+s.getMarks()+")";
		
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
	public int updateStudent(StudentBean s,int id) 
	{
		String updateQuery = "UPDATE student SET name='"+s.getName()+"',std="+s.getStd()+",marks="+s.getMarks()+" WHERE id="+id;
		
		System.out.println("updateQuery : " + updateQuery);
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---updateStudent()---Db not connected");
		}
		return rowsAffected;
	}
	// Delete

	public int deleteStudent(int id) 
	{
		String deleteQuery = "DELETE FROM student WHERE id="+id;
		System.out.println("deleteQuery : " + deleteQuery);
		
		Connection conn = DBConnection.getConnection();
		Statement stmt =null;
		int rowsAffected = 0;
		if (conn != null) 
		{
			try 
			{
				stmt =conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---deleteStudent()----Db not connected");
		}
		return rowsAffected;
	}
	// SELECT
	public void getAllStudents() 
	{
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
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
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(s,id);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
/*		
		//-------------------Delete Student-----------------
		System.out.println("Enter Rno Which You want to Delete Student : ");
		int rno = sc.nextInt();

		StudentDao dao = new StudentDao();
		
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
		
		StudentDao dao = new StudentDao();
		
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
