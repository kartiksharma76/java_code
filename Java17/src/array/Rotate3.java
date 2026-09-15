package array;

public class Rotate3 {
	public void rotate(int[] arr, int d, int n) {
		int temp[] = new int[d];

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

	public void printarry(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Rotate3 rotate = new Rotate3();
		int[] arr = { 2, 6, 8, 3, 0, 4, 1 };
		rotate.rotate(arr, 4, arr.length);
		rotate.printarry(arr, arr.length);
	}
}
