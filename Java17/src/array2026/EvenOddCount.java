package array2026;

public class EvenOddCount {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
				System.out.println(arr[i] + "is even");
			} else {
				odd++;
				System.out.println(arr[i] + "is odd");

			}

		}
		System.out.println("\nTotal even numbers: " + even);
		System.out.println("Total odd numbers: " + odd);
	}
}
