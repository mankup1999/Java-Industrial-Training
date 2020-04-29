import java.util.*;

public class Project
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList(5);
		System.out.print("S1: ");
		String s1=sc.next();
		System.out.print("S2: ");
		String s2=sc.next();
		int n1=s1.length();
		int n2=s2.length();
		
		//1st Logic
		String result="";
		for(int i=0;i<n1;i++)
		{
			if(i%2==0)
				result=result+s2;
			else
				result=result+s1.charAt(i);
		}
		list.add(result);
		
		//2nd Logic
		result="";
		int occurence=countOccurrence(s1,s2);//Just to check more than one occurence
		if(occurence>1)
		{
			int lastIndex=s1.lastIndexOf(s2);
			result=s1.substring(0,lastIndex);
			for(int i=n2-1;i>=0;i--)
				result=result+s2.charAt(i);
			result=result+s1.substring(lastIndex+n2);
			list.add(result);
		}
		else
			list.add(s1+s2);
		result="";
		
		//3rd Logic
		if(occurence>1)
		{
			int index=s1.indexOf(s2);
			result=s1.substring(0,index)+s1.substring(index+n2);
			list.add(result);
		}
		else
			list.add(s1);


		//4th Logic
		result="";
	
		int half=n2/2;
		if(n2%2!=0)
			half=(n2+1)/2;
		String first=s2.substring(0,half);
		String second=s2.substring(half);
		result=first+s1+second;
		list.add(result);
		

		//5th Logic
		result="";
		for(int i=0;i<n1;i++)
		{
			char ch=s1.charAt(i);
			boolean flag=true;
			for(int j=0;j<n2;j++)
				if(s2.charAt(j)==ch)
				{flag=false;break;}
			if(flag)
				result=result+ch;
			else
				result=result+"*";
			
		}
		list.add(result);

		//Final List
		System.out.println(list);
	
	}
	//Count occurrence
	public static int countOccurrence(String s1,String s2)
	{
		int count=0;
		int index=s1.indexOf(s1);
		while(index!=-1)
		{
			count++;
			s1=s1.substring(index+1);
			index=s1.indexOf(s2);
		}
		return count;
	}
}









