package Google.com;

public class LeftRightMostIndex {
	public static int findLeftMost(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				result = mid;
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}

		}

		return result;
	}

	public static int findRightMost(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				result = mid;
				low = mid + 1;

			} else if (arr[mid] < x) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}

		}

		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
		int x = 2;
		int left = findLeftMost(arr, x);
		int right = findRightMost(arr, x);

		if (left == -1) {
			System.out.println("element not found :");
		} else {
			System.out.println("Left most index :" + left);
			System.out.println("Right most index :" + right);
		}
	}
}
