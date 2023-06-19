package Week1.day5;

import org.junit.Test;
//https://leetcode.com/problems/maximum-69-number/
public class LC1323_Maximum69Number {

	/*
	 * You are given a positive integer num consisting only of digits 6 and 9.
	 * 
	 * Return the maximum number you can get by changing at most one digit (6
	 * becomes 9, and 9 becomes 6).
	 */

	@Test
	public void example() {
		int num = 9669;
		maximumNumber(num);
	}

	private void maximumNumber(int num) {
		int[] arr = new int[4];
		int sum = 0;
		int i = 0;
		while (num > 0) {
			sum = num % 10;
			num = num / 10;
			arr[i] = sum;
			i++;
		}

		int[] arr1 = new int[i];
		boolean flag = false;
		for (int j = 0; j < i; j++) {
			if (arr[j] == 9 || flag == true) {
				System.out.print(arr[j]);
			} else {
				System.out.print(9);
				flag = true;
			}
		}

	}
}
