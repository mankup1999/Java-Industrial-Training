
class Employee implements Cloneable
{
	public int id;
	
	public Employee cloneTest()
	{
		try
		{
			return (Employee) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning Not Supported");
			return this;
		}
	}
}

public class Demo4
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.id=1;
		Employee empClone=emp.cloneTest();
		System.out.println("Before changing....");
		System.out.println("emp: "+emp.id);
		System.out.println("empClone: "+empClone.id);
		emp.id=100;
		System.out.println("After changing....");
		System.out.println("emp: "+emp.id);
		System.out.println("empClone: "+empClone.id);
	}
}
