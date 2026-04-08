package javainterview;

import java.util.Scanner;

public class OctalToHex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String octal = sc.nextLine();

		int decimal = Integer.parseInt(octal, 8);
		String hex = Integer.toHexString(decimal);

		System.out.println(hex.toUpperCase());
	}
}
