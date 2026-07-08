package binarysearch;

public class SqrtX {
	public static void main(String[] args) {
		int x = 17;

		int left = 1;
		int right = x;
		int ans = 0;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if ((long) mid * mid <= x) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println(ans);
	}
}
