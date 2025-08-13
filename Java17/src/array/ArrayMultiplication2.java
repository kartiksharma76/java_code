package array;

public class ArrayMultiplication2 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		if (arr1.length != arr2.length) {
			System.out.println("array same length of array");
			return;

		}
		int[] result = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i] * arr2[i];
		}

		System.out.println("result");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " ");
		}
	}
}
