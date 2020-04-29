import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;

	public Employee(int empId,String empName,String email,String gender,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details:");
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Email: "+email);
		System.out.println("Gender: "+gender);
		System.out.println("Salary: "+salary);
	
	}
}

class EmployeeDB
{
	ArrayList<Employee> list;
	public EmployeeDB()
	{
		list=new ArrayList<Employee>();
	}
	public int findIndex(int empId)
	{
		int size=list.size();
		for(int i=0;i<size;i++)
			if(list.get(i).empId==empId)
				return i;
		return -1;
	}
	public boolean addEmployee(Employee e)
	{
		try
		{
			list.add(e);
		}
		catch(Exception exception)
		{
			return false;
		}
		return true;
	}

	public boolean deleteEmployee(int empId)
	{
		int index=findIndex(empId);
		if(index==-1)
			return false;
		list.remove(index);
		return true;
	}
	public String showPaySlip(int empId)
	{
		int index=findIndex(empId);
		if(index!=-1){
		Employee emp=list.get(index);
		String paySlip="\n-------Employee PaySlip--------\n";
		paySlip=paySlip+"ID: "+emp.empId+"\n";
		paySlip=paySlip+"Name: "+emp.empName+"\n";
		paySlip=paySlip+"Email: "+emp.email+"\n";
		paySlip=paySlip+"Gender: "+emp.gender+"\n";
		paySlip=paySlip+"Salary: "+emp.salary+"\n";
		return paySlip;
		}
		return null;
	}
}


public class Demo2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		EmployeeDB empDB=new EmployeeDB();
		while(true)
		{
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Delete an Employee");
			System.out.println("3. Show PaySlip");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter details for new Employee");
				System.out.print("ID: ");
				int id=sc.nextInt();
				System.out.print("Name: ");
				String name=sc.next();
				System.out.print("Email: ");
				String email=sc.next();
				System.out.print("Gender: ");
				String gender=sc.next();
				System.out.print("Salary: ");
				float salary=sc.nextFloat();
				
				boolean isAdded=empDB.addEmployee(new Employee(id,name,email,gender,salary));
				if(isAdded)
					System.out.println("Employee with given details added successfully.");
				else
					System.out.println("No more employees can be added.");
			}
			else if(choice==2)
			{
				System.out.print("Enter employee id to delete: ");
				int id=sc.nextInt();
				boolean isDeleted=empDB.deleteEmployee(id);
				if(isDeleted==false)
					System.out.println("Employee with the given ID not found in the database.");
				else
					System.out.println("Employee with given ID deleted successfully.");
			}
			else if(choice==3)
			{
				System.out.print("Enter employee id to delete: ");
				int id=sc.nextInt();
				String paySlip=empDB.showPaySlip(id);
				if(paySlip==null)
					System.out.println("Employee with the given ID not found in the database.");
				else
					System.out.println(paySlip);
					
			}
			else if(choice==4)
				break;
			else
				System.out.println("Incorrect choice. Try Again.");
		}	
	}	
}




