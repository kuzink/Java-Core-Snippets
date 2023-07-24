package algorithms;

import java.util.*;

public class TwoSum {

	//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	//Example 1:
	//Input: nums = [2,7,11,15], target = 9
	//Output: [0,1]
	//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	//Example 2:
	//Input: nums = [3,2,4], target = 6
	//Output: [1,2]

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();

		int[] nums = {1, 2, 3};
		int target = 4;

		System.out.println(Arrays.toString(twoSum.resolve(nums, target)));
	}

	private int[] resolve(int[] nums, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>(); // number and it's corresponding index

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(target - nums[i], i);
			} else {
				result[0] = map.get(nums[i]);
				result[1] = i;
				break;
			}
		}

		System.out.println("map: " + map);

		return result;
	}

}
