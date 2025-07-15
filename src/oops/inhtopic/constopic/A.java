package oops.inhtopic.constopic;

// Parent class
public class A 
{
	int no1;
	public A()
	{
		System.out.println("A : Default Constructor");
		no1 = 100;
	}
	public A(int no1)
	{
		this();
		System.out.println("A : Para public A(int no1) Constructor");
		this.no1 = no1;
	}
}
