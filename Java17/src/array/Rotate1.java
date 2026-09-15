package array;

public class Rotate1 {
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

	public void printarray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Rotate1 rotate1 = new Rotate1();
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, };
		rotate1.rotate(arr, 2, arr.length);
		rotate1.printarray(arr, arr.length);
	}
}
