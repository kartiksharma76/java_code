package DsaQuestions.uber;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubString(String str) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1;
            }
            lastSeen.put(ch, right);
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = lengthOfLongestSubString(str);
        System.out.println("Longest SubString Length = " + result);
    }

}
