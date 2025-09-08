package exception;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Exception Handling---[try...catch block]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1= sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2= sc.nextInt();
		
		int ans = 0;
		
		try 
		{
		
			try 
			{
				ans  = no1 / no2;// raisee exception---ArithmeticException	
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = "";
				System.out.println(name.length());// NullPointerException
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				
				int a[] = new int[5];
				a[5] = 10;// ArrayIndexoutofBoundException
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		catch(Exception e) 
		{
			System.out.println("Exception Handled By Catch Block");
			e.printStackTrace();
		}
	
		System.out.println("Result : "+ans);
	}
}
