package sorting;

public class MergeSort {
	static void mergeSort(int[] arr, int low, int high) {

		if (low >= high)
			return;

		int mid = low + (high - low) / 2;

		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);

		merge(arr, low, mid, high);
	}

	static void merge(int[] arr, int low, int mid, int high) {

		int[] temp = new int[high - low + 1];

		int left = low;
		int right = mid + 1;
		int k = 0;

		while (left <= mid && right <= high) {

			if (arr[left] <= arr[right]) {
				temp[k++] = arr[left++];
			} else {
				temp[k++] = arr[right++];
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5, 2, 3, 1 };

		mergeSort(arr, 0, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
