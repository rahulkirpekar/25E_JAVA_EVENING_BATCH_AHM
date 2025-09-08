package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		try 
		{
			// write by byteoriented way
			FileOutputStream fout = new FileOutputStream("royalclub.txt");
		
			// String Data--->Byte
			byte b[] = name.getBytes();
			
			fout.write(b);
		
			fout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}