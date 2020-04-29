
import java.util.Scanner;

public class Sample15
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		int digsum=0;
		while(num>0)
		{
			digsum+=num%10;
			num/=10;
		}
		System.out.println(digsum);
	}
}
