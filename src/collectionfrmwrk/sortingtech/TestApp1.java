package collectionfrmwrk.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// list		  set		queue					map
		//  ?		TreeSet    PriorityQueue			   TreeMap
		//------------------------------------------------------------------
		// list 
		// ArrayList LinkedList Vector
		//------------------------------------------------------------------
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("sagar");
		list.add("brijesh");
		list.add("ankur");
		list.add("param");
		list.add("vansh");
		list.add("shailesh");
		
		Iterator<String> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------");
		
		// String / int / float / long 
		Collections.sort(list);// mix data--list--->ClassCastException
		
		itr = 	list.iterator();
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}




