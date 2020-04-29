import java.util.*;
import java.io.*;

public class Demo2
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
			while((ch=reader.read())!=-1)
				writer.write(ch);
			System.out.println("File is copied.");
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
