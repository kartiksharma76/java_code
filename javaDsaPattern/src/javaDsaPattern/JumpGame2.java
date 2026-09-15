package javaDsaPattern;

//Jump Game II

public class JumpGame2 {

	public static int jump(int[] nums) {

		int jumps = 0;
		int currentEnd = 0;
		int farthest = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			farthest = Math.max(farthest, i + nums[i]);

			if (i == currentEnd) {

				jumps++;
				currentEnd = farthest;
			}
		}

		return jumps;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 1, 4 };

		System.out.println("Minimum Jumps = " + jump(arr));
	}
}