package Practicesheet;

public class Fibonacci1 {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		int n = 10;

		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
