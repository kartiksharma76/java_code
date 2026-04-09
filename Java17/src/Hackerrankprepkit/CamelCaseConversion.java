package Hackerrankprepkit;

import java.util.Scanner;

/**
 * Problem: Camel Case Conversion
 *
 * Camel Case is a naming style used in programming languages like Java.
 *
 * Rules: - Variables & Methods → start with lowercase (e.g., startThread) -
 * Classes → start with uppercase (e.g., BlueCar)
 *
 * Task: Perform either split or combine operation on given input.
 *
 * Input Format: Each line contains: Operation;Type;String
 *
 * Operation: S → Split C → Combine
 *
 * Type: M → Method C → Class V → Variable
 *
 * Split Operation (S): - Convert camelCase string into space-separated
 * lowercase words - If type is Method, remove "()" before processing
 *
 * Combine Operation (C): - Convert space-separated words into camelCase - Class
 * → First letter uppercase (PascalCase) - Variable → First word lowercase -
 * Method → Same as variable + append "()"
 *
 * Example: Input: S;M;plasticCup() Output: plastic cup
 *
 * Input: C;M;white sheet of paper Output: whiteSheetOfPaper()
 *
 * Approach: - Parse input using split(";") - Handle split and combine cases
 * separately - Use Character methods for case conversion - Use StringBuilder
 * for efficient string manipulation
 *
 * Time Complexity: O(n) Space Complexity: O(n)
 */

public class CamelCaseConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();

			String[] parts = line.split(";");
			String operation = parts[0];
			String type = parts[1];
			String text = parts[2];

			if (operation.equals("S")) {
				if (type.equals("M")) {
					text = text.substring(0, text.length() - 2);

				}

				StringBuilder result = new StringBuilder();
				for (int i = 0; i < text.length(); i++) {
					char ch = text.charAt(i);

					if (Character.isUpperCase(ch)) {
						result.append(" ");
						result.append(Character.toLowerCase(ch));
					} else {
						result.append(ch);
					}
				}
				System.out.println(result.toString().trim());
			} else {
				String[] words = text.split(" ");
				StringBuilder result = new StringBuilder();
				for (int i = 0; i < words.length; i++) {
					String word = words[i];

					if (i == 0) {
						if (type.equals("C")) {
							result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));

						} else {
							result.append(word);
						}
					} else {
						result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
					}

				}
				if (type.equals("M")) {
					result.append("()");
				}
				System.out.println(result.toString());
			}
		}
		sc.close();
	}
}
