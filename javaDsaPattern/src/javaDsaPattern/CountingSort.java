package javaDsaPattern;

import java.util.Scanner;

public class CountingSort {

	// Counting Sort
	public static void countingSort(int arr[]) {

		// Find maximum element
		int max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
		}

		// Count array
		int count[] = new int[max + 1];

		// Count frequency
		for (int num : arr) {
			count[num]++;
		}

		// Rebuild sorted array
		int index = 0;
		for (int i = 0; i <= max; i++) {
			while (count[i] > 0) {
				arr[index++] = i;
				count[i]--;
			}
		}
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

		countingSort(arr);

		System.out.print("After Sorting: ");
		display(arr);

		sc.close();
	}
}