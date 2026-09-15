package dpp;

import java.util.*;

public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        List<Integer> tails = new ArrayList<>();
        for (int[] e : envelopes) {
            int h = e[1];
            int idx = Collections.binarySearch(tails, h);
            if (idx < 0) idx = -(idx + 1);
            if (idx == tails.size()) tails.add(h);
            else tails.set(idx, h);
        }
        return tails.size();
    }
}
