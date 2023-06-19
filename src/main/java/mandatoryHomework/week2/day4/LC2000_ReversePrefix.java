package Week2.day4;

import org.junit.Test;

//https://leetcode.com/problems/reverse-prefix-of-word/
public class LC2000_ReversePrefix {

	/*
	 * Given a 0-indexed string word and a character ch, reverse the segment of word
	 * that starts at index 0 and ends at the index of the first occurrence of ch
	 * (inclusive). If the character ch does not exist in word, do nothing.
	 * 
	 * For example, if word = "abcdefd" and ch = "d", then you should reverse the
	 * segment that starts at 0 and ends at 3 (inclusive). The resulting string will
	 * be "dcbaefd". Return the resulting string
	 */

	/*
	 * Pseudocode : * First find the index of the character 'ch'. * Set one pointer
	 * at the index 0th position and pointer ptr2 at 'ch' character * Iterate the
	 * while loop until the ptr1<ptr2 * In Each iteration swap the values using the
	 * temp variables * Then convert the char array to string and return the output as string.
	 */

	@Test
	public void example1() {
		String s = "abcdefd";
		char ch = 'd';
		System.out.println(reversePrefix(s, ch));
	}
	
	@Test
	public void example2() {
		String s = "xyxzxe";
		char ch = 'z';
		System.out.println(reversePrefix(s, ch));
	}

	private String reversePrefix(String s, char ch) {
		int ptr2 = s.indexOf(ch);
		int ptr1 = 0;
		char temp = ' ';
		char[] arr = s.toCharArray();
		while (ptr1 < ptr2) {
			temp = arr[ptr2];
			arr[ptr2--] = arr[ptr1];
			arr[ptr1++] = temp;
		}

		return String.valueOf(arr);

	}
}
