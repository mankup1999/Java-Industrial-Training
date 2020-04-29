import java.util.Scanner;

public class Demo9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}
