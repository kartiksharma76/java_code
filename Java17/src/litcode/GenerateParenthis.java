package litcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthis {
	List<String> generateParanthesis(int n) {
		List<String> result = new ArrayList<>();
		backtrack(result, new StringBuilder(), 0, 0, n);
		return result;

	}

	private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
		// TODO Auto-generated method stub
		if (current.length() == max * 2) {
			result.add(current.toString());
			return;
		}
		if (open < max) {
			current.append('(');
			backtrack(result, current, open + 1, close, max);
			current.deleteCharAt(current.length() - 1);
		}
		if (close < open) {
			current.append(')');
			backtrack(result, current, open, close + 1, max);
			current.deleteCharAt(current.length() - 1);
		}

	}

	public static void main(String[] args) {
		GenerateParenthis p = new GenerateParenthis();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n (number of pairs): ");
		int n = sc.nextInt();
		List<String> comb = p.generateParanthesis(n);
		System.out.println("Well-formed parentheses combinations:");
		for (String s : comb) {
			System.out.println(s);
		}
	}
}
