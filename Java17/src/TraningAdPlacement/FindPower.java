package TraningAdPlacement;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user input:");
		int base = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int result = (int) Math.pow(base, i);
			System.out.println(base + "^" + i + "==" + (result));

		}
		sc.close();
	}

}
