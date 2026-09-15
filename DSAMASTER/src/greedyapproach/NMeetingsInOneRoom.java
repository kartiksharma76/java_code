package greedyapproach;

import java.util.*;

public class NMeetingsInOneRoom {
    public int maxMeetings(int[] start, int[] end) {
        int n = start.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> end[a] - end[b]);

        int count = 0;
        int lastEnd = -1;
        for (int i : idx) {
            if (start[i] > lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }
        return count;
    }
}
