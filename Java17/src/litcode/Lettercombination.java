package litcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lettercombination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter digits (2-9): ");
		String digits = sc.nextLine();

		Lettercombination sol = new Lettercombination();

		List<String> combinations = sol.lettercombinations(digits);
		System.out.println("Possible letter combinations:");
		for (String s : combinations) {
			System.out.println(s);
		}
		sc.close();
	}

	public List<String> lettercombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<>();
		}

		String[] mapping = { "", // 0
				"", // 1
				"abc", // 2
				"def", // 3
				"ghi", // 4
				"jkl", // 5
				"mno", // 6
				"pqrs", // 7
				"tuv", // 8
				"wxyz" // 9
		};

		List<String> result = new ArrayList<>();
		backtrack(digits, 0, new StringBuilder(), result, mapping);
		return result;
	}

	private void backtrack(String digits, int idx, StringBuilder current, List<String> result, String[] mapping) {
		if (idx == digits.length()) {
			result.add(current.toString());
			return;
		}

		String letters = mapping[digits.charAt(idx) - '0'];
		for (char ch : letters.toCharArray()) {
			current.append(ch);
			backtrack(digits, idx + 1, current, result, mapping);
			current.deleteCharAt(current.length() - 1);
		}
	}
}
