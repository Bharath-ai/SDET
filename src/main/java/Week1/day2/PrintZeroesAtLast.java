package Week1.day2;

import org.junit.Test;

public class PrintZeroesAtLast {
	
	@Test
	public void example()
	{
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		int noToPush = 0;
		pushLast(arr,noToPush);
	}

	private void pushLast(int[] arr, int noToPush) {
		
		int[] arr1 = new int[arr.length];
		for(int i=0,j=0; i<arr.length; i++)
		{
			if(arr[i]!= noToPush)
			{
				arr1[j] = arr[i];
				j++;
			}
		}
		
		for(int k=0; k<arr1.length; k++)
		{
			System.out.println(arr1[k]);
		}
		
		
		
	}

	

}
