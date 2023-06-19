package Week1.day4;

import java.util.Arrays;

import org.junit.Test;

//https://leetcode.com/problems/missing-number/description/
public class LC268_MissingNumber {

	@Test
	public void example1() {
		int[] arr = { 0, -1, 2 };
		System.out.println(missingNumber(arr));
	}

	@Test
	public void example3() {
		int[] arr = { 3, 0, 1 };
		System.out.println(missingNumber(arr));
	}

	public int missingNumber(int[] arr) {

		int retVal;
		int min = 0, max = -1;
		for (int i : arr)
			if (i > max)
				max = i;
		for (int i = min; i <= max; i++) {
			for (int j : arr) {
				boolean isFound = false;

			}
		}
		return 0;
//		Arrays.sort(arr);
//
//		if (arr[arr.length - 1] != arr.length) {
//			return arr.length;
//		}
//
//		else if (arr[0] != 0) {
//			return 0;
//		}
//
//		for (int i = 1; i < arr.length; i++) {
//			int expectedNum = arr[i - 1] + 1;
//			if (arr[i] != expectedNum) {
//				return expectedNum;
//			}
//		}
//
//		return -1;
	}
}
