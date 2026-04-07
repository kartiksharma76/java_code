package javainterview;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a leap year:");
		int year = sc.nextInt();

//leap year logic
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + ":LeapYear");
		} else {
			System.out.println(year + ":Not a leapYear");
		}
		sc.close();
	}
}
