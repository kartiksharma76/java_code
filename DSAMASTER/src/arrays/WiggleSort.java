package arrays;

public class WiggleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 2, 1, 6, 4 };

		for (int i = 0; i < arr.length - 1; i++) {

			if ((i % 2 == 0 && arr[i] > arr[i + 1]) || (i % 2 == 1 && arr[i] < arr[i + 1])) {

				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.print("Wiggle Sorted Array: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
