package backtrackings;

import java.util.*;

public class CombinationSumI {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] candidates, int start, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) { res.add(new ArrayList<>(path)); return; }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            path.add(candidates[i]);
            backtrack(candidates, i, target - candidates[i], path, res);
            path.remove(path.size() - 1);
        }
    }
}
