package javainterview;

import java.util.Scanner;

public class DecToHex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(Integer.toHexString(num).toUpperCase());
	}
}
