package DsaImp;

import java.util.Stack;

public class LongestValidSubstring {
	public static int longestValidParantheses(String s) {
		if (s == null || s.length() < 2) {
			return 0;
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(') {
				stack.push(i);

			} else {
				stack.pop();

				if (stack.isEmpty()) {
					stack.push(i);

				} else {
					maxLength = Math.max(maxLength, i - stack.peek());
				}
			}

		}
		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(longestValidParantheses("(()"));
		System.out.println(longestValidParantheses(")()())"));
		System.out.println(longestValidParantheses("()(())")); // 6
		System.out.println(longestValidParantheses("")); // 0
		System.out.println(longestValidParantheses("(((()")); // 2
		System.out.println(longestValidParantheses("()(()"));
	}
}
