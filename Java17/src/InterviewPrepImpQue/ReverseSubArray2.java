package InterviewPrepImpQue;

public class ReverseSubArray2 {
	public static void reverseSubArray(int[] arr, int L, int R) {
		L = L - 1;
		R = R - 1;
		while (L < R) {
			// swap
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;

			L++;
			R--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 6, 7, 4 };

		int L = 1;
		int R = 4;
		reverseSubArray(arr, L, R);
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
