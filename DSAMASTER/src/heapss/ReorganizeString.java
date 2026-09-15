package heapss;

import java.util.*;

public class ReorganizeString {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) if (freq[i] > 0) maxHeap.add(new int[]{i, freq[i]});

        StringBuilder sb = new StringBuilder();
        int[] prev = null;
        while (!maxHeap.isEmpty()) {
            int[] cur = maxHeap.poll();
            sb.append((char) ('a' + cur[0]));
            cur[1]--;
            if (prev != null && prev[1] > 0) maxHeap.add(prev);
            prev = cur;
        }
        return sb.length() == s.length() ? sb.toString() : "";
    }
}
