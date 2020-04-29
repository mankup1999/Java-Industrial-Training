
import java.util.Scanner;

public class Demo1
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String numberString=kb.next();
		try
		{
			int number=Integer.parseInt(numberString);
			System.out.println("The square value is "+number*number);
			System.out.println("The work has been done successfully.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}
}
