package array;

public class Rotate4 {

	public void Rotate(int[] arr, int d, int n) {
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

	public void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Rotate4 rotate = new Rotate4();
		int[] arr = { 25, 50, 75, 100, 125, 150, 175, 200 };
		rotate.Rotate(arr, 5, arr.length);
		rotate.printArray(arr, arr.length);

	}
}
