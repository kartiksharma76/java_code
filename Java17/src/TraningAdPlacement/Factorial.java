package TraningAdPlacement;

import java.util.Scanner;

public class Factorial {
	static long factorial(int n) {
		long res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(factorial(n));

		}
		sc.close();
	}
}
