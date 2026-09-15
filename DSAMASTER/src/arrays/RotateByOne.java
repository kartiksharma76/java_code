package arrays;

public class RotateByOne {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int last = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = last;

		System.out.print("Array after Right Rotation by One: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
