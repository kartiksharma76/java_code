package backtrackings;

import java.util.*;

public class SubsetsPowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] nums, int idx, List<Integer> path, List<List<Integer>> res) {
        if (idx == nums.length) { res.add(new ArrayList<>(path)); return; }
        backtrack(nums, idx + 1, path, res);
        path.add(nums[idx]);
        backtrack(nums, idx + 1, path, res);
        path.remove(path.size() - 1);
    }
}
