package recursion;

import java.util.*;

public class CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(result, new ArrayList<>(), candidates, target, 0);
		return result;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> cur, int[] cands, int remain, int start) {
		if (remain == 0) {
			res.add(new ArrayList<>(cur));
			return;
		}
		for (int i = start; i < cands.length; i++) {
			if (cands[i] > remain)
				break;
			if (i > start && cands[i] == cands[i - 1])
				continue; // skip dups
			cur.add(cands[i]);
			backtrack(res, cur, cands, remain - cands[i], i + 1);
			cur.remove(cur.size() - 1);
		}
	}

	public static void main(String[] args) {
		CombinationSumII sol = new CombinationSumII();
		System.out.println(sol.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8));
// [[1,1,6],[1,2,5],[1,7],[2,6]]
	}
}
