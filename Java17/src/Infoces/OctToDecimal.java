package Infoces;

import java.util.Scanner;

public class OctToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a octal Number :");
		int octal = sc.nextInt();
		int decimal = 0;
		int n = 0;

		while (octal > 0) {
			int temp = octal % 10;
			decimal += temp * Math.pow(8, n);
			octal = octal / 10;
			n++;

		}
		System.out.println("Decimal number :" + decimal);
		sc.close();
	}
}
