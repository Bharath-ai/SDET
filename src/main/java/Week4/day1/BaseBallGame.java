package Week4.day1;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class BaseBallGame {

	/*
	 * You are keeping the scores for a baseball game with strange rules. At the
	 * beginning of the game, you start with an empty record.
	 * 
	 * You are given a list of strings operations, where operations[i] is the ith
	 * operation you must apply to the record and is one of the following:
	 * 
	 * An integer x. Record a new score of x. '+'. Record a new score that is the
	 * sum of the previous two scores. 'D'. Record a new score that is the double of
	 * the previous score. 'C'. Invalidate the previous score, removing it from the
	 * record. Return the sum of all the scores on the record after applying all the
	 * operations.
	 * 
	 * The test cases are generated such that the answer and all intermediate
	 * calculations fit in a 32-bit integer and that all operations are valid.
	 */

	/*
	 * Pseudocode: * Declare one Integer stack to store the operations to be
	 * performed in the input string[]. Iterate the String[] opeartions using while
	 * loop, starts from i=0 < opeartions.length; If the charat(i) is integer , push
	 * into the stack directly by typecasting . If the charat(i) is '+' , then push
	 * by perform a). Pop the top element and store in temp b). Now peek the element
	 * and store as top. c). sum the temp + top and push both temp and sum. If the
	 * charat(i) is 'C' , then pop the stack. If the charat(i) is 'D', then perform
	 * 2 * stack.peek and push into stack. Then initialize sum = 0, and using
	 * foreach loop iterate the stack array and store it in the sum and return it.
	 */

	@Test
	public void positive() {
		String[] operations = { "5", "2", "C", "D", "+" };
		Assert.assertEquals(30, addOperations(operations));

	}
	
	@Test
	public void negative() {
		String[] operations = { "5","-2","4","C","D","9","+","+" };
		Assert.assertEquals(27, addOperations(operations));
	}

	private int addOperations(String[] operations) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0;
		for (String eachValue : operations) {
			if (eachValue == "+") {
				int temp = stack.pop();
				int top = stack.peek();
				int add = temp + top;
				stack.push(temp);
				stack.push(add);
			} else if (eachValue == "D") {
				stack.push(2 * stack.peek());
			} else if (eachValue.equals("C")) {
				stack.pop();
			} else {
				stack.push(Integer.valueOf(eachValue));
			}
		}

		int output = 0;
		for (int score : stack) {
			output += score;
		}
		return output;

	}

}
