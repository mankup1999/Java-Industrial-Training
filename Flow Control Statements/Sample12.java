public class Sample12
{
	public static void main(String[] args)
	{
		int num=17;
		
		if(num<2)
			System.out.println("Not prime");
		else
		{
			boolean isprime=true;
			for(int i=2;i*i<=num;i++)
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			if(isprime)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
	}
}
