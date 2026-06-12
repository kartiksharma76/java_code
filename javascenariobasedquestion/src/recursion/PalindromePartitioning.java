package recursion;

import java.util.*;

public class PalindromePartitioning {
	public List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), s, 0);
		return result;
	}

	private void backtrack(List<List<String>> res, List<String> cur, String s, int start) {
		if (start == s.length()) {
			res.add(new ArrayList<>(cur));
			return;
		}
		for (int end = start + 1; end <= s.length(); end++) {
			String sub = s.substring(start, end);
			if (isPalindrome(sub)) {
				cur.add(sub);
				backtrack(res, cur, s, end);
				cur.remove(cur.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String s) {
		int l = 0, r = s.length() - 1;
		while (l < r)
			if (s.charAt(l++) != s.charAt(r--))
				return false;
		return true;
	}

	public static void main(String[] args) {
		PalindromePartitioning sol = new PalindromePartitioning();
		System.out.println(sol.partition("aab")); // [[a,a,b],[aa,b]]
	}
}
