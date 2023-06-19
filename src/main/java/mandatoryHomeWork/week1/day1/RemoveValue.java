package Week1.day1;

import org.junit.Test;

public class RemoveValue {

	
	@Test
	public void example()
	{
		int[] arr = {0,1,2,3,5,7,9};
		int noToRemove = 0;
		removeValue(arr,noToRemove);
	}

	private void removeValue(int[] arr, int noToRemove) {
		int[] arr1 = new int[arr.length-1];
		int i=0;
		for(; i<arr.length; i++)
		{
			if(arr[i]!= noToRemove)
			{
				arr1[i] = arr[i];
			}
			else 
			{
				System.out.println("Break");
				break;
			}
		}
		
		++i;
		for(; i<arr.length; i++)
		{
		arr1[i-1]=arr[i];
		}
		for(i=0;i<arr1.length;i++)
		{
		System.out.print(arr1[i]+",");
		}
		
	}
}
