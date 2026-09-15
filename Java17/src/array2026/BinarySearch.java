package array2026;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
		if (left > right)
			return -1;

		int mid = left + (right - left) / 2;

		if (arr[mid] == target)
			return mid;
		else if (arr[mid] < target)
			return binarySearchRecursive(arr, target, mid + 1, right);
		else
			return binarySearchRecursive(arr, target, left, mid - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int target = 40;

		int result1 = binarySearch(arr, target);
		System.out.println("Iterative Binary Search Index: " + result1);

		int result2 = binarySearchRecursive(arr, target, 0, arr.length - 1);
		System.out.println("Recursive Binary Search Index: " + result2);
	}
}
