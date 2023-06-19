package Week1.day1;

import org.junit.Test;

public class PrintArray {

	
	@Test
	public void example()
	{
		int[] arr1 = {1,4,5,7,9};
		printArrayAsString(arr1);
	}

	private void printArrayAsString(int[] arr1) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]);
		}
	}
}
