package week8.day4;

import org.junit.Test;

public class MarsExploration {
	
	@Test
	public void test1() {
		String s = "SOSSPSSQSSOR";
		System.out.println(marsExploration(s));
	}
	    public static int marsExploration(String s) {
	        int count = 0;

	        for (int i = 2; i < s.length(); i += 3) {
	            if (s.charAt(i) != 'S') {
	                count++;
	            }
	        
	        
	            else if (s.charAt(i-1)!= 'O') {
	            count++;
	        }
	        
	            else if(s.charAt(i- 2) != 'S') {
	            count++;
	        }
	           
	}
	        return count;
	    }
}