package week5.day1;

import org.junit.Test;
import java.util.*;

/*
 * convert input array to list
 * then check studentlist[i] equals sandwichlist[i]
 * if equals, then remove ith index from both the list
 * else, move studentlist's ith index to last
 * loop until studentlist !=0
 */


public class LunchStudentProblem {
       @Test
       public void example1() {
    	   int[] student= {1,1,0,0};
    	   int[] sandwich= {0,1,0,1};
    	   System.out.println("Number of students are not able to eat = "+lunchproblem(student, sandwich));
       }
       
       @Test
       public void example2() {
    	   int[] student= {1,1,1,0,0,1};
    	   int[] sandwich= {1,0,0,0,1,1};
    	   System.out.println("Number of students are not able to eat = "+lunchproblem(student, sandwich));
       }

	private int lunchproblem(int[] student, int[] sandwich) {
		List<Integer> ls1=new ArrayList<Integer>();
		List<Integer> ls2=new ArrayList<Integer>();
		int count=0;
		int i=0;
		for(int each:student) {
			ls1.add(each);
		}
		//System.out.println(ls1);
		for(int each:sandwich) {
			ls2.add(each);
		}
		//System.out.println(ls2);
		while(ls1.size()>0)	{
			//System.out.println("initial ls1 size = "+ls1.size());
			if(ls1.get(i).equals(ls2.get(i))) {
				ls1.remove(i);
				ls2.remove(i);
				//System.out.println("equal - ls1"+ls1);
				//System.out.println("equal - ls2"+ls2);
				count=0;
			}
			else if(ls1.get(i)!=ls2.get(i)) {
				int s1=ls1.get(i);
				//System.out.println("s1 - "+s1);
				ls1.remove(i);
				ls1.add(s1);
				//System.out.println("notequal - ls1"+ls1);
				//System.out.println("notequal - ls2"+ls2);
				count++;
			}
			if(count==ls1.size()) {
				break;
			}
			//System.out.println("ls1 size = "+ls1.size());
		}
		return ls1.size();
	}
}
