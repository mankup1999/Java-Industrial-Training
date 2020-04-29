public class Sample14
{
	public static void main(String[] args)
	{
		int args_len=args.length;
		if(args_len==0)
			System.out.println("Please enter an integer number");
		else
		{
			int num=Integer.parseInt(args[0]);
			if(num==0 || num==1)
				System.out.println(num+" is neither prime nor composite");
			else
			{
				boolean flag=true;
				for(int i=2;i*i<=num;i++)
					if(num%i==0)
					{
						flag=false;
						break;
					}
				if(flag)
					System.out.println(num+" is a prime number");
				else
					System.out.println(num+" is not a prime number");
			} 
		}
	}
}
