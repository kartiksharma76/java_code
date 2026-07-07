package arrays;

public class RotateArrayByKSteps {

	public static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		k = k % arr.length;

		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);

		System.out.print("Array after Right Rotation: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
