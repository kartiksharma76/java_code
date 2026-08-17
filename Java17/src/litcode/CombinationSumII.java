package litcode;

import java.util.List;

public class CombinationSumII {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] candidate = { 10, 1, 2, 7, 6, 1, 5 };

		int target = 8;
		List<List<Integer>> result = sol.combinationSum2(candidate, target);
		System.out.println("Unique Combination that sum to " + target + ":");
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}
}
