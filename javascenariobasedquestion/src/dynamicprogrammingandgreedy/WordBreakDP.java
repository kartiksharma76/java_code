package dynamicprogrammingandgreedy;

import java.util.*;

public class WordBreakDP {
	public boolean wordBreak(String s, List<String> wordDict) {
		int n = s.length();
		boolean[] dp = new boolean[n + 1];
		dp[0] = true;
		int maxLen = 0;
		for (String w : wordDict)
			maxLen = Math.max(maxLen, w.length());
		Set<String> dict = new HashSet<>(wordDict);
		for (int i = 1; i <= n; i++)
			for (int j = Math.max(0, i - maxLen); j < i; j++)
				if (dp[j] && dict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
		return dp[n];
	}

	public static void main(String[] args) {
		WordBreakDP sol = new WordBreakDP();
		System.out.println(sol.wordBreak("applepenapple", Arrays.asList("apple", "pen"))); // true
	}
}