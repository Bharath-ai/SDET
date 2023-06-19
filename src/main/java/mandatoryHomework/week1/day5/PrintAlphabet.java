package Week1.day5;

import org.junit.Test;

public class PrintAlphabet {

	/*
	 * 1. Diamond Pattern in Java Enter a Character between A to Z : F
	 *
	 A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
	 * 
	 */

	/*
	 * Pseudocode:
	 * 
	 * First for finding the length of the Pattern, for that declaring the char variable
	 * with value as 'A'.
	 * Declare one int variable and initialize it as zero. Traverse through the
	 * while loop until the given character and in each increment, increase the int
	 * variable value and char value.
	 * Now, we have got the length of the pattern.
	 * Use three for loops:
	 * a). One for outer iteration starts with zero and iterate till length
	 * b). Two Inner for loop for printing the space and Alphabets
	 * 
	 */
	
	@Test
	public void positive()
	{
		char input = 'D';
		printPattern(input);
	}
	
	@Test
	public void negative()
	{
		char input = ' ';
		printPattern(input);
	}

	private void printPattern(char input) {
		
		int length = 0;
		char chars = 'A';
		while(chars != 'D') {
			length++;
			chars++;
		}
		
		for(int i=0; i<length;i++)
		{
			for (int j = length - 1 ; j>=i; j-- ) 
			{
				System.out.print(" ");	
			}
			for (int k = 0; k <= i; k++ ) 
			{
				System.out.print((char)(chars) + " ");
			}
			
			System.out.println("");
		}
	}
}
