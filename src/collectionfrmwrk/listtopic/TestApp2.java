package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
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
		
		// remove
//		list.remove(2);// index
//		list.remove("sagar");// valueBased
		
		
		// Update
		list.set(2, "Ganesh");
		
		
		itr = list.listIterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("--------------------------------------");
		
		
		
		
		// update
		
	
		
		
		
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
//		ListIterator<String> itr = list.listIterator();
//		
//		while(itr.hasNext()) 
//		{
//			String name = itr.next();
//			System.out.println(name);
//		}
//		System.out.println("--------------------------------------");
//		
//		while(itr.hasPrevious()) 
//		{
//			String name = itr.previous();
//			System.out.println(name);
//		}
	}
}
