package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25E_JAVA_EVENING_BATCH_AHM\\src\\iotopic\\byteorientedway\\TestApp2.java");
		
			FileOutputStream fout = new FileOutputStream("TestApp2Dup.java");
		
			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
				System.out.print((char)temp);
				
				fout.write(temp);
			}
			fin.close();
			fout.close();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
