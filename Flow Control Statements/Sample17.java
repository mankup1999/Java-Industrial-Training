
import java.util.Scanner;

public class Sample17
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();

		int numcopy=num;
		int revnum=0;
		while(numcopy>0)
		{
			revnum=10*revnum+(numcopy%10);
			numcopy/=10;
		}
		System.out.println(revnum);
	}
}
