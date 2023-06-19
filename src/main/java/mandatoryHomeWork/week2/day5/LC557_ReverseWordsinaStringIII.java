package Week2.day5;

import org.junit.Test;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class LC557_ReverseWordsinaStringIII
 {

	/*
	 * Given a string s, reverse the order of characters in each word within a
	 * sentence while still preserving whitespace and initial word order.
	 */

	@Test
	public void example() {
		String s = "Welcome    To Testleaf";
		reverseSentence(s);
	}

	private void reverseSentence(String s) {
		String[] words = s.split(" ");
		String output = "";

		char temp = ' ';
		for (String word : words) {
			int left = 0;
			int right = word.length()-1;
			char[] ch = word.toCharArray();
			while (left < right) {
				temp = ch[right];
				ch[right--] = ch[left];
				ch[left++] = temp;
			}

			output = output+" "+String.valueOf(ch).trim();
		}

		System.out.println(output);

	}

}
