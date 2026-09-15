package binarysearch;

public class SearchXInSortedArray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12 };

		int x = 8;

		int left = 0;
		int right = arr.length - 1;
		int index = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == x) {
				index = mid;
				break;
			} else if (arr[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
