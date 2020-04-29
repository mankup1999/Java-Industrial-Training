public class Sample10
{
	public static void main(String[] args)
	{
		int args_len=args.length;
		if(args_len!=9)
			System.out.println("Please enter 9 integer numbers");
		else
		{
			int[][] arr=new int[3][3];
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					arr[i][j]=Integer.parseInt(args[3*i+j]);
			
			for(int i=0;i<3;i++)
			{	
				for(int j=0;j<3;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}

			int max=arr[0][0];
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					if(max<arr[i][j])
						max=arr[i][j];
			System.out.println("The biggest number in the given array is "+max);
		}
	}
}
