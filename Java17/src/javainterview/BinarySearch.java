package javainterview;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // sorted
		int key = 30;

		int left = 0;
		int right = arr.length - 1;
		boolean found = false;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == key) {
				System.out.println("Element found at index: " + mid);
				found = true;
				break;
			} else if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			if (!found) {
				System.out.println("Element not Found");
			}
		}
	}
}
