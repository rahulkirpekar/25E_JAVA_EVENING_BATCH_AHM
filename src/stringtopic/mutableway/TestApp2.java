package stringtopic.mutableway;


public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Mutable Way
		
//		StringBuilder name1 = new StringBuilder("royal");
		
		StringBuffer name1 = new StringBuffer("royal");
		
		System.out.println(name1+"---"+name1.hashCode());
		
		name1.append(" technosoft");
		
		System.out.println(name1+"---"+name1.hashCode());
		
/*		String			StringBuffer/StringBuilder
		concat---------->append
		  X ------------>reverse();
*/		
	}
}
