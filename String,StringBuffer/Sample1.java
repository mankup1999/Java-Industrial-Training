public class Sample1
{
	public static void main(String[] args)
	{
		String str="MALAYALAM";
		
		StringBuffer strbuff=new StringBuffer(str);
		strbuff.reverse();
		String rev=strbuff.toString();

		if(str.equals(rev))
			System.out.println(str+": Palindrome");
		else
			System.out.println(str+": Not Palindrome");
	}
}
