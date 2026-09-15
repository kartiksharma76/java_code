package QuickSort;

import java.util.Arrays;

public class SimpleQuickSort {
	// Method to sort the array using QuickSort
	public static void quickSort(int[] array, int start, int end) {
		// Base case: stop if start index is not less than end index
		if (start < end) {
			// Find partition index
			int partitionIndex = partition(array, start, end);

			// Sort left part
			quickSort(array, start, partitionIndex - 1);
			// Sort right part
			quickSort(array, partitionIndex + 1, end);
		}
	}

	// Method to partition the array
	private static int partition(int[] array, int start, int end) {
		// Choose last element as pivot
		int pivot = array[end];
		// Index of smaller element
		int smallerElementIndex = start - 1;

		// Compare each element with pivot
		for (int current = start; current < end; current++) {
			// If current element is smaller than or equal to pivot
			if (array[current] <= pivot) {
				smallerElementIndex++;
				// Swap elements
				int temp = array[smallerElementIndex];
				array[smallerElementIndex] = array[current];
				array[current] = temp;
			}
		}

		// Place pivot in its correct position
		int temp = array[smallerElementIndex + 1];
		array[smallerElementIndex + 1] = array[end];
		array[end] = temp;

		// Return pivot's position
		return smallerElementIndex + 1;
	}

	public static void main(String[] args) {
		// Test array
		int[] numbers = { 8, 7, 2, 1, 0, 9, 6 };

		// Print unsorted array
		System.out.println("Before sorting: " + Arrays.toString(numbers));

		// Sort array
		quickSort(numbers, 0, numbers.length - 1);

		// Print sorted array
		System.out.println("After sorting: " + Arrays.toString(numbers));
	}

}
