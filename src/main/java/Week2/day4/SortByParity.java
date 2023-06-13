package Week2.day4;

import org.junit.Assert;
import org.junit.Test;

public class SortByParity {

	@Test
	public void example() {
		int[] arr = { 5, 7, 8, 4, 2, 3 };
		sortByParity(arr);
		
	}

	private int[] sortByParity(int[] arr) {
         int left=0,right=0,temp=0;
         while(right<arr.length) {
        	 if(arr[right]%2==0)
        	 {
        		 temp = arr[right];
        		 arr[right++] = arr[left];
        		 arr[left++] = temp;
        	 }
        	 else {
        		 right++;
        	 }
         }
         System.out.println("");
         return arr;
	}

}
