public class Sample9
{
	public static void main(String[] args)
	{
		String a="Hello";
		String b="World";
		
		int n1=a.length();
		int n2=b.length();

		char[] s1=a.toCharArray();
		char[] s2=b.toCharArray();

		String result="";
		int i;
		for(i=0;i<n1&&i<n2;i++)
			result=result+s1[i]+s2[i];
		while(i<n1)
			result=result+s1[i++];
		while(i<n2)
			result=result+s2[i++];
		System.out.println(result);
			
	}
}
