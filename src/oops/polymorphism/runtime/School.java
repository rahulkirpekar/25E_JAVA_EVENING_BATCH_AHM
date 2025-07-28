package oops.polymorphism.runtime;

public class School extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School---getBehave()---Student");
	}
	
	public void getResult() 
	{
		System.out.println("School---getResult()---Student");
	}
}
