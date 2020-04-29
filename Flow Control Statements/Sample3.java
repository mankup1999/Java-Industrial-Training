public class Sample3
{
	public static void main(String[] args)
	{
		int args_len=args.length;

		if(args_len==0)
			System.out.println("No values");		
		else
		{
			String msg="";
			for(int i=0;i<args_len-1;i++)
				msg+=args[i]+",";
			msg+=args[args_len-1];
			System.out.println(msg);
		}
	}
}
