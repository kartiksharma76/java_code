package binarysearch;

public class KokoEatingBananas {
	static int hours(int[] piles, int speed) {
		int total = 0;
		for (int pile : piles)
			total += (pile + speed - 1) / speed;
		return total;
	}

	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;

		int left = 1;
		int right = 11;
		int ans = right;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (hours(piles, mid) <= h) {
				ans = mid;
				right = mid - 1;
			} else
				left = mid + 1;
		}
		System.out.println(ans);
	}
}
