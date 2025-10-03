package DsaImp;

import java.util.Arrays;

public class MergeSort {
	public void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		// Merge the temp arrays back
		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] (if any)
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] (if any)
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort(int[] arr) {
		if (arr == null || arr.length == 0)
			return;
		mergeSort(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr1 = { 38, 27, 43, 3, 9, 82, 10 };
		System.out.println("Original: " + Arrays.toString(arr1));
		ms.sort(arr1);
		System.out.println("Sorted:   " + Arrays.toString(arr1));

	}
}