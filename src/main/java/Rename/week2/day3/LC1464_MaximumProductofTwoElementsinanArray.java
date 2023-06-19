package Week2.day3;

import java.util.Arrays;

import org.junit.Test;

public class LC1464_MaximumProductofTwoElementsinanArray {
	/*
	 * Given the array of integers nums, you will choose two different indices i and
	 * j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
	 * 
	 * 1).Did I understand the problem? ---> Yes 2).Derive Test Data ---> Yes 3).Do
	 * I know how to solve this? ---> Only BruteForce 6). O Notations : Time
	 * Complexity : Space Complexity : O[1] 7). Pseudo Code: a) Given the input
	 * Array, we need to find the maximum two numbers in that Array. b) By
	 * BruteForce, we can use Arrays.sort and it will sort the input array. c) Then
	 * take the last two indexes values using length-1 & length-2. d) Subtract it
	 * with -1 and multiply the both indexes values. e) Return the int value, which
	 * is the maximum.
	 * 
	 */

	@Test
	public void positive() {
		int[] nums = { 3, 4, 4, 8, 8 };
		maximumProduct(nums);
		// System.out.println(maximumProduct(nums));
	}

//	@Test
//	public void negative() {
//		int[] nums = { 1, -5, -4, 5 };
//		//System.out.println(maximumProduct(nums));
//	}
//    
//	@Test
//	public void edge() {
//		int[] nums = { 3, 7,8 };
//		//System.out.println(maximumProduct(nums));
//	}

	private void maximumProduct(int[] nums) {
//		Arrays.sort(nums);
//		int maximumValue =  ((nums[nums.length-1]) - 1) * ((nums[nums.length-2]-1));
//		return maximumValue;

		int maxIndex = 0, secondmaX = 0;
		int i = 0, j = -1;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] > maxIndex) {
				maxIndex = nums[i];
				j++;
			}
		}
		System.out.println(maxIndex);

		for (i = 0; i < nums.length; i++) {
			if (nums[i] > secondmaX) {
				if (i != j) {
					secondmaX = nums[i];
				}
			}
		}
		System.out.println(secondmaX);

	}

}
