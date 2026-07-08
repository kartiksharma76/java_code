package binarysearch;

public class CapacityToShipPackages {

	static int daysRequired(int[] weights, int capacity) {

		int days = 1;
		int load = 0;

		for (int weight : weights) {

			if (load + weight > capacity) {
				days++;
				load = weight;
			} else {
				load += weight;
			}
		}

		return days;
	}

	public static void main(String[] args) {

		int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int days = 5;

		int low = 0, high = 0;

		for (int w : weights) {
			low = Math.max(low, w);
			high += w;
		}

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (daysRequired(weights, mid) <= days)
				high = mid;
			else
				low = mid + 1;
		}

		System.out.println(low);
	}
}