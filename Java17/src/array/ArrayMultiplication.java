package array;

public class ArrayMultiplication {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		if (arr1.length != arr2.length) {
			System.out.println("Arrays must have the same length for element-wise multiplication.");
			return;
		}
		int[] result = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i] * arr2[i];
		}

		System.out.print("Result: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
