package array;

public class Reverse1 {
	public static void Reverse1(int[] arr) {
		int a = arr.length;
		for (int i = 0; i < a / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[a - i - 1];
			arr[a - i - 1] = temp;

		}
		if (a == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Reverse1(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
