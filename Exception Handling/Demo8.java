
class MyException extends Exception
{
	public String toString()
	{
		return "The age must be between 18 and 60.";
	}
}

public class Demo8
{
	public static void main(String[] args)
	{
		try
		{
			String name=args[0];
			int age=Integer.parseInt(args[1]);
			if(age<18 || age>=60)
				throw new MyException();
			System.out.println("All ok.");
		}
		catch(IndexOutOfBoundsException e1)
		{
			System.out.println("Please enter name and age through command line.");
		}
		catch(NumberFormatException e2)
		{
			System.out.println("Please enter age in numbers.");
		}
		catch(MyException e3)
		{
			System.out.println(e3);
		}
	}
}
