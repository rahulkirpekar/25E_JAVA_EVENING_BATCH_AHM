package oops.polymorphism.runtime;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Home");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For School");
		int choice= sc.nextInt();

		Person person = null ;
		switch (choice) 
		{
			case 1: // Upcasting--[Polymorphism object]
					person = new Home();
					person.getBehave();
					break;
					
			case 2: person = new Org();
					person.getBehave();
					break;
					
			case 3: person = new PublicPlace();
					person.getBehave();
					break;
					
			case 4: person = new School();
					person.getBehave();
					break;
	
		}
	}
}
