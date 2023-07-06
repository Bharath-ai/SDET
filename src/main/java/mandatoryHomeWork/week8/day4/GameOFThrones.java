package week8.day4;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GameOFThrones {
		@Test
		public void test1() {
			String s = "cdcdcdcdeeeef";
			System.out.println(gameOfThrones(s));
			
		}
		@Test
		public void test2() {
			String s = "cdefghmnopqrstuvw";
			System.out.println(gameOfThrones(s));
		}
		
		@Test
		public void test3() {
			String s = "aaabbbb";
			System.out.println(gameOfThrones(s));
			
		}
		

	    public static String gameOfThrones(String s) {
	        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

	       
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        int oddCount = 0;
	        for (int count : charCount.values()) {
	            if (count % 2 != 0) {
	                oddCount++;
	            } 
	            if (oddCount > 1) {
	                return "NO";
	            }
	        }

	        return "YES";
	    }

}