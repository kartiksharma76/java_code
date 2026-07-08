package binarysearch;

public class SingleElementInSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

		int left = 0;
		int right = arr.length - 2;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == arr[mid ^ 1])
				left = mid + 1;
			else
				right = mid - 1;
		}

		System.out.println(arr[left]);
	}
}