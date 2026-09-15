package greedyapproach;

import java.util.*;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for (int[] iv : intervals) {
            if (iv[0] >= lastEnd) lastEnd = iv[1];
            else count++;
        }
        return count;
    }
}
