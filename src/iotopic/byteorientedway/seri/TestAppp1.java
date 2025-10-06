package iotopic.byteorientedway.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestAppp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 10, 90);

		try 
		{
			FileOutputStream fout = new FileOutputStream("studrcd.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.close();
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
