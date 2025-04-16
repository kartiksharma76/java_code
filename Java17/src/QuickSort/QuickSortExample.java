package QuickSort;

import java.util.Arrays;

public class QuickSortExample {
	// method to find the partition position
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // choose the rightmost element as pivot
		int i = low - 1; // pointer for greater element

		for (int j = low; j < high; j++) {
			// if current element is smaller than or equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swapping
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap the pivot element with the greater element at i+1
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		// return the partition point
		return i + 1;
	}

	public static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			// recursive call on the left of pivot
			quicksort(arr, low, pi - 1);

			// recursive call on the right of pivot
			quicksort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 1, 0, 9, 6 };
		System.out.println("Unsorted array:");
		System.out.println(Arrays.toString(arr));

		int n = arr.length;
		quicksort(arr, 0, n - 1);

		System.out.println("Sorted ascending order:");
		System.out.println(Arrays.toString(arr));
	}
}
