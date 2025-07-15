package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		// Array Declaration
		int a1[] = new int[5];//a[0],a[1],a[2],a[3],a[4]
		int []a2 = new int[5];
		int[] a3 = new int[5];
		int [] a4 = new int[5];

		int a5[] = null;
		a5 = new int[5];

		// Array with Declaration , Instantiaion and Initialisation
		int a6[] = new int[] {10,20,30,40};
		
		int a7[] = {10,20,30,40};
		
/*		int sum = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
		System.out.println("Sum : " + sum);
*/	}
}