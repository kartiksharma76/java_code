package litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> answer = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(answer, new ArrayList<>(), candidates, target, 0);

		return answer;

	}

	private void backtrack(List<List<Integer>> answer, List<Integer> tempList, int[] candidates, int totalleft,
			int index) {
		if (totalleft < 0)
			return;
		if (totalleft == 0) {
			answer.add(new ArrayList<Integer>(tempList));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i] == candidates[i - 1])
				continue;

			tempList.add(candidates[i]);
			backtrack(answer, tempList, candidates, totalleft - candidates[i], i + 1);
			tempList.remove(tempList.size() - 1);
		}
		

	}
}
