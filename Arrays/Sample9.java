public class Sample9
{
	public static void main(String[] args)
	{	
		int arg_len=args.length;
		if(arg_len!=4)
			System.out.println("Please enter 4 integer numbers");
		else
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int d=Integer.parseInt(args[3]);
			System.out.println("The given array is :");
			System.out.println(a+" "+b+"\n"+c+" "+d);
	
			System.out.println("The reverse of the array is :");
			System.out.println(d+" "+c+"\n"+b+" "+a);
	
		}
	}
}
