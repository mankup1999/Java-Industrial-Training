public class Sample13
{
	public static void main(String[] args)
	{
		for(int i=10;i<=99;i++)
		{
			if(checkPrime(i))
				System.out.println(i);
		}
	}
	
	public static boolean checkPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
				return false;
		return true;
	}
}
