package HackerRank;

import java.util.Stack;

public class Solution7WithoutScannerClass {
	public static void main(String[] args) {
		String[] inputs = { "({[]})", "({[)]}", "((()))", "[{()}](){}", "({[})" };

		for (String line : inputs) {
			System.out.println(isBalanced(line));
		}
	}

	private static boolean isBalanced(String s) {
		// TODO Auto-generated method stub
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
