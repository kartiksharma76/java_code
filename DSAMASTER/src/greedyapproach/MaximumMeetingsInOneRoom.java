package greedyapproach;

import java.util.*;

// Maximum Meetings in One Room - returns order of selected meetings
public class MaximumMeetingsInOneRoom {
    public List<Integer> maxMeetings(int[] start, int[] end) {
        int n = start.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> end[a] - end[b]);

        List<Integer> res = new ArrayList<>();
        int lastEnd = -1;
        for (int i : idx) {
            if (start[i] > lastEnd) {
                res.add(i + 1); // 1-indexed meeting number
                lastEnd = end[i];
            }
        }
        return res;
    }
}
