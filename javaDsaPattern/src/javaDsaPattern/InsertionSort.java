package javaDsaPattern;

import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int arr[]) {

		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int key = arr[i];
			int j = i - 1;

			// Move elements greater than key one position ahead
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}
	}

	public static void display(int arr[]) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Before Sorting: ");
		display(arr);

		insertionSort(arr);

		System.out.print("After Sorting: ");
		display(arr);

		sc.close();
	}
}
