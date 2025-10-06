package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);//0v <===itr
		list.add(12);//1
		list.add(143L);//2
		list.add('R');//3
		list.add(45f);//4
		list.add(543.432);//5
		list.add("royal");//6
		
		Student s= new Student(1, "Rahul", 12);
		list.add(s);//7
		
		System.out.println("list.size() : " + list.size());

		// Traditional way iterate
		Iterator itr = 	list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj  = itr.next();
			System.out.println(obj);
		}
/*		
 //--------------------------------------------------
 		// For Each / Enahanced for...loop / Advanced for.loop
		for(Object obj : list) 
		{
			System.out.println(obj);
		}
//--------------------------------------------------		
   // Normal for loop
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
*/
	}
}
