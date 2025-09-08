package exception;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A objA = new B();
		
		C objC = (C)objA;// ClassCastException
		
/*		
    -------------------------------------------------   
 
   
   	-------------------------------------------------
		//			   01234	
		String name = "royal";
		
						// StringIndexoutofBoundExceeption
		System.out.println(name.charAt(5));   	
   	-------------------------------------------------   
		String name = null;
		System.out.println("name.length() : " +name.length());// NullPOinterException
   	-------------------------------------------------
		int a[] = new int[5];//a[0],a[1],a[2],a[3],a[4]
		// ArrrayIndexOutofBoundException
		a[5] = 100;
   	-------------------------------------------------
		String value = "1a2b3";
		// NumberFormatException
		int no = Integer.parseInt(value);// 123(String)--->123(int)
		
		System.out.println("No : " + no);
   	-------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1= sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2= sc.nextInt();
		int ans;
		ans  = no1 / no2;// raisee exception---ArithmeticException
		System.out.println("Result : "+ans);
*/	
	}
}
