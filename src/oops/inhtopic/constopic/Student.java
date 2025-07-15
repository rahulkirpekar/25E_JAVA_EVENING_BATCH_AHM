package oops.inhtopic.constopic;

// Single Inheritance
public class Student extends Person
{
	int rno,std;
	
	public Student() 
	{
		System.out.println("Student---Default Constructor");
	}
	public Student(int rno, String name,int std) 
	{
//		super(name);
		System.out.println("Student---Para Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std); 
	}
	public static void main(String[] args) 
	{
		Student s = new Student(1,"Rahul",12);// Student[rno name std]
		s.dispData();
	}
}