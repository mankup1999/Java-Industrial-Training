import java.util.*;
import java.io.*;

public class Demo3
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFileName=sc.next();
		System.out.println("Enter the output file name");
		String outputFileName=sc.next();

		FileReader reader=null;
		FileWriter writer=null;

		try
		{
			reader=new FileReader(inputFileName);
			writer=new FileWriter(outputFileName);
			int ch;
			String msg="";
			while((ch=reader.read())!=-1)
				msg=msg+(char)ch;
			
			String[] words=msg.trim().split(" ");
			int n=words.length;
			for(int i=0;i<n;i++)
				words[i]=(words[i]).trim();
			Arrays.sort(words);
			int[] count=new int[n];
			Arrays.fill(count,0);
			boolean[] flag=new boolean[n];
			Arrays.fill(flag,false);
			for(int i=0;i<n;i++)
			{
				if(flag[i]==false)
				{
					String word=words[i];
					count[i]++;
					for(int j=i+1;j<n;j++)
						if(word.equalsIgnoreCase(words[j]))
							{count[i]++;flag[j]=true;}
				}
			}

			String outMsg="";
			
			for(int i=0;i<n;i++)
				if(flag[i]==false)
					outMsg=outMsg+(words[i]+" : "+count[i])+"\n";
			int len=outMsg.length();
			for(int i=0;i<len;i++)
				writer.write((int)outMsg.charAt(i));
		}
		finally
		{
			if(reader!=null)
				reader.close();
			if(writer!=null)
				writer.close();
		}
		
	}
}
