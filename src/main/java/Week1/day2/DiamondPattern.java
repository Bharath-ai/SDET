package Week1.day2;

import org.junit.Test;

public class DiamondPattern {
@Test
public void example1()
{
	int n=3;
	diamondPattern(n);
}

private void diamondPattern(int n) {
	int s =1; 
	int j=1; int i=1;
	for (j = 1; j <= n; j++) 
    {
        for (i = 1; i <= s; i++) 
        {
            System.out.print(" ");
        }
        s--;
        for (i = 1; i <= 2 * j - 1; i++) 
        {
            System.out.print("*");                
        }
        System.out.println("");
    }
    s = 1;
    for (j = 1; j <= n - 1; j++) 
    {
        for (i = 1; i <= s; i++) 
        {
            System.out.print(" ");
        }
        s++;
        for (i = 1; i <= 2 * (n - j) - 1; i++) 
        {
            System.out.print("*");
        }
        System.out.println("");
    }
	
}

}
