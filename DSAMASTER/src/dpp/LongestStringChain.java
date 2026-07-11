package dpp;

import java.util.*;

public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> dp = new HashMap<>();
        int best = 1;
        for (String w : words) {
            dp.put(w, 1);
            for (int i = 0; i < w.length(); i++) {
                String predecessor = w.substring(0, i) + w.substring(i + 1);
                if (dp.containsKey(predecessor)) {
                    dp.put(w, Math.max(dp.get(w), dp.get(predecessor) + 1));
                }
            }
            best = Math.max(best, dp.get(w));
        }
        return best;
    }
}
