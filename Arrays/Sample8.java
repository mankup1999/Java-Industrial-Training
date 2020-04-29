public class Sample8
{
	public static void main(String[] args)
	{
		int[] arr={1,6,4,7,9};
		int arr_len=arr.length;

		int sum=0;
		boolean condition=false;
		for(int i=0;i<arr_len;i++)
		{
			if(arr[i]==6)
			{
				int j=indexOfNext(arr,arr_len,i+1);
				if(j==i)
					sum+=arr[i];
				else
					i=j-1;
			}
			else
				sum+=arr[i];
		}
		System.out.println(sum);
	}
	public static int indexOfNext(int[] arr,int n,int x)
	{
		int index=x-1;
		for(int i=x;i<n;i++)
			if(arr[i]==7)
			{
				index=i+1;
				break;
			}
		return index;
	}
}
