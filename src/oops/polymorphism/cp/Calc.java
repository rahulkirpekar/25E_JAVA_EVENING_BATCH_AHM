package oops.polymorphism.cp;

// Compiletime Polymorphism---Method Overloadding
public class Calc 
{
	public static void addFun(long no1,long no2) 
	{
		System.out.println("addFun(Two--long) : " + (no1+no2));
	}
	public static void addFun(double no1,double no2) 
	{
		System.out.println("addFun(Two--double) : " + (no1+no2));
	}
	public static void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(Three--int) : " + (no1+no2+no3));
		
	}
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(Four--int) : " + (no1+no2+no3+no4));
	}
	public static void main(String[] args) 
	{
		addFun('A', 'B');
		
	}
}
/* 
   
   1. argument count
   2. datatype 
   3. Type pramotion Rule
   
   
   Type pramotion Rule:-
   ----------------------
   
   boolean----X
   
   					byte
   					 |
   					short
   					 |
char--------------->int
   					 |
   					long
   					 |
   				    float	  	
   					 |
   				    double
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 */



