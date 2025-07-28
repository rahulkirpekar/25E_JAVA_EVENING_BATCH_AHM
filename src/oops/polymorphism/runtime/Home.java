package oops.polymorphism.runtime;

public class Home extends Person
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
