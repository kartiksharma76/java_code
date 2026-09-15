package litcode;
/**
 * [2,7,9,3,1]
 * 
 * House 
 * max = 2
 * House1
 * max = max(2,7) = 7
 * 
 * House2
 * max(7 , 2 + 9) = max(7,11) = 11
 * 
 * House 3
 * max(11 , 7 + 3) = max(11,10) = 11
 * 
 * House 4
 * max(11 , 11 + 1) = max(11,12) = 12
 * 
 * Final Answer = 12
 * RobHouse = 2 + 9 +1
 *
 *  
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];

		int prev2 = nums[0];
		int prev1 = Math.max(nums[0], nums[1]);

		for (int i = 2; i < nums.length; i++) {
			// Recurrence relation: f(i) = max(f(i-1), f(i-2) + current)
			int curr = Math.max(prev1, prev2 + nums[i]);

			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;
	}

	public static void main(String[] args) {
		HouseRobber rr = new HouseRobber();

//Test Case 1: [1, 2, 3, 1] -> Output: 4
		int[] case1 = { 1, 2, 3, 1 };
		System.out.println("Test Case 1: " + rr.rob(case1));

//Test Case 2: [2, 7, 9, 3, 1] -> Output: 12
		int[] case2 = { 2, 7, 9, 3, 1 };
		System.out.println("Test Case 2: " + rr.rob(case2));
	}
}
