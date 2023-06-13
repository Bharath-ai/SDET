package Week2.day4;

import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/problems/reverse-prefix-of-word/
public class LC2000_ReversePrefixofWord {

	@Test
	public void example() {
		String word = "abcdefd";
		String ch = "d";
		char[] output = reversePrefix(word, ch);
		Assert.assertArrayEquals(new char[]{'d','c','b','a','e','f','d'},output);
		
	}

	private char[] reversePrefix(String word, String ch) {
		int ptr1 = 0, ptr2 = 0;
		char temp = ' ';
		for (ptr2 = 0; ptr2 < word.length(); ptr2++) {
			char letter = word.charAt(ptr2);
			if (letter == 'd') {
				break;
			}
		}

		char[] arr = word.toCharArray();
		while (ptr1 < ptr2) {
			temp = arr[ptr2];
			arr[ptr2--] = arr[ptr1];
			arr[ptr1++] = temp;

		}
		//System.out.println(String.valueOf(arr));
		return arr;

	}

}
