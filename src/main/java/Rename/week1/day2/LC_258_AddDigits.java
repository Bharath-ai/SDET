package Week1.day2;

import org.junit.Test;

public class LC_258_AddDigits {

	//https://leetcode.com/problems/add-digits/
	@Test
	public void example1() {
		int digits = 999;
		addDigits(digits);
	}

	private void addDigits(int digits) {
		int temp = 0;
		while (digits > 0) {
			temp = temp + digits % 10;
			digits = digits / 10;

			if (digits == 0 && temp > 9) {
				digits = temp;
				temp = 0;

			}

		}
		System.out.println(temp);
	}
}
