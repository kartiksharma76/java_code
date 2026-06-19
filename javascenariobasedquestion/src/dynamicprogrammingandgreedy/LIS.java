package dynamicprogrammingandgreedy;

public class LIS {
	public int lengthOfLIS(int[] nums) {
		int n = nums.length, maxLen = 1;
		int[] dp = new int[n];
		java.util.Arrays.fill(dp, 1);
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++)
				if (nums[j] < nums[i])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			maxLen = Math.max(maxLen, dp[i]);
		}
		return maxLen;
	}

	public static void main(String[] args) {
		LIS sol = new LIS();
		System.out.println(sol.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 })); // 4
	}

}
