public class Sample4
{
	public static void main(String[] args)
	{
		String str="Apron";
		int n=str.length();
		if(n%2!=0)
			System.out.println("null");
		else
			System.out.println(str.substring(0,n/2));
	}
}
