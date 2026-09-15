package twopointering;

// Minimum Window Subsequence - smallest substring of s that contains t as a subsequence
public class MinimumWindowSubsequence {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        int bestLen = Integer.MAX_VALUE, bestStart = -1;
        int i = 0;
        while (i < m) {
            if (s.charAt(i) == t.charAt(0)) {
                int start = i, j = 0;
                while (i < m) {
                    if (s.charAt(i) == t.charAt(j)) {
                        j++;
                        if (j == n) break;
                    }
                    i++;
                }
                if (j == n) {
                    int end = i;
                    j = n - 1;
                    while (j >= 0) {
                        if (s.charAt(end) == t.charAt(j)) j--;
                        end--;
                    }
                    end++;
                    if (i - end + 1 < bestLen) {
                        bestLen = i - end + 1;
                        bestStart = end;
                    }
                    i = end; // restart search just after this window's start
                }
            }
            i++;
        }
        return bestStart == -1 ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}
