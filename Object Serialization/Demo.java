import java.io.*;
import java.util.*;

class Employee implements Serializable
{
	String name;
	Date dateOfBirth;
	String department;
	String designation;
	double salary;
	
	public Employee()
	{
		name=null;
		dateOfBirth=null;
		department=null;
		designation=null;
		salary=0;
	}
	public Employee(String name,Date dateOfBirth,String department,String designation,double salary)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.department=department;
		this.designation=designation;
		this.salary=salary;
	}

	public String getName()
	{
		return name;
	}
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getDesignation()
	{
		return designation;
	}
	public double getSalary()
	{
		return salary;
	}
}

public class Demo
{
	public static void main(String[] args) throws IOException,ClassNotFoundException
	{

		Employee emp=new Employee("Vivek",new Date("01/01/1999"),"Manager","HR",2000000);
		FileOutputStream fileOut=null;
		ObjectOutputStream out=null;
		System.out.println("Serialization starts here...");
		try
		{
			fileOut=new FileOutputStream("employee.ser");
			out=new ObjectOutputStream(fileOut);
			out.writeObject(emp);
		}
		finally
		{
			if(fileOut!=null)
				fileOut.close();
			if(out!=null)
				out.close();
		}
		System.out.println("Serialization ends");
		System.out.println("Deserialization starts...");
		FileInputStream fileIn=null;
		ObjectInputStream in=null;
		try 
		{
		 	fileIn = new FileInputStream("employee.ser");
		 	in= new ObjectInputStream(fileIn);
		 	Employee e = (Employee) in.readObject();
			System.out.println("Employee Details:");
			System.out.println("\tName: "+e.getName());
			System.out.println("\tDate of Birth: "+e.getDateOfBirth());
			System.out.println("\tDepartment: "+e.getDepartment());
			System.out.println("\tDesignaton: "+e.getDesignation());
			System.out.println("\tSalary: "+e.getSalary());
     		}
		finally
		{
			if(in!=null)
				in.close();
			if(fileIn!=null)
				fileIn.close();
		}
		
	}
}


