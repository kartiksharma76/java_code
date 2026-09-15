package binarysearch;

public class MinimumSpeedToArrive {

	static double time(int[] dist, int speed) {

		double total = 0;

		for (int i = 0; i < dist.length - 1; i++)
			total += Math.ceil((double) dist[i] / speed);

		total += (double) dist[dist.length - 1] / speed;

		return total;
	}

	public static void main(String[] args) {

		int[] dist = { 1, 3, 2 };
		double hour = 2.7;

		int left = 1;
		int right = 10000000;
		int ans = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (time(dist, mid) <= hour) {
				ans = mid;
				right = mid - 1;
			} else
				left = mid + 1;
		}

		System.out.println(ans);
	}
}