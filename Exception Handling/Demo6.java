import java.util.Scanner;
class MyException extends Exception
{
	public String toString()
	{
		return "Marks must be within the range 0-100.";
	}
}

public class Demo6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("Enter Student Name: ");
				String name=sc.next();
				System.out.println("Enter marks in 3 subjects: ");
				for(int j=0;j<3;j++)
				{
					int marks=Integer.parseInt(sc.next());
					if(marks<0 || marks>100)
						throw new MyException();
				}	
					
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter numeric valued marks.");
		}
		catch(MyException e1)
		{
			System.out.println(e1.toString());
		}
	}
}
