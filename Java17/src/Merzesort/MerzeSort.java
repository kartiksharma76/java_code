package Merzesort;

public class MerzeSort {

	public static void divide(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		divide(arr, start, mid);
		divide(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int[] merged = new int[end - start + 1];
		int firstindex = start;
		int secondindex = mid + 1;
		int i = 0;

		while (firstindex <= mid && secondindex <= end) {
			if (arr[firstindex] <= arr[secondindex]) {
				merged[i++] = arr[firstindex++];
			} else {
				merged[i++] = arr[secondindex++];
			}
		}

		while (firstindex <= mid) {
			merged[i++] = arr[firstindex++];
		}

		while (secondindex <= end) {
			merged[i++] = arr[secondindex++];
		}

		for (int k = 0; k < merged.length; k++) {
			arr[start + k] = merged[k];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };
		int n = arr.length;
		divide(arr, 0, n - 1);
		System.out.println("mergeSort array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
