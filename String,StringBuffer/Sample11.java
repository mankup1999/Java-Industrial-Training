public class Sample11
{
	public static void main(String[] args)
	{
		String a="XY1XY";
		String b="XY";
		int n1=a.length();
		int n2=b.length();
		int index=a.indexOf(b);
		String result="";
		while(index!=-1)
		{
			if(index>0)
				result+=a.charAt(index-1);
			if(index+n2<n1-1)
				result+=a.charAt(index+n2);
			a=a.substring(index+1);
			index=a.indexOf(b);
		}

		System.out.println(result);
	}
}
