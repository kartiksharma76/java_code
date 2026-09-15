package binarysearch;

public class FloorInSortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 10, 12 };
		int x = 5;

		int left = 0;
		int right = arr.length - 1;
		int floor = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == x) {
				floor = arr[mid];
				break;
			} else if (arr[mid] < x) {
				floor = arr[mid];
				left = mid + 1;
			} else {
				right = mid - 1;

			}
		}
		if (floor == -1) {
			System.out.println("Floor does not exist");
		} else {
			System.out.println("Floor: " + floor);
		}

	}
}
