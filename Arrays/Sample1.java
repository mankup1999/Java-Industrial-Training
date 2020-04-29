public class Sample1
{
	public static void main(String[] args)	
	{
		int[] arr={4,5,8,3,2};
		int arr_len=arr.length;
		int sum=0;
		float avg;
	
		for(int i=0;i<arr_len;i++)
			sum+=arr[i];
		avg=(float)sum/arr_len;
		
		System.out.println("Sum: "+sum);
		System.out.println("Avergae: "+avg);
	}
}
