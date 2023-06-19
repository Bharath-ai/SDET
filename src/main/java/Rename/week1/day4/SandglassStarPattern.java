package Week1.day4;

import org.junit.Test;

public class SandglassStarPattern {

	/*
	 * 1. Sandglass Star Pattern Enter the number of rows: 5
	 * 
	 * * * * * * * * * * *
	 * 
	 * 
	 * * * * * * * * * * *
	 * 
	 */

	@Test
	public void example1() {
		int number = 5;
		printPattern(number);
	}

	private void printPattern(int number) {
		int i, j, k;
		for (i = 0; i <= number - 1; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= number - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (i = number - 1; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= number - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
