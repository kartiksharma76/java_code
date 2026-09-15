package Nptel;

import java.util.Scanner;

public class ArmstrongNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		int actualnumber = n;
		int number = 0;
		while (n != 0) {
			int digit = n % 10;
			number += (digit * digit * digit);
			n = n / 10;
		}
		if (number == actualnumber) {
			result = 1;
		}
		System.out.println(result);
	}
}
