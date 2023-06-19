package Week3.day1;

import org.junit.Test;

//https://leetcode.com/problems/maximum-average-subarray-i/
public class LC643_MaximumAverageSubArray {

	/*
	 * You are given an integer array nums consisting of n elements, and an integer
	 * k.
	 * 
	 * Find a contiguous subarray whose length is equal to k that has the maximum
	 * average value and return this value. Any answer with a calculation error less
	 * than 10-5 will be accepted.
	 */

	@Test
	public void example() {
		int[] nums = { 1, 12, 5, 6, 50, 3 };
		int k = 4;
		System.out.println(maximumAverage(nums, k));
	}

	@Test
	public void example2() {
		int[] nums = { 5 };
		int k = 1;
		System.out.println(maximumAverage(nums, k));
	}

	private double maximumAverage(int[] nums, int k) {
		int left = 0, right = 0;
		double average = 0;
		double maxaverage = Integer.MIN_VALUE;

		if (nums.length == 1) {
			maxaverage = nums[0];
		}
		while (right < k) {
			average += nums[right++];
		}
		maxaverage = Math.max(average / k, maxaverage);
		while (right < nums.length) {
			average -= nums[left++];
			average += nums[right++];
			maxaverage = Math.max(average / k, maxaverage);
		}

		return maxaverage;

	}
}
