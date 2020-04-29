public class Sample3
{
	public static void main(String[] args)
	{
		int[] arr={1,4,34,56,7};
		int item=56;
		int arr_len=arr.length;
		int index=-1;
		
		for(int i=0;i<arr_len;i++)
			if(arr[i]==item)
			{
				index=i;
				break;
			}

		System.out.println(index);
	}
}
