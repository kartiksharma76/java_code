package array2026;

import java.util.Stack;

public class CheckBalanceParanthesis {
	static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(')
				stack.push(ch);

			else if (ch == ')') {

				if (stack.isEmpty())
					return false;

				stack.pop();
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "(())";
		System.out.println(isBalanced(s));
	}
}
