package Shorting;

public class InsertionSort {
	public static void insetionsort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
	}

	public static void main(String[] args) {
		int[] arr = { 20, 10, 14, 37, 12 };
		insetionsort(arr);
		System.out.println("sorted array");
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
}
