package Week2.day2;

import org.junit.Test;

//https://leetcode.com/problems/merge-strings-alternately/description/
public class LC_1768_MergeStringsAlternately
 {

	/*
	 * You are given two strings word1 and word2. Merge the strings by adding
	 * letters in alternating order, starting with word1. If a string is longer than
	 * the other, append the additional letters onto the end of the merged string.
	 * 
	 * Return the merged string.
	 */

	/*
	 * Constraints:
	 * 
	 * 1 <= word1.length, word2.length <= 100 word1 and word2 consist of lowercase
	 * English letters.
	 */
	/*
	 * Step1 : Did I understand the problem? ----> Yes // Step2 : Derive Test Data
	 * //Pseudocode : Declare ptr1,ptr2 two pointers at the start of each word 0th index
	 * Declare one empty string for output.
	 * Use while loop and iterate to the length of the each word.
	 * First append the ptr1 index to the output string and increase the ptr1.
	 * Next append the ptr2 index to the output string and increase the ptr2.
	 * Run the while loop till the end of the length of the words
	 * Print the output
	 */

	@Test
	public void positive() {
		String word1 = "abc";
		String word2 = "pqr";
		mergeStrings(word1, word2);
	}

	@Test
	public void negative() {
		String word1 = "";
		String word2 = "";
		mergeStrings(word1, word2);
	}

	@Test
	public void edge() {
		String word1 = "sdet";
		String word2 = "tes";
		mergeStrings(word1, word2);
	}

	private void mergeStrings(String word1, String word2) {
		
		int ptr1 = 0 , ptr2= 0;
		String output = "";
		while(ptr1<word1.length() && ptr2<word2.length())
		{
			output = output + word1.charAt(ptr1)+word2.charAt(ptr2);
			ptr1++;
			ptr2++;
		}
		if(ptr1 != word1.length()) {
			output = output + word1.substring(ptr1,word1.length());
		}
		System.out.println(output);



	}

}
