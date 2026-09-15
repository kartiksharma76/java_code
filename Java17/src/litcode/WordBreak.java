package litcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> set = new HashSet<>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && set.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		WordBreak wb = new WordBreak();

		// Test case 1
		String s1 = "leetcode";
		List<String> wordDict1 = Arrays.asList("leet", "code");
		System.out.println("Test 1: " + wb.wordBreak(s1, wordDict1)); // Expected: true

		// Test case 2
		String s2 = "applepenapple";
		List<String> wordDict2 = Arrays.asList("apple", "pen");
		System.out.println("Test 2: " + wb.wordBreak(s2, wordDict2)); // Expected: true

		// Test case 3
		String s3 = "catsandog";
		List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
		System.out.println("Test 3: " + wb.wordBreak(s3, wordDict3)); // Expected: false

		// Test case 4
		String s4 = "a";
		List<String> wordDict4 = Arrays.asList("a");
		System.out.println("Test 4: " + wb.wordBreak(s4, wordDict4)); // Expected: true

		// Test case 5
		String s5 = "bb";
		List<String> wordDict5 = Arrays.asList("a", "b", "bbb", "bbbb");
		System.out.println("Test 5: " + wb.wordBreak(s5, wordDict5)); // Expected: true
	}
}