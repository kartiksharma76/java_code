package javaDsaPattern;

public class MissingNumber {
	public static int missingNumber(int[] arr) {
		int xor = arr.length;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ i ^ arr[i];
		}
		return xor;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1 };

		System.out.println("Missing Number = " + missingNumber(arr));
	}
}
