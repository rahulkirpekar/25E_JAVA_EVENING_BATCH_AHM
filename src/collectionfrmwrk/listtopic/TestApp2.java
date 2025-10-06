package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("sagar");
		list.add("brijesh");
		list.add("vishv");
/*		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) 
		{
			String name =itr.next();
			System.out.println(name);
		}
*/	
		// ListIterator---[forward + Backup iterate]
		//---------------------------------------------
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("--------------------------------------");
		
		while(itr.hasPrevious()) 
		{
			String name = itr.previous();
			System.out.println(name);
		}
	}
}
