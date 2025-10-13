package collectionfrmwrk.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//  Set---Remove Duplicate Values
		//   |
		// HashSet---Store Values but not main insertion order
		// LinkedHashSet--Maintain Insertion Order
		// TreeSet----Ascending Order Sorting
	
//		HashSet<String> setObj= new HashSet<>();
//		LinkedHashSet<String> setObj= new LinkedHashSet<>();
		TreeSet<String> setObj= new TreeSet<>();
		
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("brijesh");
		setObj.add("sagar");
		setObj.add("tapan");
		setObj.add("sarjan");
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("brijesh");
		setObj.add("sagar");
		
		Iterator<String> itr = 	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
