import java.util.*;
import java.io.*;

public class Demo1
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the input file name");
		String inputFileName=sc.next();

		System.out.println("Enter the character to be counted");
		char ch=sc.next().charAt(0);

		FileReader reader=null;
		int count=0;
		try
		{
			reader=new FileReader(inputFileName);
			int c;
			while((c=reader.read())!=-1)
			{
				if(c==ch || c+32==ch || c-32==ch)
					count++;
			}
			
			System.out.println("File \'"+inputFileName+"\' has "+count+" instances of letter \'"+ch+"\'.");
		}
		finally
		{
			if(reader!=null)
				reader.close();
		}
		
	}
}
