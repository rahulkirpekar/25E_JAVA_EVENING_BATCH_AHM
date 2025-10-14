package collectionfrmwrk.sortingtech;

public class Student //implements Comparable<Student>
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
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
//	@Override
//	public int compareTo(Student s2) 
//	{
//		if (getStd() > s2.getStd()) 
//		{
//			return -1;
//			
//		} else if (getStd() < s2.getStd()) 
//		{
//			return 1;
//		}else 
//		{
//			return 0;
//		}
//	}
	
	// String wise Sorting
//	@Override
//	public int compareTo(Student s2) 
//	{
//		return getName().compareTo(s2.getName());
//	}
	
}




























