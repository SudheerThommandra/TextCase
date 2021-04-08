package Demo;

public class FindResult 
{
	public static int FindMaxNum(int[] arr)
	{
		int max=arr[0];
		int l=arr.length;
		for(int i=1;i<l;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			}
		
		return max;
		}
	public static boolean evenOrodd(int a)
	{
		if(a%2==0)
			return true;
		else 
			return false;
		
	}
	

	
	
}
