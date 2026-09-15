package bitmanipulation;

import java.util.*;

public class MinimumXorPair {
    public int minXorPair(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int best = Integer.MAX_VALUE;
        for (int i = 0; i + 1 < sorted.length; i++) {
            best = Math.min(best, sorted[i] ^ sorted[i + 1]);
        }
        return best;
    }
}
