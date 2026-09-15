package litcode;

import java.util.HashMap;
import java.util.Arrays;

/**
 * nums[i] + nums[j] = target 
 * nums = [2,7,11,15] 
 * target = 9 Output: [0,1]
 * Because 2 + 7 = 9
 * nums = [2,7,11,15] 
 * target = 9
 *  
 * i = 0   
 * nums[i] = 2
 * complement = target - nums[i]
 * complement = 9 - 2 = 7
 *  
 * map = {2 : 0}
 * i = 1
 * nums[i] = 7
 * complement = 9 - 7 = 2
 * [ map.get(2), 1 ] = [0,1]
 *  
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(nums[i], i);
		}

		return new int[] {};
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(nums, target);

		System.out.println(Arrays.toString(result));
	}
}