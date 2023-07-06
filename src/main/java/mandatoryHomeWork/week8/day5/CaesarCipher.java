package week8.day5;

import org.junit.Test;

public class CaesarCipher {
	@Test
	public void test1() {
		String s = "middle-Outz";
		int shift =2;
		System.out.println(caesarCipher(s, shift));
	}
	
	    public static String caesarCipher(String s, int k) {
	        StringBuilder encrypted = new StringBuilder();

	        for (char c : s.toCharArray()) {
	            if (Character.isLetter(c)) {
	            	char base;
	            	if(Character.isUpperCase(c) ) {
	            		base = 'A';
	            	}
	            	else {
	            		base = 'a';
	            	}
	          
	                int originalAlphabetPosition = c - base;
	                int newAlphabetPosition = (originalAlphabetPosition + k) % 26;
	                char newCharacter = (char) (base + newAlphabetPosition);
	                encrypted.append(newCharacter);
	            } else {
	                encrypted.append(c);
	            }
	        }

	        return encrypted.toString();
	    }


	    
	}


