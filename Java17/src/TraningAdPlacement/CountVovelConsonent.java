package TraningAdPlacement;

import java.util.Scanner;

public class CountVovelConsonent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		sc.close();

		int vowels = 0, consonent = 0;

		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;

				} else {
					consonent++;
				}

			}
			System.out.println("vowels = " + vowels + " consonent = " + consonent);
		}
	}
}
