package NPTL25;

import java.util.Arrays;
import java.util.Scanner;

public class W07_P2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input array size
		int n = scanner.nextInt();
		int[] array = new int[n];

		// Input elements
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		// Element to remove
		int elementToRemove = scanner.nextInt();

		// Close the scanner
		scanner.close();

		// Removing element and printing result
		System.out.println("Original Array: " + Arrays.toString(array));
		array = removeAll(array, elementToRemove);
		System.out.print("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
	}

	// program to remove all occurrences of an element from array in Java.
	public static int[] removeAll(int[] array, int elementToRemove) {
		int[] result = new int[array.length];
		int index = 0;

		// Iterate through the original array
		for (int value : array) {
			// Copy only if the current element is not equal to the element to be removed
			if (value != elementToRemove) {
				result[index++] = value;
			}
		}

		// Resize result to actual number of kept elements
		return Arrays.copyOf(result, index);
	}
}
