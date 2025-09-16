package DsaImp;

public class RotatedSortedArray {
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

	public void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		RotatedSortedArray rotate = new RotatedSortedArray();
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		rotate.rotate(arr, 4, arr.length);
		rotate.printArray(arr, arr.length);
	}
}
