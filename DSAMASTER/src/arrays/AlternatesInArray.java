package arrays;

public class AlternatesInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Alternate Elements:");

		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}

	}
}
