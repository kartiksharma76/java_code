package ArrayQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumofEqualNoPair {
	public static boolean hasEqualPairSum(int[] arr) {
		Map<Integer, List<int[]>> sumMap = new HashMap<>();

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];

				if (sumMap.containsKey(sum)) {
					for (int[] pair : sumMap.get(sum)) {

						if (pair[0] != i && pair[1] != i && pair[0] != j && pair[1] != j) {
							System.out.println("Matching Pairs: (" + arr[i] + ", " + arr[j] + ") and (" + arr[pair[0]]
									+ ", " + arr[pair[1]] + ")");
							return true;
						}
					}
				}

				sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(new int[] { i, j });
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 65, 30, 7, 90, 1, 9, 8 };

		System.out.println("no pair: " + hasEqualPairSum(arr));
	}
}
