package binarysearch;

public class LowerBound {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 4, 5, 7 };
		int x = 4;

		int left = 0;
		int right = arr.length - 1;
		int ans = arr.length;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] >= x) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (ans == arr.length) {
			System.out.println("Lower Bound does not exist");
		} else {
			System.out.println("Lower Bound Index: " + ans);
		}
	}
}
