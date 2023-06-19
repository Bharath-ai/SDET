package Week2.day2;

import org.junit.Test;

//https://leetcode.com/problems/remove-element/
public class LC27_RemoveElement {

	@Test
	public void positive() {
		int[] arr = { 1, 2, 3,3, 4,3, 5, 6, 7 };
		int target = 3;
		System.out.println(removeElement(arr, target));
	}

//	@Test
//	public void negative() {
//		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 5 };
//		int target = 8;
//		removeElement(arr, target);
//	}
//
//	@Test
//	public void edge() {
//		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 0 };
//		int target = 0;
//		removeElement(arr, target);
//	}

	private int removeElement(int[] arr, int target) {
		int ptr1 = 0, ptr2 = 0;
		while (ptr2 < arr.length) {
			if (arr[ptr2] != target) {
				arr[ptr1] = arr[ptr2];
				ptr1++;
				ptr2++;
			} else {
				ptr2++;
			}

		}

		return ptr1;

	}

}
