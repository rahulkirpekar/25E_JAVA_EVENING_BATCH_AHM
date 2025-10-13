package collectionfrmwrk.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		 Map--[Key,Value]
//		  |
//		HashMap---------Not Maintain Insertion Order
//		LinkedHashMap---Maintain Insertion Order
//		TreeMap---------Ascending Order
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		
		map.put(13, "rahul");// [Key,Value]---Entry
		map.put(2, "ankur");
		map.put(30, "sagar");
		map.put(45, "brijesh");
		map.put(5, "sapan");
		

		for(Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}	
	}
}
