package Nptel;

import java.util.Scanner;

public class GivenCirculevalueRadious {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double radious = scanner.nextDouble();
		double perimeter;
		double area;

		perimeter = 2 * Math.PI * radious;
		area = Math.PI * radious * radious;

		System.out.println(perimeter);
		System.out.println(area);
	}
}
