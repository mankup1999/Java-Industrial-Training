public class Sample18
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int numcopy=num;
		int revnum=0;
		while(numcopy>0)
		{
			revnum=10*revnum+(numcopy%10);
			numcopy/=10;
		}
		if(num==revnum)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
}
