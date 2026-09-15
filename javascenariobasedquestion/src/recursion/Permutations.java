package recursion;

import java.util.*;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
		return result;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] used) {
		if (cur.size() == nums.length) {
			res.add(new ArrayList<>(cur));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				cur.add(nums[i]);
				backtrack(res, cur, nums, used);
				used[i] = false;
				cur.remove(cur.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		Permutations sol = new Permutations();
		System.out.println(sol.permute(new int[] { 1, 2, 3 }));
	}
}
