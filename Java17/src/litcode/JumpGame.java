package litcode;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int reach = 0;
		for (int i = 0; i < nums.length; i++) {
			// If the current index is beyond our max reach, we're stuck
			if (i > reach) {
				return false;
			}

			reach = Math.max(reach, i + nums[i]);

			// Optimization: If we can already reach the end, stop early
			if (reach >= nums.length - 1) {
				return true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		JumpGame jg = new JumpGame();

		int[] case1 = { 2, 3, 1, 1, 4 }; // Should be true
		int[] case2 = { 3, 2, 1, 0, 4 }; // Should be false

		System.out.println("Case 1 (Success): " + jg.canJump(case1));
		System.out.println("Case 2 (Failure): " + jg.canJump(case2));
	}
}