package Week1.day5;

import org.junit.Test;

//https://leetcode.com/problems/count-of-matches-in-tournament/
public class LC1688_CountofMatchesinTournament {
    
	@Test
	public void example1()
	{
	int num = 7;
	countMatches(num);
	}

	private void countMatches(int num) {
		
		int evenmatches =0, oddmatches=0;
		while(num>1)
		{
			if(num%2==0)
				
			{
				evenmatches = evenmatches + num/2;
				num = num/2;
			}
			else
			{
				oddmatches = oddmatches + (num-1)/2;
				num = (num-1)/2+1;
			}
			
		}
		int output = evenmatches + oddmatches;
		System.out.println(output);
	}
}
