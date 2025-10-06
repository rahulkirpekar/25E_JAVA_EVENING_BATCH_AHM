package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\25E_JAVA_EVENING_BATCH_AHM\\src\\iotopic\\charorientedway\\TestApp2.java");

			int temp;
			
			while(	(temp = fr.read())	!= -1) 
			{
				char value =(char)temp;
				System.out.print(value);
			}
			fr.close();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
