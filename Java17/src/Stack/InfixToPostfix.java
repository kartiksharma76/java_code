package Stack;

import java.util.Stack;

public class InfixToPostfix {

	public static String infixToPostfix(String infix) {
		Stack<Character> operatorStack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		for (char c : infix.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				postfix.append(c);
			} else if (c == '(') {
				operatorStack.push(c);
			} else if (c == ')') {
				while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
					postfix.append(operatorStack.pop());
				}
				operatorStack.pop(); // Pop the '('
			} else {
				while (!operatorStack.isEmpty() && precedence(c) <= precedence(operatorStack.peek())) {
					postfix.append(operatorStack.pop());
				}
				operatorStack.push(c);
			}
		}

		while (!operatorStack.isEmpty()) {
			postfix.append(operatorStack.pop());
		}

		return postfix.toString();
	}

	private static int precedence(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		String infix = "A+B*C-D/E";
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix expression: " + postfix);
	}
}
