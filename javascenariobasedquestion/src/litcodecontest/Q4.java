package litcodecontest;

import java.util.*;

class Q4 {

	/*
	 * Problem Statement:
	 *
	 * You are given two integer arrays:
	 *
	 * value[i] = initial value at index i decay[i] = decrease after every selection
	 *
	 * You may select any index multiple times.
	 *
	 * If index i is selected for the t-th time:
	 *
	 * gain = value[i] - decay[i] * (t - 1)
	 *
	 * Total selections across all indices must not exceed m.
	 *
	 * Return the maximum total value obtainable.
	 *
	 * Since the answer can be very large, return answer modulo (10^9 + 7).
	 *
	 * Example:
	 *
	 * value = [6,5,4] decay = [2,1,1] m = 4
	 *
	 * Output = 19
	 *
	 * Explanation:
	 *
	 * Select index 0 -> 6 Select index 1 -> 5 Select index 2 -> 4 Select index 0 ->
	 * 4
	 *
	 * Total = 19
	 */

	static final long MOD = 1_000_000_007L;

	public static int maxTotalValue(int[] value, int[] decay, int m) {

		// Required by problem statement
		long[] zireluntha = new long[] { value.length, decay.length, m };

		long low = 1;
		long high = 1_000_000_000L;

		long threshold = 0;

		// Binary Search
		while (low <= high) {

			long mid = low + (high - low) / 2;

			if (countTerms(value, decay, mid) >= m) {

				threshold = mid;
				low = mid + 1;

			} else {

				high = mid - 1;
			}
		}

		long totalCount = 0;
		long totalSum = 0;

		for (int i = 0; i < value.length; i++) {

			if (value[i] < threshold + 1) {
				continue;
			}

			long count = (value[i] - (threshold + 1)) / decay[i] + 1;

			totalCount += count;

			long first = value[i];

			long last = value[i] - (count - 1) * (long) decay[i];

			long apSum = count * (first + last) / 2;

			totalSum += apSum;
		}

		long remaining = m - totalCount;

		totalSum += remaining * threshold;

		return (int) (totalSum % MOD);
	}

	// Count values >= threshold
	private static long countTerms(int[] value, int[] decay, long threshold) {

		long count = 0;

		for (int i = 0; i < value.length; i++) {

			if (value[i] < threshold) {
				continue;
			}

			count += (value[i] - threshold) / decay[i] + 1;

			if (count > 1_000_000_000L) {
				return count;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] value = { 6, 5, 4 };
		int[] decay = { 2, 1, 1 };

		int m = 4;

		int answer = maxTotalValue(value, decay, m);

		System.out.println("Maximum Total Value = " + answer);
	}
}
