package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1= "Royal";
		System.out.println(name1 +"---"+name1.hashCode());

		// Immutable
		name1 = name1.concat(" technosoft");// royal technosoft
		System.out.println(name1 +"---"+name1.hashCode());
	}
}
