import java.util.Scanner;

public class Demo3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("I/P: ");
		int a=sc.nextInt();
		
		System.out.println("O/P: "+String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'));
	}
}
