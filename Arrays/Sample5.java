public class Sample5
{
	public static void main(String[] args)
	{
		int[] arr={89,76,45,32,456,234};
		int arr_len=arr.length;

		int max=arr[0];
		for(int i=1;i<arr_len;i++)
			if(max<arr[i])
				max=arr[i];
		System.out.println("Largest: "+max);

		int second_max=arr[0];
		for(int i=1;i<arr_len;i++)
			if(second_max<arr[i] && max>arr[i])
				second_max=arr[i];
		System.out.println("Second Largest: "+second_max);

		int min=arr[0];
		for(int i=1;i<arr_len;i++)
			if(min>arr[i])
				min=arr[i];
		System.out.println("Samllest: "+min);

		int second_min=arr[0];
		for(int i=1;i<arr_len;i++)
			if(second_min>arr[i] && min<arr[i])
				second_min=arr[i];
		System.out.println("Second Smallest: "+second_min);
	}
}
