package infosyscodingquestion;

public class QuickSort {

	// quick sort function
	static void quickSort(int arr[], int low, int high) {

		if (low < high) {

			// find pivot index
			int pivotIndex = partition(arr, low, high);

			// left part sort
			quickSort(arr, low, pivotIndex - 1);

			// right part sort
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {

		// last element = pivot
		int pivot = arr[high];

		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; // FIXED HERE
			}
		}

		// place pivot at correct position
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 2, 8, 1, 3 };

		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}