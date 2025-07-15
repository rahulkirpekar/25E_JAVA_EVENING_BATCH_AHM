package oops.inhtopic.multilevelinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee(1, "Rahul", 1222, "FulStack");
		techEmp.dispData();

		ManagementEmployee managementEmp = new ManagementEmployee(2, "Ankur", 2123, "Counselling");
		managementEmp.dispData();
	}
}
