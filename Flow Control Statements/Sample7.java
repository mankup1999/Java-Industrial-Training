public class Sample7
{
	public static void main(String[] args)
	{
		char c='A';
		
		if(c>=65 && c<=90)
			System.out.println(c+"->"+(char)(c+32));
		else if(c>=97 && c<=122)
			System.out.println(c+"->"+(char)(c-32));
	}
}
