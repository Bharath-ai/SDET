package Week1.day3;

import org.junit.Test;

public class LC_231_PowerofTwo {
	
	//https://leetcode.com/problems/power-of-two/
	@Test
	public void example()
	{
		int no = 25;
		isPowerOfTwo(no);
	}

	private void isPowerOfTwo(int no) {
		
		if((no==1 || no%2==0) && (no!=0 && no>0))
			System.out.println("The Given no is power of 2");
		else
			System.out.println("The Given no is not power of 2");
		
	}

}
