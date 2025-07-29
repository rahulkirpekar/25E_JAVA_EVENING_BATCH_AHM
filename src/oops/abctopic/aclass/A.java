package oops.abctopic.aclass;

public abstract class A 
{
	int no1;
	public A() 
	{
		no1=10;
		System.out.println("A--Default Constructor");
	}
	abstract void test1();
	abstract void test2();

	void test3() 
	{
		System.out.println("A---test3()");
	}
}
