package week5.day2;

import org.junit.Test;

public class IsSubsequencetest {
	
	@Test
	public void test1() {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
	
	public boolean isSubsequence(String s, String t) {
		
	if(t.length()<s.length() || s ==null||t == null) {
		return false;
	}
	if(s.length()==0) {
		return true;
	}
	    int left=0, right=0;
     
        while(right<t.length()){
            if(s.charAt(left)==t.charAt(right)){
                left++;
            }
            right++;
        }
    return left==s.length();
        
    }
}
