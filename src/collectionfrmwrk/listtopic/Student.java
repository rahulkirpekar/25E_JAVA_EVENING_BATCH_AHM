package collectionfrmwrk.listtopic;

public class Student 
{
	int rno,std;
	String name;
	public Student() 
	{
	}
	public Student(int rno, String name,int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
	@Override
	public String toString() 
	{
		return "===>"+rno+" " + name+" " + std;
	}
	public static void main(String[] args) 
	{
		Student s =new Student(1, "rahul", 12);
		System.out.println(s);// s.toString(); /// Address
	}
}
