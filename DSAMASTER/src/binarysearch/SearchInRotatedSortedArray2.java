package binarysearch;

public class SearchInRotatedSortedArray2 {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				System.out.println(true);
				return;
			}

			if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
				left++;
				right--;
			} else if (arr[left] <= arr[mid]) {

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

		System.out.println(false);
	}
}