public class Sample2
{
	public static void main(String[] args)
	{
		String str1="mark";
		String str2="kate";

		int str1_len=str1.length();
		if(str2.length()>0 && str1.charAt(str1_len-1)==str2.charAt(0))
		{
			StringBuffer strBuff=new StringBuffer(str2);
			strBuff.deleteCharAt(0);
			str2=strBuff.toString();
		}

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		System.out.println(str1+str2);
		
	}
}
