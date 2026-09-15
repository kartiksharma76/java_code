package backtrackings;

import java.util.*;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int start, int k, int target, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) { if (target == 0) res.add(new ArrayList<>(path)); return; }
        for (int i = start; i <= 9 && i <= target; i++) {
            path.add(i);
            backtrack(i + 1, k, target - i, path, res);
            path.remove(path.size() - 1);
        }
    }
}
