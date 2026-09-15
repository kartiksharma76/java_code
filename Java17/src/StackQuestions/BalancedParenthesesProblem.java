package StackQuestions;

import java.util.Stack;

public class BalancedParenthesesProblem {
	public static void main(String[] args) {

		String str = "{[()]}";

		Stack<Character> st = new Stack<>();

		boolean balanced = true;

		for (char ch : str.toCharArray()) {

			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {

				if (st.isEmpty()) {
					balanced = false;
					break;
				}

				char top = st.pop();

				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {

					balanced = false;
					break;
				}
			}
		}

		if (!st.isEmpty()) {
			balanced = false;
		}

		System.out.println(balanced);
	}
}
