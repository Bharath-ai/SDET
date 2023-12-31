package Week3.day3;

import java.util.Arrays;

import org.junit.Test;

//https://leetcode.com/problems/sort-the-people/
public class LC2418_SortthePeople {
	@Test
	public void test1() {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		System.out.println(Arrays.toString(sortByHeight(names, heights)));
	}

	public String[] sortByHeight(String[] names, int[] heights) {
		int n = names.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (heights[j] < heights[j + 1]) {

					int tempHeight = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = tempHeight;

					String tempName = names[j];
					names[j] = names[j + 1];
					names[j + 1] = tempName;
				}
			}
		}

		return names;
	}

}



//class Solution {
//    public String[] sortPeople(String[] s, int[] h) {
//        /*
//        Algorithm: Sliding Window
//        Big O Notation:
//				Time  - O(n)
//				Space - O(1)
//		Pseducode:
//            validate length of array equals one then return string array
//            else
//                Initiate an inc loop with variables(m=0, i=0 & j=1)
//                then run the loop till i<array length minus one with j++
//                    validate height array i val > j val then assign m = i
//                    else assign m = j
//                    validate m is not equal to i
//                        then swap height & string array val i,m = m,i
//                    validate j equals array length minus one
//                        then reset m to zero, increment i by one and assign to j
//            return string array
//        */
//        if(s.length == 1) return s;
//        else{
//            for(int m=0, i=0, j=1; i<s.length-1; j++) {
//                if(h[i]>h[j]) m = i;
//                else m = j;
//                if(m!=i){
//                    String t = s[i];
//                    s[i] = s[m];
//                    s[m] = t;
//                    int u = h[i];
//                    h[i] = h[m];
//                    h[m] = u;
//                } 
//                if(j==s.length-1) {                                       
//                    i++; j=i; m = 0;
//                    }
//                }
//            }
//      return s;  
//    }
//}
