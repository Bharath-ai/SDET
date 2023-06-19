package week6.day2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MinimumCommonValuerepeat {

	@Test
	public void test1() {
		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 2, 4 };
		System.out.println(getCommon(nums1, nums2));
	}

	@Test
	public void test2() {
		int nums1[] = { 1, 2, 3, 6 };
		int nums2[] = { 2, 3, 4, 5 };
		System.out.println(getCommon(nums1, nums2));
	}

	public int getCommon(int[] nums1, int[] nums2) {

		int left = 0, right = 0;
		int min = Integer.MAX_VALUE;
		Set<Integer> hs = new HashSet<Integer>();

		while (left < nums1.length && right < nums2.length) {
			if (nums1[left] < nums2[right]) {
				left++;
			} else if (nums1[left] > nums2[right]) {
				right++;
			} else {
				hs.add(nums1[left]);
				left++;
				right++;
			}
		}
		for (int element : hs) {
			if (min > element) {
				min = element;
			}
		}
		return min;

	}

}
