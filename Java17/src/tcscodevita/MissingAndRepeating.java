package tcscodevita;

public class MissingAndRepeating {
	public static void main(String[] args) {
		int[] arr = { 2, 2 };
		int[] result = findMissingRepeating(arr);
		System.out.println(" " + result[0] + " " + result[1] + " ");
	}

	private static int[] findMissingRepeating(int[] arr) {
		int n = arr.length;
		int[] freq = new int[n + 1];
		for (int num : arr) {
			freq[num]++;

		}
		int repeating = -1;
		int messing = -1;

		for (int i = 1; i <= n; i++) {
			if (freq[i] == 2) {
				repeating = i;

			} else if (freq[i] == 0) {
				messing = i;
			}

		}
		return new int[] { repeating, messing };
	}
}
