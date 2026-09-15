package backtrackings;

import java.util.*;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(String s, int start, List<String> path, List<List<String>> res) {
        if (start == s.length()) { res.add(new ArrayList<>(path)); return; }
        for (int end = start + 1; end <= s.length(); end++) {
            if (isPalindrome(s, start, end - 1)) {
                path.add(s.substring(start, end));
                backtrack(s, end, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int lo, int hi) {
        while (lo < hi) if (s.charAt(lo++) != s.charAt(hi--)) return false;
        return true;
    }
}
