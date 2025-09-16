package DsaImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();

		int i = 0;
		// Add all intervals ending before newInterval starts
		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}

		// Merge overlapping intervals
		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
			newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			i++;
		}
		result.add(newInterval);

		// remaining intervals
		while (i < intervals.length) {
			result.add(intervals[i]);
			i++;
		}

		return result.toArray(new int[0][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 6, 9 } };
		int[] newInterval = { 2, 5 };
		int[][] result = insert(intervals, newInterval);
		for (int[] r : result)
			System.out.println(Arrays.toString(r));

	}

}
