package algorithms;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

	//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
	// that each unique element appears only once. The relative order of the elements should be kept the same.
	// Then return the number of unique elements in nums.

	//Example 1:
	//Input: nums = [1,1,2]
	//Output: 2, nums = [1,2,_]

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray task = new RemoveDuplicatesFromSortedArray();

		int[] arr = {1, 1, 2};

		System.out.println(task.resolve(arr));
	}

	private int resolve(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}

		System.out.println("nums: " + Arrays.toString(nums));

		return j;
	}
}
