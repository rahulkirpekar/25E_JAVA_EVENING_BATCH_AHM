package oops.classobject;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Student DataType(ClassName)
		// s - reference variable(store Object Address into [s] reference variable)
		// new -- Keyword--creation--->Object
		// Student--Object
//		Student s1 = new Student();//s1[rno,name,std,marks]
//		Student s2 = new Student();//s2[rno,name,std,marks]
//		Student s3 = new Student();//s3[rno,name,std,marks]
//		Student s4 = new Student();//s4[rno,name,std,marks]

//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
//		s4.scanData();
		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
//		s4.dispData();

		Student s[] = new Student[5];
		// s[0],s[1],s[2],s[3],s[4]

		for(int i = 0 ; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for(int i = 0 ; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}