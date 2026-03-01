package infosyscodingquestion;

public class FibonacciOptimized {
	public static void main(String[] args) {
		int n = 10;
		if (n == 0) {
			System.out.println(0);
			return;
		}
		int prev1 = 1;
		int prev2 = 0;
		int current = 0;

		for (int i = 2; i <= n; i++) {
			current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
		}
		System.out.println("Fibonacci of " + n + "is:" + prev1);
	}
}
