package litcode;

public class ClimbingStairs {
	public int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}
		int a = 1;
		int b = 2;
		for (int i = 3; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;

	}

	public static void main(String[] args) {
		ClimbingStairs obj = new ClimbingStairs();
		int n = 5; // number of stairs
		int result = obj.climbStairs(n);

		System.out.println(result);

	}
}
