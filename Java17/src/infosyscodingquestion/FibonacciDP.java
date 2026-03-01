package infosyscodingquestion;

public class FibonacciDP {
	public static void main(String[] args) {
		// define n
		int n = 10;
		// create DP array of size n+1
		int dp[] = new int[n + 1];
		// Base cases
		dp[0] = 0;
		dp[1] = 1;
		// fill DP table from 2 to n
		for (int i = 2; i <= n; i++) {
			// Apply recurrence relation
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		// print nth fibonacci number
        System.out.println("Fibonacci of " + n + " is: " + dp[n]);
	}
}
