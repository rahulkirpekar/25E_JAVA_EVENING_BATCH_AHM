package oops.inhtopic.multilevelinh;

public class ManagementEmployee extends Employee
{
	String taskOfWork;

	public ManagementEmployee(int id, String name, int salary, String taskOfWork) 
	{
		super(id, name, salary);
		this.taskOfWork = taskOfWork;
	}
	public void dispData() 
	{
		System.out.println(id+" "+name+" " + salary+" " + taskOfWork);
	}
}
