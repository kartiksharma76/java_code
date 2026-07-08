package binarysearch;

import java.util.Arrays;

public class AggressiveCows {
	static boolean canPlace(int[] stalls, int cows, int distance) {
		int count = 1;
		int last = stalls[0];
		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - last >= distance) {
				count++;
				last = stalls[i];
			}
		}
		return count >= cows;
	}

	public static void main(String[] args) {
		int[] stalls = { 1, 2, 4, 8, 9 };
		int cows = 3;
		Arrays.sort(stalls);
		int low = 1;
		int high = stalls[stalls.length - 1] - stalls[0];
		int ans = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (canPlace(stalls, cows, mid)) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(ans);
	}
}