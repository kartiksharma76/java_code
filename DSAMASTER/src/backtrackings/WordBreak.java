package backtrackings;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return solve(s, 0, wordSet, memo);
    }
    private boolean solve(String s, int start, Set<String> wordSet, Boolean[] memo) {
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start];
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordSet.contains(s.substring(start, end)) && solve(s, end, wordSet, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
}
