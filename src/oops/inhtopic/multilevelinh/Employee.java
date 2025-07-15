package oops.inhtopic.multilevelinh;

public class Employee extends Person
{
	int id,salary;
	
	public Employee() 
	{
	}
	public Employee(int id, String name, int salary) 
	{
		super(name);
		this.id = id;
		this.salary = salary;
	}
}
