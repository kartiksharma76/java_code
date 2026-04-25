package HackerRank;

import java.util.Scanner;

public class SmartNumber2 {
	public static String isSmartNumber(int num) {
		int root = (int) Math.sqrt(num);
		return (root * root == num) ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(isSmartNumber(num));
		sc.close();
	}
}
