package litcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBracket {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();

		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');

		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				if (stack.isEmpty() || stack.peek() != map.get(c)) {
					return false;
				}
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String input1 = "({[]})"; // Valid
		String input2 = "({[)]}"; // Invalid

		System.out.println("Is \"" + input1 + "\" valid? " + isValid(input1));
		System.out.println("Is \"" + input2 + "\" valid? " + isValid(input2));
	}
}
