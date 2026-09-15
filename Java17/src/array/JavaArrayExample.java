package array;

public class JavaArrayExample {
	public static void main(String[] args) {
		// Declare and initialize an array
		int[] scores = { 90, 80, 70, 60, 50 };

		// Print the array elements
		System.out.println("Array Elements:");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		// Access and modify an array element
		scores[0] = 95; // Update the first element
		System.out.println("\nUpdated Array Elements:");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		// Find the sum of array elements
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("\nSum of Array Elements: " + sum);

		// Find the maximum array element
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("Maximum Array Element: " + max);
	}
}
