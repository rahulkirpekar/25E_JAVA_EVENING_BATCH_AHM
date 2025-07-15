package oops.inhtopic.constopic;

//Child class
public class B extends A
{
	int no2;
	public B() 
	{
		System.out.println("B : Default Constructor");
		no2=200;
	}
	public B(int no1,int no2) 
	{
		super(no1);
		System.out.println("B : Para public B(int no1,int no2) Constructor");
		this.no2 = no2;
	}
	public void dispData() 
	{
		System.out.println(" No1 : " + no1 +" No2 : " + no2);
	}
}