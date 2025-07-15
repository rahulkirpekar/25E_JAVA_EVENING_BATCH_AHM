package oops.inhtopic.multilevelinh;

// MultiLevel Inheritance
public class TechEmployee extends Employee
{
	String project;

	public TechEmployee(int id, String name, int salary, String project) 
	{
		super(id, name, salary);
		this.project = project;
	}
	
	public void dispData() 
	{
		System.out.println(id+" "+name+" " + salary+" " + project);
	}
}
