package backtrackings;

import java.util.*;

// Subset Sums - print sums of all subsets
public class SubsetSums {
    public List<Integer> subsetSums(int[] arr) {
        List<Integer> res = new ArrayList<>();
        backtrack(arr, 0, 0, res);
        Collections.sort(res);
        return res;
    }
    private void backtrack(int[] arr, int idx, int sum, List<Integer> res) {
        if (idx == arr.length) { res.add(sum); return; }
        backtrack(arr, idx + 1, sum + arr[idx], res);
        backtrack(arr, idx + 1, sum, res);
    }
}
