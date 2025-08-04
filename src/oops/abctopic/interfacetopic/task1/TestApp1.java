package oops.abctopic.interfacetopic.task1;

import java.util.Scanner;

public class TestApp1 
{
										    // upcasting
	public static void getResultBasedOnPlace(Person person) 
	{
		person.getBehave();
		
		if (person instanceof School) 
		{
			//Downcasting---instanceof---operator
			School student = (School)person;
			student.getResult();//C.E
			
		} else if (person instanceof Org) 
		{
			Org employee = (Org)person;
			employee.getSalary();
		} 
		else if (person instanceof PublicPlace) 
		{
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEvent();
		}
		else if (person instanceof Home) 
		{
			Home child= (Home)person;
			child.getMovieOnTime();
		}
	}
	
//	public static void getResultBasedOnPlace(School  student) 
//	{
//		student.getBehave();
//	}
//	
//	public static void getResultBasedOnPlace(PublicPlace citizen) 
//	{
//		citizen.getBehave();
//	}
//	
//	public static void getResultBasedOnPlace(Home child) 
//	{
//		child.getBehave();
//	}
	
	
	
	
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
					Home home = new Home();
					
					getResultBasedOnPlace(home);
					
					break;
					
			case 2: Org org = new Org();
					getResultBasedOnPlace(org);
					break;
					
			case 3: PublicPlace citizen = new PublicPlace();
					getResultBasedOnPlace(citizen);
					break;
					
			case 4: 
					// Upcasting / Polymorphic Object
					School student = new School();
					getResultBasedOnPlace(student);
					
					// Downcasting
//					School student = (School)person;
//					student.getResult();
					
					break;
	
		}
	}
}
