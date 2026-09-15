package greedyapproach;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] iv : intervals) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < iv[0]) {
                res.add(iv);
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], iv[1]);
            }
        }
        return res.toArray(new int[0][]);
    }
}
