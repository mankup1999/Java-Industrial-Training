
import java.util.Scanner;

public class Sample5
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int n=str.length();
	
		System.out.println(str.substring(1,n-1));	
	}
}
