package binarysearch;

public class NthRoot {

	static long power(long a, int n) {

		long ans = 1;

		for (int i = 0; i < n; i++) {
			ans *= a;
		}

		return ans;
	}

	public static void main(String[] args) {

		int n = 3;
		int m = 27;

		int left = 1;
		int right = m;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			long value = power(mid, n);

			if (value == m) {
				System.out.println(mid);
				return;
			}

			if (value < m)
				left = mid + 1;
			else
				right = mid - 1;
		}

		System.out.println(-1);
	}
}