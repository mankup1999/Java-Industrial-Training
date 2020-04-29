
//importing required packages
import java.util.*;
import java.io.*;

//defining class employee
class Employee
{
	int empId;
	String empName;
	int empAge;
	double empSalary;
	//constructor
	public Employee(int empId,String empName,int empAge,double empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
		this.empSalary=empSalary;
	}
	//getter functions
	public int getId()
	{
		return empId;
	}
	public String getName()
	{
		return empName;
	}
	public int getAge()
	{
		return empAge;
	}
	public double getSalary()
	{
		return empSalary;
	}
}

//Exception classes
class AgeException extends Exception
{
	public String toString()
	{
		return "Please enter age between 1 and 100.";
	}
}
class NegException extends Exception
{
	public String toString()
	{
		return "Non-negative data are not allowed here.";
	}
}


//main class
public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		FileReader reader=null;
		FileWriter writer=null;
		try
		{
			while(true)
			{
				//asking user for choices
				System.out.println("Main Menu");
				System.out.println("1. Add an Employee");
				System.out.println("2. Display All");
				System.out.println("3. Exit");
				int choice=sc.nextInt();
				if(choice==1)
				{
					System.out.print("Enter Employee ID: ");
					int id=sc.nextInt();
					System.out.print("Enter Employee Name: ");
					String name=sc.next();
					System.out.print("Enter Employee Age: ");
					int age=sc.nextInt();
					System.out.print("Enter Employee Salary: ");
					double salary=sc.nextDouble();
					//handling user-input exceptions
					if(id<0 || salary<0)
						throw new NegException();
					if(age<1 || age>100)
						throw new AgeException();
					
					Employee emp=new Employee(id,name,age,salary);
					//writing into the file
					writer=new FileWriter("Employee.txt",true);
					String msg=emp.getId()+" "+emp.getName()+" "+emp.getAge()+" "+emp.getSalary();
					writer.write(msg+"\n");
					if(writer!=null)
						writer.close();
			
				}
				else if(choice==2)
				{
					//reading from the file
					reader=new FileReader("Employee.txt");
					System.out.println("---Report---");
					int ch;
					String msg="";
					while((ch=reader.read())!=-1)
						System.out.print((char)ch);
					System.out.println("---End of Report---");
					if(reader!=null)
						reader.close();
				}
				else if(choice==3)
				{
					//deleting the created file
					System.out.println("Exiting the System");
					File f=new File("Employee.txt");
					f.delete();
					break;
				}
				else
				{
					//invalid choice by user
					System.out.println("Please enter from the above options.");
				}
			}
		}
		//exception handling
		catch(Exception e)
		{
			File f=new File("Employee.txt");
			f.delete();
			System.out.println(e);
		}
	}
}






