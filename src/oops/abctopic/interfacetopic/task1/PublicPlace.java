package oops.abctopic.interfacetopic.task1;

public class PublicPlace implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace---getBehave()---Citizen");
	}
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace---getPublicEvent()---Citizen");
	}
}
