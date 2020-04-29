
import java.util.Scanner;

public class Sample8
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		char c=input.next().charAt(0);

		String msg="";
		switch(c)
		{
			case 'R':msg="Red";break;
			case 'B':msg="Blue";break;
			case 'G':msg="Green";break;
			case 'O':msg="Orange";break;
			case 'Y':msg="Yellow";break;
			case 'W':msg="White";break;
			default: msg="Invalid Code";
		}
		System.out.println(msg);
	}
}
