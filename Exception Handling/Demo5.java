
import java.util.Scanner;

public class Demo5
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=kb.nextInt();
		int b=kb.nextInt();
		try
		{
			int c=division(a,b);
			System.out.println(a+"/"+b+"="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(a+"/"+b+" is not possibble");			
		}
	}
	public static int division(int a,int b) throws ArithmeticException
	{
		return a/b;
	}
}
