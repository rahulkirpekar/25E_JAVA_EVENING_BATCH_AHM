package exception;

import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			// 1. checked exception
			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter valid Age.");
			
			// 2. unchecked exception
//			throw new ArithmeticException("\nInvalid Age,\n\tPlease enter valid Age.");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote :" );
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Main --- after catch block");
	}
}