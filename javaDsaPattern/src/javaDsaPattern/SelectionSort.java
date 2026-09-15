package javaDsaPattern;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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

		selectionSort(arr);

		System.out.print("After Sorting: ");
		display(arr);

		sc.close();

	}
}
