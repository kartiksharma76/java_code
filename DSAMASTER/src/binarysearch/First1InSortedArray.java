package binarysearch;

public class First1InSortedArray {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 1, 1, 1 };

		int left = 0;
		int right = arr.length - 1;
		int ans = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == 1) {
				ans = mid;
				right = mid - 1; // Search on left side
			} else {
				left = mid + 1;
			}
		}

		if (ans == -1) {
			System.out.println("1 is not present");
		} else {
			System.out.println("First 1 is at index: " + ans);
		}
	}
}