package javaDsaPattern;

//Merge Intervals

import java.util.*;

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

		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		int[][] ans = merge(intervals);

		for (int[] arr : ans) {

			System.out.println(arr[0] + " " + arr[1]);
		}
	}
}