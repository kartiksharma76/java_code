package twopointering;

import java.util.*;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        int[] need = new int[26], window = new int[26];
        for (char c : p.toCharArray()) need[c - 'a']++;
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= k) window[s.charAt(i - k) - 'a']--;
            if (i >= k - 1 && Arrays.equals(need, window)) res.add(i - k + 1);
        }
        return res;
    }
}
