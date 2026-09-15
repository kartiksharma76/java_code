package binarysearch;

public class FirstAndLastOccurrence {
	static int firstOccurance(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		int ans = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				ans = mid;
				right = mid - 1;

			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;

	}

	static int lastOccurrence(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		int ans = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				ans = mid;
				left = mid + 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 4, 4, 6, 8 };
		int target = 4;

		System.out.println("First: " + firstOccurance(arr, target));
		System.out.println("Last: " + lastOccurrence(arr, target));
	}
}
