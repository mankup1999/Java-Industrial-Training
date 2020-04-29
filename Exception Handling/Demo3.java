import java.util.Scanner;

public class Demo3
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of elements in the array");
			int n=kb.nextInt();
			int[] arr=new int[n];
			System.out.println("Enter the elements in the array");
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(kb.next());
			System.out.println("Enter the index of the array element you want to access");
			int index=kb.nextInt();
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		
	}
}
