package string;

import java.util.*;

public class MinRemoveToMakeValid {
	public String minRemoveToMakeValid(String s) {
		Set<Integer> toRemove = new HashSet<>();
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				stack.push(i);
			else if (c == ')') {
				if (stack.isEmpty())
					toRemove.add(i);
				else
					stack.pop();
			}
		}
		while (!stack.isEmpty())
			toRemove.add(stack.pop());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
			if (!toRemove.contains(i))
				sb.append(s.charAt(i));
		return sb.toString();
	}

	public static void main(String[] args) {
		MinRemoveToMakeValid sol = new MinRemoveToMakeValid();
		System.out.println(sol.minRemoveToMakeValid("lee(t(c)o)de)")); // lee(t(c)o)de
	}
}