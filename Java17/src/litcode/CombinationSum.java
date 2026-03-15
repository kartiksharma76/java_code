package litcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int remain, int start) {
        if (remain < 0) return;

        if (remain == 0) {
            // We must create a new list copy because 'temp' is modified during backtracking
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]); // Choose
            backtrack(result, temp, nums, remain - nums[i], i); // Explore (staying at 'i' allows reuse)
            temp.remove(temp.size() - 1); // Un-choose
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        
        List<List<Integer>> solutions = cs.combinationSum(candidates, target);
        System.out.println("Combinations for target " + target + ": " + solutions);
        // Expected Output: [[2, 2, 3], [7]]
    }
}