package dynamicprogrammingandgreedy;

import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int i = 1; i <= amount; i++)
			for (int c : coins)
				if (c <= i)
					dp[i] = Math.min(dp[i], dp[i - c] + 1);
		return dp[amount] > amount ? -1 : dp[amount];
	}

	public static void main(String[] args) {
		CoinChange sol = new CoinChange();
		System.out.println(sol.coinChange(new int[] { 1, 5, 11 }, 15)); // 3 (5+5+5 or 11+1+1+1+1=5)
		System.out.println(sol.coinChange(new int[] { 2 }, 3)); // -1
	}
}
