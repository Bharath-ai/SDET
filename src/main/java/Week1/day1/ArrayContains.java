package Week1.day1;

import org.junit.Test;

public class ArrayContains {
	
	@Test
	public void example()
	{
		int[] arr = {1,3,5,7,9};
		int noToCheck = 6;
		arrayContains(arr,noToCheck);
	}

	private void arrayContains(int[] arr, int noToCheck) {
		
		boolean flag = false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==noToCheck)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Given number is present in array ");
		}
		else
		{
			System.out.println("Given number is not present in array ");
		}
		
	}

}
