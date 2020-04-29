import java.util.*;

class Employee
{
	int id;
	String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "ID:"+id+"--->Name:"+name;
	}
}

public class Demo2
{
	public static void main(String[] args)
	{
		HashSet<Employee> emp=new HashSet<Employee>();
		emp.add(new Employee(100,"Ankita"));
		emp.add(new Employee(101,"Sara"));
		emp.add(new Employee(102,"Neha"));
		emp.add(new Employee(104,"Anil"));
		
		Iterator<Employee> it=emp.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
