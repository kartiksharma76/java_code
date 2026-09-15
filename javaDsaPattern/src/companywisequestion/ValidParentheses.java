package companywisequestion;

import java.util.Stack;

//Question:
//Code editor me brackets balanced hain ya nahi check karna hai.
public class ValidParentheses {
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;

				char top = stack.pop();

				if (ch == ')' && top != '(')
					return false;

				if (ch == '}' && top != '{')
					return false;

				if (ch == ']' && top != '[')
					return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "{[()]}";

		System.out.println(isValid(str));
	}
}
