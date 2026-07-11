package twopointering;

import java.util.*;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if (s2.length() < k) return false;
        int[] need = new int[26], window = new int[26];
        for (char c : s1.toCharArray()) need[c - 'a']++;
        for (int i = 0; i < s2.length(); i++) {
            window[s2.charAt(i) - 'a']++;
            if (i >= k) window[s2.charAt(i - k) - 'a']--;
            if (i >= k - 1 && Arrays.equals(need, window)) return true;
        }
        return false;
    }
}
