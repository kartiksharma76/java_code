package binarysearch;

public class CeilInSortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 10, 12 };
		int x = 5;

		int left = 0;
		int right = arr.length - 1;
		int ceil = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == x) {
				ceil = arr[mid];
				break;
			} else if (arr[mid] > x) {
				ceil = arr[mid];
				right = mid - 1;
			} else {
				left = left + 1;
			}
		}

		if (ceil == -1) {
			System.out.println("Ceil does not exist");
		} else {
			System.out.println("Ceil: " + ceil);
		}

	}
}
