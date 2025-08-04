package oops.abctopic.interfacetopic.task1;

public class Home implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home---getBehave()---Child");
	}
	
	public void getMovieOnTime() 
	{
		System.out.println("Home---getMovieOnTime()---Child");
	}
}
