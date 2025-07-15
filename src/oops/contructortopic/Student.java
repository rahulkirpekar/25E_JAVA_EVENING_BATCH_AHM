package oops.contructortopic;

public class Student 
{
	// 1. Dm's--private
	private int rno,std,marks;
	private String name;

	// 1. Default
	Student()
	{
		System.out.println("Default Constructor");
	}
	// 2. Two--Para
	public Student(int rno,String name) 
	{
		this();
		this.rno = rno;
		this.name = name;
	}
	// 2. Three--Para
	public Student(int rno,String name,int std) 
	{
		this(rno,name);
		this.std = std;
	}
	// 2. Four--Para
	public Student(int rno,String name,int std,int marks) 
	{
		this(rno, name, std);
		this.marks = marks;
	}
	
//	// 3 Copy
//	public Student(Student s) 
//	{
//		this.name = s.name;
//		this.std = s.std;
//		this.marks = s.marks;
//	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Rahul",12,1000);
		s1.dispData();
	}
}