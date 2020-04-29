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
	public void showDetails()
	{
		System.out.println("ID: "+id+"------>Name: "+name);
	}
}

public class Demo7
{
	public static void main(String[] args)
	{
		Vector<Employee> list=new Vector<Employee>();
		list.add(new Employee(100,"Ankush Sharma"));
		list.add(new Employee(101,"Meenal kriti"));
		list.add(new Employee(102,"Ritika Jha"));

		System.out.println("\nUsing Iterator: ");
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
			it.next().showDetails();
		System.out.println("\nUsing Enumeration: ");
		Enumeration<Employee> enm = Collections.enumeration(list);
        	while(enm.hasMoreElements())
            		enm.nextElement().showDetails();
	}
}





