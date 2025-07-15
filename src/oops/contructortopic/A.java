package oops.contructortopic;

public class A 
{
	int no1,no2,no3;
	public A()
	{
		System.out.println("Default Constructor----"+this);
	}
	public A(int no1)
	{
		this();
		System.out.println("One--args--Para Constructor---"+this);
		this.no1=no1;
	}
	public A(int no1,int no2)
	{
		this(no1);
		System.out.println("Two--args--Para Constructor----"+this);
		this.no2=no2;
	}
	public A(int no1,int no2,int no3)
	{
		this(no1,no2);
		System.out.println("Three--args--Para Constructor----"+this);
		this.no3=no3;
	}
	public void dispData() 
	{
		System.out.println(no1+" " + no2+" " + no3+"----"+this);
	}
	public static void main(String[] args) 
	{
		A obj1 = new A(10,20,30);
		obj1.dispData();
		System.out.println("---------------------");
		A obj2 = new A(40,50,60);
		obj2.dispData();

	}
}