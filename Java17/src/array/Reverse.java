package array;

public class Reverse {
	public static void ReverseArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];

			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

		if (n == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		ReverseArray(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");

	}
}