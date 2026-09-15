package javainterview;

import java.util.Scanner;

public class AreaOfRombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Diagonals input
		System.out.print("Enter first diagonal (d1): ");
		double d1 = sc.nextDouble();

		System.out.print("Enter second diagonal (d2): ");
		double d2 = sc.nextDouble();

		// Area calculation
		double area = (d1 * d2) / 2;

		// Output
		System.out.println("Area of Rhombus = " + area);

		sc.close();
	}
}
