package array;

public class Rotate {
	public void rotate(int arr[], int d, int n) {
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

	void printarray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Rotate rotate = new Rotate();
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate.rotate(arr, 2, arr.length);
		rotate.printarray(arr, arr.length);
	}
}
