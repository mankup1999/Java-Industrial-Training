
import java.util.Scanner;
import java.util.InputMismatchException;

//Exception when amount entered is less than 0
class AmountException extends Exception
{
	public String toString()
	{
		return "Invalid Amount. Please enter non-negative values";
	}
}

//Exception when age entered is less than 0 or greater than 100
class AgeException extends Exception
{
	public String toString()
	{
		return "Age must be between 1 and 100";
	}
}

//Exception when no. of days entered is less than 0
class NoOfDaysException extends Exception
{
	public String toString()
	{
		return "Invalid Number of days. Please enter non-negative values.";
	}	
}

//Exception when no. of months entered is less than 0
class NoOfMonthsException extends Exception
{
	public String toString()
	{
		return "Invalid Number of months. Please enter non-negative values.";
	}	
}

//Abstract class Account
abstract class Account
{
	double interestRate;
	double amount;
	//method that needs to be overridden by each class extendng it
	public abstract double calculateInterest();
}

//Class FD Account
class FDAccount extends Account
{
	int noOfDays;
	int ageOfACHolder;
	//Constructor
	public FDAccount(double amount,int noOfDays,int ageOfACHolder)
	{
		this.amount=amount;
		this.noOfDays=noOfDays;
		this.ageOfACHolder=ageOfACHolder;
	}
	//Overriden function acc. to the norms
	public double calculateInterest()
	{
		double interestRate=0;
		if(amount<=10000000)
		{
			if(ageOfACHolder<60)
			{
				if(noOfDays>=7 && noOfDays<=14)
					interestRate=4.50;
				else if(noOfDays>=15 && noOfDays<=29)
					interestRate=4.75;
				else if(noOfDays>=30 && noOfDays<=45)
					interestRate=5.50;
				else if(noOfDays>=45 && noOfDays<=60)
					interestRate=7;
				else if(noOfDays>=61 && noOfDays<=184)
					interestRate=7.50;
				else
					interestRate=8.00;
			}
			else
			{
				if(noOfDays>=7 && noOfDays<=14)
					interestRate=5.00;
				else if(noOfDays>=15 && noOfDays<=29)
					interestRate=5.25;
				else if(noOfDays>=30 && noOfDays<=45)
					interestRate=6.00;
				else if(noOfDays>=45 && noOfDays<=60)
					interestRate=7.50;
				else if(noOfDays>=61 && noOfDays<=184)
					interestRate=8.00;
				else
					interestRate=8.50;
			}
		}
		else
		{
			if(noOfDays>=7 && noOfDays<=14)
				interestRate=6.50;
			else if(noOfDays>=15 && noOfDays<=29)
				interestRate=6.75;
			else if(noOfDays>=30 && noOfDays<=45)
				interestRate=6.75;
			else if(noOfDays>=45 && noOfDays<=60)
				interestRate=8;
			else if(noOfDays>=61 && noOfDays<=184)
				interestRate=8.50;
			else
				interestRate=10.00;			
		}
		
		this.interestRate=interestRate;
		return (interestRate*amount)/100;
	}
}

//Class SB Account
class SBAccount extends Account
{	
	String typeOfAccount;
	//Constructor
	public SBAccount(double amount)
	{
		this.amount=amount;
	}
	//Overriden function acc. to the norms
	public double calculateInterest()
	{	
		double interestRate=4;
		/*
		if(typeOfAccount.equalsIgnoreCase("Normal"))
			interestRate=4;
		else
			interestRate=6;
		*/

		this.interestRate=interestRate;
		return (interestRate*amount)/100;
	}
}

//Class RD Account
class RDAccount extends Account
{
	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
	//Constructor
	public RDAccount(double amount,int noOfMonths,int ageOfACHolder)
	{
		this.amount=amount;
		this.noOfMonths=noOfMonths;
		this.ageOfACHolder=ageOfACHolder;
	}
	//Overriden function acc. to the norms
	public double calculateInterest()
	{
		double interestRate=0;
		if(ageOfACHolder<60)
		{
			if(noOfMonths==6)
				interestRate=7.50;
			else if(noOfMonths==9)
				interestRate=7.75;
			else if(noOfMonths==12)
				interestRate=8.00;
			else if(noOfMonths==15)
				interestRate=8.25;
			else if(noOfMonths==18)
				interestRate=8.50;
			else if(noOfMonths==21)
				interestRate=8.75;	
		}
		else
		{
			if(noOfMonths==6)
				interestRate=8.00;
			else if(noOfMonths==9)
				interestRate=8.25;
			else if(noOfMonths==12)
				interestRate=8.50;
			else if(noOfMonths==15)
				interestRate=8.75;
			else if(noOfMonths==18)
				interestRate=9.00;
			else if(noOfMonths==21)
				interestRate=9.25;	
		}

		this.interestRate=interestRate;
		return (interestRate*amount)/100;		
	}
}


//Main Class
public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Account acc;
		//Exception Handling with the inputs given by the user
		try
		{
			while(true)
			{
				System.out.println("MAIN MENU");
				System.out.println("==========");
				System.out.println("1. Interest Calculator - SB");
				System.out.println("2. Interest Calculator - FD");
				System.out.println("3. Interest Calculator - RD");
				System.out.println("4. Exit");
				System.out.print("Enter your option (1..4): ");
			
				int option=sc.nextInt();
				if(option==1)
				{
					System.out.print("Enter the Average amount in your account: ");
					double amount=sc.nextDouble();
					if(amount<0)
						throw new AmountException();
					acc=new SBAccount(amount);
					System.out.println("Interest gained: RS. "+acc.calculateInterest());
				}
				else if(option==2)
				{
					System.out.print("Enter the FD amount: ");
					double amount=sc.nextDouble();
					System.out.print("Enter the no. of days: ");
					int days=sc.nextInt();
					System.out.print("Enter your age: ");
					int age=sc.nextInt();
					if(amount<0)
						throw new AmountException();
					if(days<0)
						throw new NoOfDaysException();
					if(age<=0 || age>100)
						throw new AgeException();
					acc=new FDAccount(amount,days,age);
					System.out.println("Interest gained: RS. "+acc.calculateInterest());
				}
				else if(option==3)
				{
					System.out.print("Enter the FD amount: ");
					double amount=sc.nextDouble();
					System.out.print("Enter the no. of months: ");
					int months=sc.nextInt();
					System.out.print("Enter your age: ");
					int age=sc.nextInt();
					if(amount<0)
						throw new AmountException();
					if(months<0)
						throw new NoOfMonthsException();
					if(age<=0 || age>100)
						throw new AgeException();
					acc=new RDAccount(amount,months,age);
					System.out.println("Interest gained: RS. "+acc.calculateInterest());
				}
				else if(option==4)
				{
					System.out.println("Exiting....");
					break;
				}
				else
					System.out.println("Please enter the correct option");
			}
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please Enter valid data type paramenter");
		}
		catch(AgeException e2)
		{
			System.out.println(e2);
		}
		catch(NoOfDaysException e3)
		{
			System.out.println(e3);
		}
		catch(NoOfMonthsException e4)
		{
			System.out.println(e4);
		}
		catch(AmountException e5)
		{
			System.out.println(e5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}






