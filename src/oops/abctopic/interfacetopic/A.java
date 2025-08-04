package oops.abctopic.interfacetopic;

public interface A 
{
	// 1. Data members--[public static final] -- Constant Variable
	
	public static final int NO = 10;// public static final
	
	// 2. Member function
	
		// 1. Abstract Methods---[public abstract]
	
	public abstract void test1();// public abstract 
	public abstract void test5();// public abstract 
	
	
	// 2. Non-Abstract Methods[static,private,default]

	// static---8
	public static void test2() 
	{
		System.out.println("A--static---test2()");
	}	
	// default---8
	public default void test3() 
	{
		System.out.println("A--default---test3()");
		test4();
	}		
	// private---9
	private void test4() 
	{
		System.out.println("A--private---test4()");
	}	
}
