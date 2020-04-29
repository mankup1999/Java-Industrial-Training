import java.util.Arrays;
public class Sample8
{
	public static void main(String[] args)
	{
		String str="ab*cd";

		int n=str.length();
		char[] charStr=str.toCharArray();
		boolean[] flag=new boolean[n];
		Arrays.fill(flag,true);		
		for(int i=0;i<n;i++)
			if(charStr[i]=='*')
			{
				flag[i]=false;
				if(i>=1)
					flag[i-1]=false;
				if(i<n-1)
					flag[i+1]=false;
			}

		String result="";
		for(int i=0;i<n;i++)
			if(flag[i])
				result+=charStr[i];
		System.out.println(result);		

	}
}
