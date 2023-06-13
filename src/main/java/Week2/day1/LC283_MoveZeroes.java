package Week2.day1;

import org.junit.Test;

//https://leetcode.com/problems/move-zeroes/
public class LC283_MoveZeroes {

	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining
	 * the relative order of the non-zero elements.
	 * 
	 * Note that you must do this in-place without making a copy of the array.
	 */

	@Test
	public void example() {
		int[] nums = { 0, 2, 0, 3, 12 };
		moveZeroes(nums);
	}

	private void moveZeroes(int[] nums) {
		int ptr1 = 0, ptr2 = 0;
		while (ptr2 < nums.length) {
			if (nums[ptr2] != 0) {
				nums[ptr1] = nums[ptr2];
				ptr1++;
				ptr2++;
			} else {
				ptr2++;
			}
		}
		for (int k = ptr1; k < nums.length; k++) {
			nums[k] = 0;
		}
		System.out.println("");
	}

}
