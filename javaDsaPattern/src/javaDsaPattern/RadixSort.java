package javaDsaPattern;

import java.util.Scanner;

public class RadixSort {

	// Get Maximum Element
	public static int getMax(int arr[]) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
		}
		return max;
	}

	// Counting Sort for each digit
	public static void countingSort(int arr[], int exp) {

		int n = arr.length;
		int output[] = new int[n];
		int count[] = new int[10];

		// Count frequency
		for (int i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		// Prefix sum
		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build output array
		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// Copy back
		for (int i = 0; i < n; i++)
			arr[i] = output[i];
	}

	// Radix Sort
	public static void radixSort(int arr[]) {

		int max = getMax(arr);

		for (int exp = 1; max / exp > 0; exp *= 10)
			countingSort(arr, exp);
	}

	// Display
	public static void display(int arr[]) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.print("Before Sorting: ");
		display(arr);

		radixSort(arr);

		System.out.print("After Sorting: ");
		display(arr);

		sc.close();
	}
}