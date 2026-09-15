package arrays;

public class MajorityElement1 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 1, 1, 2, 2, 2 };

		int candidate = 0;
		int count = 0;

		// Find candidate
		for (int num : arr) {

			if (count == 0) {
				candidate = num;
			}

			if (num == candidate) {
				count++;
			} else {
				count--;
			}
		}

		// Verify candidate
		count = 0;

		for (int num : arr) {
			if (num == candidate) {
				count++;
			}
		}

		if (count > arr.length / 2) {
			System.out.println("Majority Element: " + candidate);
		} else {
			System.out.println("No Majority Element");
		}
	}
}