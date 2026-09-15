package twopointering;

import java.util.*;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
