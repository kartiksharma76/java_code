package javapractice2026;

import java.util.Scanner;

public class Square1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of Square:");
		int s = sc.nextInt();

		int perimeter = 4 * s;
		int area = s * s;

		System.out.println("Perimeter of Square = " + perimeter);
		System.out.println("Area of square = " + area);
	}
}
