package recursion;

import java.util.*;

public class DiffWaysAddParentheses {
	public List<Integer> diffWaysToCompute(String expr) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			if (c == '+' || c == '-' || c == '*') {
				List<Integer> left = diffWaysToCompute(expr.substring(0, i));
				List<Integer> right = diffWaysToCompute(expr.substring(i + 1));
				for (int l : left)
					for (int r : right) {
						if (c == '+')
							result.add(l + r);
						else if (c == '-')
							result.add(l - r);
						else
							result.add(l * r);
					}
			}
		}
		if (result.isEmpty())
			result.add(Integer.parseInt(expr));
		return result;
	}

	public static void main(String[] args) {
		DiffWaysAddParentheses sol = new DiffWaysAddParentheses();
		System.out.println(sol.diffWaysToCompute("2-1-1")); // [0, 2]
	}
}