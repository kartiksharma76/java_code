package javaDsaPattern;

public class ClimbingStairs {
	public static int climb(int n) {
		if (n <= 2)
			return n;
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
		System.out.println(climb(5));
	}

}
