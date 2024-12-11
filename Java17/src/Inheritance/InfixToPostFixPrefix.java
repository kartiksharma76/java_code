package Inheritance;

import java.util.Stack;

public class InfixToPostFixPrefix {
	public static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public static String infixToPostfix(String exp) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < exp.length(); ++i) {
			char c = exp.charAt(i);
			if (Character.isLetterOrDigit(c))
				result.append(c);
			else if (c == '(')
				stack.push(c);
			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					result.append(stack.pop());
				if (!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else
					stack.pop();
			} else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
					result.append(stack.pop());
				stack.push(c);
			}
		}

		while (!stack.isEmpty())
			result.append(stack.pop());

		return result.toString();
	}

	public static String infixToPrefix(String exp) {
		StringBuilder result = new StringBuilder();
		StringBuilder input = new StringBuilder(exp);
		input.reverse();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(')
				c = ')';
			else if (c == ')')
				c = '(';
			input.setCharAt(i, c);
		}

		String postfix = infixToPostfix(input.toString());
		input.reverse();

		for (int i = postfix.length() - 1; i >= 0; i--) {
			result.append(postfix.charAt(i));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String[] expressions = { "A + ( (B – C) * (D – E) + F) / G ) $ (H – J)", "(A + B) * (C – D) $ E * F",
				"(A + B) * (C ^ (D – E) + F) – G", "A + B * C", "A + B * C ^ D – E", "A + [(B +C) + (D + E) * F] / G",
				"(A + B) * C / D + E ^ F /G", "(A + B) * C / D", "((A + B – C / D) / E)", "A / (B – C / D ^ E) + F",
				"A – B / (C * D ^ E)" };

		for (String exp : expressions) {
			System.out.println("Infix Expression: " + exp);
			System.out.println("Postfix Expression: " + infixToPostfix(exp));
			System.out.println("Prefix Expression: " + infixToPrefix(exp));
			System.out.println();
		}
	}
}
