package javaDsaPattern;

import java.util.Scanner;

public class BubbleSort1 {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

	public static void display(int[] arr) {
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
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Before Sorting: ");
		display(arr);

		bubbleSort(arr);

		System.out.print("After Sorting: ");
		display(arr);

		sc.close();
	}
}
