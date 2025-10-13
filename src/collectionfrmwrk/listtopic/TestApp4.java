package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Vector;
import java.util.ListIterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
//		LinkedList<String>list = new LinkedList<String>();
		Vector<String>list = new Vector<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("sagar");//2
		list.add("brijesh");//3
		list.add("vishv");//4

		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("--------------------------------------");

	}
}
