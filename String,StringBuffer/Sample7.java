public class Sample7
{
	public static void main(String[] args)
	{
		String str="xHix";
		
		int n=str.length();

		if(str.charAt(0)=='x')
		{
			str=str.substring(1,n);
			n--;
		}
		if(str.charAt(n-1)=='x')
		{
			str=str.substring(0,n-1);
			n--;
		}
		System.out.println(str);
	}
}
