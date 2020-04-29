//Imporing required libraries
import java.util.*;

//Declaring Employee class
class Employee
{
	//Instance variables
	String firstName;
	String lastName;
	String mobNo;
	String email;
	String address;
	//Setter and Getter functions
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void setMobNo(String mobNo)
	{
		this.mobNo=mobNo;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getMobNo()
	{
		return this.mobNo;
	}
	public String getEmail()
	{
		return this.email;
	}
	public String getAddress()
	{
		return this.address;
	}
}

//Main Class
public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		ArrayList<Employee> list;
		System.out.println("Enter the Number of Employees");
		int n=sc.nextInt();
		list=new ArrayList<Employee>(n);
		for(int i=0;i<n;i++)
		{
			Employee emp=new Employee();
			System.out.println("Enter Employee "+(i+1)+" Details");
			System.out.println("Enter the First name");
			String firstName=sc.next();
			emp.setFirstName(firstName);
			System.out.println("Enter the Last name");
			String lastName=sc.next();
			emp.setLastName(lastName);
			System.out.println("Enter the Mobile");
			String mob=sc.next();
			emp.setMobNo(mob);
			System.out.println("Enter the Email");
			String email=sc.next();
			emp.setEmail(email);
			System.out.println("Enter the Address");
			String address=sc.next();
			emp.setAddress(address);

			list.add(emp);
		}
		//Comparator to sort on the basis of first names
		Comparator<Employee> compareByFirstName=(Employee e1,Employee e2) -> (e1.getFirstName().compareTo(e2.getFirstName()));
		Collections.sort(list,compareByFirstName);
		//Final result
		System.out.println("\nEmployee List: ");
		System.out.format("%-15s%-15s%-15s%-30s%-15s","FirstName","SecondName","Mobile","Email","Address");
		System.out.println();
		for(Employee emp:list)
		{
			String firstName=emp.getFirstName();
			String lastName=emp.getLastName();
			String mobNo=emp.getMobNo();
			String email=emp.getEmail();
			String address=emp.getAddress();
		System.out.printf("%-15s%-15s%-15s%-30s%-15s",firstName,lastName,mobNo,email,address);
		System.out.println();
		}
		
	}
}









