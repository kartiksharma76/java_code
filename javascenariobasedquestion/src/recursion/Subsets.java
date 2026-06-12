package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums, 0);
		return result;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> cur, int[] nums, int start) {
		res.add(new ArrayList<>(cur));
		for (int i = start; i < nums.length; i++) {
			cur.add(nums[i]);
			backtrack(res, cur, nums, i + 1);
			cur.remove(cur.size() - 1);
		}

	}

	public static void main(String[] args) {
		Subsets sol = new Subsets();
		System.out.println(sol.subsets(new int[] { 1, 2, 3 }));
	}
}
