package nqttop150;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	public static void main(String[] args) {
		int[] num = { 4, 5, 6 };
		int target = 10;

		int[] result = tosum(num, target);
		if (result != null) {
			System.out.println(result[0] + result[1]);
		} else {
			System.out.println("No solution");
		}
	}

	private static int[] tosum(int[] num, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(num[i], i);
		}
		return null;
	}
}
