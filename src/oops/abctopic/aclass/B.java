package oops.abctopic.aclass;

public  class B extends A
{
	int no2;
	
	public B() 
	{
		no2=20;
		System.out.println("B--Default Constructor");
	}
	@Override
	void test1() 
	{
		System.out.println("B--test1()");
	}	
	void dispData()
	{
		System.out.println("No1 : " + no1+"\nNo2 : " + no2);
	}
	public static void main(String[] args) 
	{
		B obj = new B();

		obj.dispData();
		
//		obj.test1();
//		obj.test3();
		
	}
	@Override
	void test2() 
	{
		
	}
}
