package NPTL25;

import java.util.Scanner;

public class W04_P5 {
	static class Calculator {
		public int add(int a, int b) {
			return a + b;
		}

		private int add(int a, int b, int c) {
			return a + b + c;
		}

		public void printThreeSum(int x, int y, int z) {
			int sum = add(x, y, z);
			System.out.println("Sum of three number :" + sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		Calculator cal = new Calculator();

		int sumTwo = cal.add(a, b);
		System.out.println("sum of two number: " + sumTwo);
		cal.printThreeSum(x, y, z);

		sc.close();
	}
}
