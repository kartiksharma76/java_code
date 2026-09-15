package DsaImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		List<int[]> result = new ArrayList<>();
		int[] current = intervals[0];
		result.add(current);

		for (int[] interval : intervals) {
			if (interval[0] <= current[1]) {
				current[1] = Math.max(current[1], interval[1]);
			} else {
				current = interval;
				result.add(current);
			}
		}

		return result.toArray(new int[0][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] result = merge(intervals);
		for (int[] r : result)
			System.out.println(Arrays.toString(r));
	}

}
