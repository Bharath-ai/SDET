package day5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MergeSortedArrays {

	/*
	 * Given two sorted lists, merge them to form a single list with all items in
	 * non-decreasing order.
	 */

	/*
	 * Pseudocode: 
	 * Given two sorted list say nums1, nums2. 
	 * Declare another list say nums3 to add the elements from nums1, nums2.
	 * Declare two pointers say ptr1,ptr2 and initalize at the begining index of nums1 and nums2.
	 * Iterate the list elements with the while loop until the ptr1,ptr2 index is less than nums1 & nums2 size.
	 * If nums1 value is lesser than nums2 value,push the nums1 value into new list and increase the ptr1
	 * If nums1 value is greater than nums2 value,push the nums2 value into new list and increase the ptr2
	 * If nums1 value is equal to nums2 , then push both value into nums3 list and increase both ptr1 & ptr2.
	 * Finally check the both ptrs are completely iterated by comparing it with the list size.
	 */

	@Test
	public void example() {
		List<Integer> nums1 = new ArrayList<Integer>();
		
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		List<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(2);
		nums2.add(5);
		nums2.add(5);
		List<Integer> nums3 = mergeSortedArrays(nums1, nums2);
		printList(nums3);

	}

	private List<Integer> mergeSortedArrays(List<Integer> nums1, List<Integer> nums2) {

		int ptr1 = 0;
		int ptr2 = 0;
		List<Integer> nums3 = new ArrayList<Integer>();
		while (ptr1 < nums1.size() && ptr2 < nums2.size()) {
			if (nums1.get(ptr1) < nums2.get(ptr2)) {
				nums3.add(nums1.get(ptr1));
				ptr1++;
			} else if (nums1.get(ptr1) > nums2.get(ptr2)) {
				nums3.add(nums2.get(ptr2));
				ptr2++;
			} else if (nums1.get(ptr1) == nums2.get(ptr2)) {
				nums3.add(nums1.get(ptr1));
				nums3.add(nums2.get(ptr2));
				ptr1++;
				ptr2++;

			}

		}

		if (ptr1 != nums1.size()) {
			for (int i = ptr1; i < nums1.size(); i++) {
				nums3.add(nums1.get(i));
			}
		} else if (ptr2 != nums2.size()) {
			for (int i = ptr2; i < nums2.size(); i++) {
				nums3.add(nums2.get(i));
			}
		}
		return nums3;
	}

	private static void printList(List<Integer> list1) {
		for (Integer eachValue : list1) {
			System.out.print(eachValue);
		}

	}

}
