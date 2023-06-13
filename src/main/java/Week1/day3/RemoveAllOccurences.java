package Week1.day3;

import org.junit.Assert;
import org.junit.Test;

public class RemoveAllOccurences {
	
	
	//Problem
	
	/**
	 * Remove all occurrence of a number 
	which is present in the given index number
	 */
	

	@Test
	public void example1() {
		int[] arr = {1,1,1,5,5,1,1,1};
		int[] op = {1,1,1,1,1,1};
		int indexToRemove = 3;
		//int[] arr1 = removeAllOccurences(arr, indexToRemove);
		Assert.assertArrayEquals(removeAllOccurences(arr, indexToRemove), op);
	}

	private int[] removeAllOccurences(int[] arr, int indexToRemove) {
		int[] arr1 = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != arr[indexToRemove]) {
				arr1[j] = arr[i];
				j++;
			}
		}

		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] != 0) {
				arr1[k] = k;
				System.out.print(arr1[k]);
			} else
				break;
		}
		
		return arr1;
	}

}
