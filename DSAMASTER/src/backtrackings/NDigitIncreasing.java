package backtrackings;

import java.util.*;

// N Digit numbers with digits in increasing order
public class NDigitIncreasing {
    public List<Integer> increasingDigitNumbers(int n) {
        List<Integer> res = new ArrayList<>();
        for (int start = 1; start <= 9; start++) {
            backtrack(start, n, 0, res);
        }
        Collections.sort(res);
        return res;
    }
    private void backtrack(int digit, int n, int num, List<Integer> res) {
        if (n == 0) { res.add(num); return; }
        for (int d = digit; d <= 9; d++) {
            backtrack(d + 1, n - 1, num * 10 + d, res);
        }
    }
}
