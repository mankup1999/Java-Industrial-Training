public class Sample2
{
	public static void main(String[] args)
	{
		int[] arr={3,2,7,1,8,2,1,10,13,1};

		int arr_len=arr.length;

		int max=arr[0];
		for(int i=0;i<arr_len;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println("Maximum: "+max);

		int min=arr[0];
		for(int i=0;i<arr_len;i++)
			if(arr[i]<min)
				min=arr[i];
		System.out.println("Minimum: "+min);
	}
}

