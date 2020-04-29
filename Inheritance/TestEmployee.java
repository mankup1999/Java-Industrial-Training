
public class TestEmployee
{
	public static void main(String[] args)
	{
		Employee emp=new Employee("ABC",1200000,2015,"12345");

		System.out.println("Employee Details:");
		System.out.println("Name: "+emp.getName());
		System.out.println("Annual Salary: "+emp.getAnnualSalary());
		System.out.println("Year of joining: "+emp.getYear());
		System.out.println("National Insurance Number: "+emp.getInsuranceNumber());
	}
}
