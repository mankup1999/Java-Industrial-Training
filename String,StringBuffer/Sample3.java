public class Sample3
{
	public static void main(String[] args)
	{
		String str="Wipro";
		
		int n=str.length();
		char first=str.charAt(0);
		char second=str.charAt(1);
	
		String finalResult="";
		
		for(int i=0;i<n;i++)
			finalResult=finalResult+first+second;

		System.out.println(finalResult);
		
	}
}
