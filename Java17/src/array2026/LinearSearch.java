package array2026;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 30, 45 };
		int key = 30;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Found at index: " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("not found");
		}
	}
}
