package week5.day1;

import org.junit.Test;

public class LongPressedName {
	
	@Test
	public void test1() {
		String name = "alex";
		String typed = "aaleex";
		System.out.println(isLongPressedName(name, typed));
		
	}
	@Test
	public void test2() {
		String name = "saeed";
		String typed = "ssaaedd";
		System.out.println(isLongPressedName(name, typed));
		
	}

	
    public boolean isLongPressedName(String name, String typed) {
         int left=0, right=0;
         while(right<typed.length()) {
        	 if(left<name.length() && name.charAt(left)==typed.charAt(right)) {
        		 right++;
        		 left++;
        	 }
        		 else if(right>0 && typed.charAt(right)==typed.charAt(right-1)){
        			 right++;	 
        		 }
        		 else {
        			return false;
        		 }
    }
         return right==typed.length();
}
}
