package Week1.day1;

import java.util.Scanner;

import org.junit.Test;

public class PrintPyramid {

	
	@Test
	public void example()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPyramid(n);
	}

	private void printPyramid(int n) {
		
		for(int i=1; i<=n; i++)
		{
			for(int s=1; s<=n-i; s++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
