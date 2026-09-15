package binarysearch;

public class MinimumDaysToMakeBouquets {

	static boolean canMake(int[] bloomDay, int day, int m, int k) {

		int flowers = 0;
		int bouquets = 0;

		for (int bloom : bloomDay) {

			if (bloom <= day) {
				flowers++;

				if (flowers == k) {
					bouquets++;
					flowers = 0;
				}

			} else {
				flowers = 0;
			}
		}

		return bouquets >= m;
	}

	public static void main(String[] args) {

		int[] bloomDay = { 1, 10, 3, 10, 2 };
		int m = 3, k = 1;

		if ((long) m * k > bloomDay.length) {
			System.out.println(-1);
			return;
		}

		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;

		for (int day : bloomDay) {
			low = Math.min(low, day);
			high = Math.max(high, day);
		}

		int ans = -1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (canMake(bloomDay, mid, m, k)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		System.out.println(ans);
	}
}
