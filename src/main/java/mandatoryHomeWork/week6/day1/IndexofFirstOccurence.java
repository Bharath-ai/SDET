package week6.day1;

import org.junit.Test;

public class IndexofFirstOccurence {
	@Test
	public void test1() {
		String haystack = "leetcode"; String needle = "leeto";
		System.out.println(strStr(haystack, needle));
	}
	@Test
	public void test2() {
		String haystack = "sadbutsad"; String needle = "sad";
		System.out.println(strStr(haystack, needle));
	}
	@Test
	public void test3() {
		String haystack = "sxdsadbut"; String needle = "sad";
		System.out.println(strStr(haystack, needle));
	}
	
	
	public int strStr(String haystack, String needle) {
		int left=0, right=0;
		
		while(left<haystack.length() && right<needle.length()) {
			if(haystack.charAt(left) == needle.charAt(right)) {
				left++;
				right++;
			}
			else {
				left=left-right+1;
				right=0;
			}
		}
		
		if(right==needle.length()) {
		return	left-right;
		}
		else {
			return -1;
		}
	}


}
