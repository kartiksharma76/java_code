package HackerRank;

/**
 * {}()
({()})
{}(
[]
 */
import java.util.Scanner;
import java.util.Stack;

public class Solution7 {
	public static void main(String[] argh) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(isBalanced(line));
		}

		scanner.close();
	}

	private static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (!matches(top, c)) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	private static boolean matches(char open, char close) {
		return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
	}
}
