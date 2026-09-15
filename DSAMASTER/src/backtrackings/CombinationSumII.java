package backtrackings;

import java.util.*;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] candidates, int start, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) { res.add(new ArrayList<>(path)); return; }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            path.add(candidates[i]);
            backtrack(candidates, i + 1, target - candidates[i], path, res);
            path.remove(path.size() - 1);
        }
    }
}
