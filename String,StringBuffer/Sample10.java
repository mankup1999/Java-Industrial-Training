public class Sample10
{
	public static void main(String[] args)
	{
		String str="Wipro";
		int x=3;

		int n=str.length();

		String cut=str.substring(n-3);
		String result="";
		for(int i=0;i<x;i++)
			result=result+cut;
		
		System.out.println(result);
	}
}
