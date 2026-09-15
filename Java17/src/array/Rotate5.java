package array;

public class Rotate5 {
	public static void rotate(int[] arr, int d, int n) {
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

	public void print(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Rotate5 rotate = new Rotate5();
		int[] arr = { 1, 2, 4, 5, 7, 8, 90, 100 };
		rotate.rotate(arr, 4, arr.length);
		rotate.print(arr, arr.length);
	}
}
