package Week2.day1;

import org.junit.Test;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class LC26_RemoveDuplicatesFromSortedArray {
	@Test
	public void example() {
		int[] nums = { 1,2,2,3,4,5 };
		removeDuplicates(nums);
	}

	private void removeDuplicates(int[] nums) {
		int ptr1 = 0, ptr2 = 1;
		while (ptr2 < nums.length) {
			if (nums[ptr2] != nums[ptr1]) {
				ptr1++;
				nums[ptr1] = nums[ptr2];
				ptr2++;
			} else {
				ptr2++;
				ptr1++;
				nums[ptr1] = nums[ptr2];
			}
		}
		
		System.out.println("");

	}
}
