package nqttop150;

import java.util.Stack;

public class PolishNotation {
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			if (isOperator(token)) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(applyOp(token, a, b));
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}

	private static int applyOp(String op, int a, int b) {
		switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;

		default:
			throw new IllegalArgumentException("Unknown operator:" + op);

		}

	}

	private static boolean isOperator(String token) {
		// TODO Auto-generated method stub
		return "+-*/".contains(token);
	}

	public static void main(String[] args) {
		String[] tokens = { "1", "2", "+", "3", "*", "4", "-" };
		System.out.println(evalRPN(tokens));
	}
}
