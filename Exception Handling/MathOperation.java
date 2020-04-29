public class MathOperation
{
	public static void main(String[] args)
	{
		try
		{
			int[] arr=new int[5];
			for(int i=0;i<5;i++)
				arr[i]=Integer.parseInt(args[i]);
			int sum=0;
			int avg;
			for(int i=0;i<5;i++)
				sum+=arr[i];
			avg=sum/5;
			System.out.println("Sum: "+sum+"\nAverage: "+avg);
		}
		catch(Exception e)
		{
			System.out.println("Please enter correct inputs through command line.");
		}
	}
}
