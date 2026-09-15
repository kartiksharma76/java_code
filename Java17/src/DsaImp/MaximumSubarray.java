package DsaImp;
/**
* There is an array whose largest sum is a contiguous subarray
* Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
* Output: 6 -> from [4, -1, 2, 1]
* There is a youtube creator who has lost money every day
* Which continuous day has the highest income
* Days :[-2, 1, -3, 4, -1, 2, 1, -5, 4]
* Best: Day 4 to Day 7 ->[4, -1, 2, 1] -> Total = 6
* localMax = max(current,current + localMax)
* globalMax = max(globalMax,localMax)
*/

public class MaximumSubarray {
public static int maxSubArray(int[]nums) {
	int globalMax = nums[0];
	int localMax = nums[0];
	
	for(int i=1;i<nums.length;i++) {
		localMax = Math.max(nums[i], localMax + nums[i]);
		globalMax = Math.max(globalMax, localMax);
	}
	return globalMax;
	
}
public static void main(String[] args) {
	int[]arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	System.out.println("Mx Subarray Sum :" + maxSubArray(arr));
}
}
