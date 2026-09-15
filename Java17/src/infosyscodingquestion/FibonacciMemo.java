package infosyscodingquestion;

import java.util.Arrays;

public class FibonacciMemo {

	// Memoization function
	public static int fib(int n, int dp[]) {

		// Base Case
		if (n <= 1)
			return n;

		// If already calculated, return stored value
		if (dp[n] != -1)
			return dp[n];

		// Store computed value
		dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

		return dp[n];
	}

	public static void main(String[] args) {

		int n = 10;

		// Create DP array
		int[] dp = new int[n + 1];

		// Initialize with -1
		Arrays.fill(dp, -1);

		System.out.println("Fibonacci of " + n + " is: " + fib(n, dp));
	}
}