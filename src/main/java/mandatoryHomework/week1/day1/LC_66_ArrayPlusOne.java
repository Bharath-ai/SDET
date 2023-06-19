package Week1.day1;

import org.junit.Test;

public class LC_66_ArrayPlusOne {
//	https://leetcode.com/problems/plus-one/
	
//	You are given a large integer represented as an integer array digits, 
//	where each digits[i] is the ith digit of the integer. 
//	The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//	Increment the large integer by one and return the resulting array of digits.
//	
//			Example 1:
//
//				Input: digits = [1,2,3] ---> Interger 123+1=124 [1,2,4]
//				Output: [1,2,4]
//				Explanation: The array represents the integer 123.
//				Incrementing by one gives 123 + 1 = 124.
//				Thus, the result should be [1,2,4].
	
	
	@Test
	public void example() {
		int[] arr1 = {1,2,3,4,5,6};
		finalResult(arr1);

	}

	private void finalResult(int[] arr1) {

		// condition 1
		if(arr1.length >= 1 && arr1.length <= 100)
			System.out.println("Condition 1 Passed");
		else
			System.err.println("Condition 1 Mismatch");

		// condition 2
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] <= 9 && arr1[i] >= 0) 
				continue;
			else 
				System.err.println("Condition Mismatch");
		}

		//Logic for covert an array to Int without inbuilt method 
		int digitValue = 0;
		for (int i = 0; i <= arr1.length - 1; i++) {
			digitValue = digitValue * 10 + arr1[i];
		}
		System.out.println(digitValue);
		//adding 1 with interger value
		digitValue = digitValue + 1;
		System.out.println(digitValue);
		
		int[] arr2 = new int[arr1.length];
		int temp = 0;
		int j=arr1.length;
		while(digitValue>0)
		{
			    temp = digitValue%10;
				arr2[j-1] = temp;
				digitValue = digitValue/10;
				--j;
			
		}
		
		for(int k=0; k<arr2.length;k++)
		{
			System.out.print(arr2[k]+",");
		}
		
//		int i=arr1.length-1;
//		int[] arr2 = new int[arr1.length];
//		while(digitValue!=0)
//		{
//		
//		int temp = digitValue%10;
//		arr2[i] = temp;
//		
//		digitValue = digitValue/10;
//		i--;
//		}
//		
//		System.out.println(arr2);
		
		
		
		
		
	}
}