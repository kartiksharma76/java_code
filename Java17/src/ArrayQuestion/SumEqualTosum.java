package ArrayQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumEqualTosum {
	public static boolean hasequalpairtosum(int[] arr) {
		Map<Integer, List<int[]>> sumMap = new HashMap<>();

		int n = arr.length;
		// Check all pairs
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];

				// If this sum has already been seen
				if (sumMap.containsKey(sum)) {
					for (int[] pair : sumMap.get(sum)) {
						// Make sure all indices are different
						if (pair[0] != i && pair[0] != j && pair[1] != i && pair[1] != j) {
							System.out.println("Pairs found: (" + arr[i] + ", " + arr[j] + ") and (" + arr[pair[0]]
									+ ", " + arr[pair[1]] + ")");
							return true;
						}
					}
				}

				// Save the pair
				sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(new int[] { i, j });
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 7, 1, 2, 9, 8 };
		System.out.println("Has equal pair sum: " + hasequalpairtosum(arr));
	}
}
