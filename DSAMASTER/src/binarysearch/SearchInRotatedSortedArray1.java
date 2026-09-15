package binarysearch;

public class SearchInRotatedSortedArray1 {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				System.out.println(mid);
				return;
			}

			if (arr[left] <= arr[mid]) {

				if (target >= arr[left] && target < arr[mid])
					right = mid - 1;
				else
					left = mid + 1;

			} else {

				if (target > arr[mid] && target <= arr[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}

		System.out.println(-1);
	}
}