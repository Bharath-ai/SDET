package Week4.day3;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P58_RemoveAdjacentCharactes {

	/*
	 * You are given a string s consisting of lowercase English letters. A duplicate
	 * removal consists of choosing two adjacent and equal letters and removing
	 * them.
	 * 
	 * We repeatedly make duplicate removals on s until we no longer can.
	 * 
	 * Return the final string after all such duplicate removals have been made. It
	 * can be proven that the answer is unique.
	 */

	/*
	 * Pseudocde: * Convert the String into char array say ch. Iterate the char
	 * array using while loop till the i<length of the String. Declare one character
	 * stack to store the iterated elements. If the stack is empty or stack.peek is
	 * not equal to charAt(i) Push the character into the stack or-else pop it.
	 * Convert the stack into the string and return it
	 */
	
	/*
	 * Time Complexity : O[n]
	 * Space Complexity : O[n]
	 */

	@Test
	public void positive() {
		String input = "bhaarath";
		Assert.assertEquals("bhrath", removeAdjacent(input));
	}

	@Test
	public void negative() {
		String input = "bharath";
		Assert.assertEquals("bharath", removeAdjacent(input));
	}

	@Test
	public void edge() {
		String input = "baabcc";
		Assert.assertEquals("", removeAdjacent(input));
	}

	private String removeAdjacent(String input) {
		char[] value = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < value.length) {
			char current = input.charAt(i);
			if (stack.empty() || stack.peek() != current) {
				stack.push(current);
			} else {
				stack.pop();
			}
			i++;
		}

		 return stack.toString();
//		StringBuilder sb = new StringBuilder();
//		for (Character stackChar : stack) {
//			sb.append(stackChar);
//		}
//		return sb.toString();
	}

}
