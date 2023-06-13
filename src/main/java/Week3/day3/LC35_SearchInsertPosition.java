package Week3.day3;

import org.junit.Test;

//https://leetcode.com/problems/search-insert-position/description/
public class LC35_SearchInsertPosition
 {

	@Test
	public void test1() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchAndInsert(nums, target));
	}

	@Test
	public void test2() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchAndInsert(nums, target));
	}

	@Test
	public void test3() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(searchAndInsert(nums, target));
	}

	private int searchAndInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;

	}

}



//class Solution {
//    public int searchInsert(int[] n, int k) {
//        /*
//        Algorithm: Divide N Conquer        
//        Big O Notation:
//				Time  - O(log n)
//				Space - O(1)
//		Pseducode:
//            initiate loop with var(i=0, j=array length -1, m=(i+j)/2)
//            run loop till i <= j
//                validate array val of index m > k && i < k then assign j = m
//                else validate array val of index m < k && j > k then assign i = m
//                validate array val of index 0 > k then return 0
//                else validate array val of index array length -1 then return length of array
//                else validate array val of index m == k return m
//                validate j-i == 1 return j
//                assign (i+j)/2 to m
//            return zero
//        */
//        for(int i= 0, j = n.length-1, m=(i+j)/2; i<=j;){
//            if(n[m]>k && n[i]<k) j = m;
//            else if(n[m]<k && n[j]>k) i = m;
//            if(n[0]>=k) return 0;
//            else if(n[n.length-1]<k) return n.length;
//            else if(n[n.length-1]==k) return n.length-1;
//            else if(n[m]==k) return m;
//            if((j-i)==1) return j;
//            m = (i+j)/2;
//        }
//        return 0;
//    }
//}
