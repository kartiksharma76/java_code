package TraningAdPlacement;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Enter terms:");
		int n = sc.nextInt();
		System.out.println(a + " " + b + " ");
		for (int i = 3; i <= n; i++) {
			c = a + b;
			System.out.println(c + " ");
			a = b;
			b = c;
		}

	}
}
