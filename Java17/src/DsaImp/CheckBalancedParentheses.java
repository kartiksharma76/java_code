package DsaImp;

import java.util.Stack;

public class CheckBalancedParentheses {
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		System.out.println(isBalanced("()"));
		System.out.println(isBalanced("()[]{}"));
		System.out.println(isBalanced("([{}])"));
		System.out.println(isBalanced("{[()]}"));
		System.out.println(isBalanced("(]"));
		System.out.println(isBalanced("([)]"));
		System.out.println(isBalanced("((("));
		System.out.println(isBalanced(")))"));
	}
}
