
import java.util.Arrays;

public class Sample7
{
	public static void main(String[] args)
	{
		int[] arr={12,34,12,45,67,89};
		int arr_len=arr.length;
	
		boolean[] traversed=new boolean[arr_len];
		Arrays.fill(traversed,false);

		for(int i=0;i<arr_len;i++)
		{
			if(traversed[i]==false)
			{
				for(int j=i+1;j<arr_len;j++)
					if(arr[i]==arr[j])
						traversed[j]=true;
			}
		}

		for(int i=0;i<arr_len;i++)
			if(traversed[i]==false)
				System.out.print(arr[i]+" ");
		System.out.println();

	}
}
