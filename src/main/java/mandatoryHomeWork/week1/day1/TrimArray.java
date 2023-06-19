package Week1.day1;

import org.junit.Test;

public class TrimArray {
	
	@Test
    public void example()
    {
		int[] arr = {1,4,5,7,9};
		int toTrim = 3;
		arrayTrim(arr,toTrim);
    }

	private void arrayTrim(int[] arr, int toTrim) {
        
		int newValue = (arr.length) - toTrim;
		int[] arr1 = new int[newValue];
		for(int i=0; i<newValue; i++)
		{
			arr1[i] = arr[i];
			System.out.print(arr[i]+",");
		}
		
	}
}
