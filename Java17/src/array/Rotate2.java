package array;

public class Rotate2 {

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

	public void printarray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");

		}
	}

	public static void main(String[] args) {
		Rotate2 rotate2 = new Rotate2();
		int[] arr = { 3, 5, 6, 7, 8, 4, 6 };
		rotate2.rotate(arr, 3, arr.length);
		rotate2.printarray(arr, arr.length);

	}

}
