
import java.util.Arrays;

public class Sample6
{
	public static void main(String[] args)
	{
		int[] arr={32,67,45,678,234,123};
	
		Arrays.sort(arr);

		int arr_len=arr.length;	
		
		for(int i=0;i<arr_len;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
