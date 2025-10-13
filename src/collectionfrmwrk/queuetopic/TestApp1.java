package collectionfrmwrk.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering follow
		PriorityQueue<String> queueObj = new PriorityQueue<>();
		
		queueObj.add("rahul");
		queueObj.add("ankur");
		queueObj.add("brijesh");
		queueObj.add("sagar");
		queueObj.add("tapan");
		queueObj.add("sarjan");
		
		while(!queueObj.isEmpty()) 
		{
			String name= queueObj.poll();
			System.out.println(name);
		}
	}
}
