package litcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class SumOfTwoNumber {
	 public static int[] twoSum(int[] nums, int target) {
	        Map<Integer,Integer> numMap=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            int complement=target-nums[i];
	            if(numMap.containsKey(complement)){
	                return new int[]{ (numMap.get(complement)),i};
	            }
	             numMap.put(nums[i], i);
	        }
	        return new int[]{};
	    }
	 public static void main(String[] args) {
		 int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = null;
			try {
				result = twoSum(nums, target);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	}
}
