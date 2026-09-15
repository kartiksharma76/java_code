package Shorting;

public class BubbleSort {
	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {// outer loop
			for (int j = 0; j < n - i - 1; j++) {// inner loop
				if (arr[j] > arr[j + 1]) {// swap element out order
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		bubblesort(arr);
		System.out.println("sorted array:");
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
}
