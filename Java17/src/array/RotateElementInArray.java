package array;

public class RotateElementInArray {
	public void rotate(int[] arr, int d, int n) {
		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}
		for (int i = 0; i < d; i++) {
			arr[i + n - d] = temp[i];

		}
	}

	public void print(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		RotateElementInArray rotate = new RotateElementInArray();
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		rotate.rotate(arr, 3, arr.length);
		rotate.print(arr, arr.length);
	}
}
