package ArrayQuestion;

public class MissingAndRepeating {
	public static void main(String[] args) {
		int[] arr = { 2, 2 };
		int[] result = findMisssingAndRepeating(arr);
		System.out.println(" " + result[0] + " ," + result[1] + " ");
	}

	private static int[] findMisssingAndRepeating(int[] arr) {
		int n = arr.length;
		int[] freq = new int[n + 1];
		for (int num : arr) {
			freq[num]++;
		}
		int repeating = -1, missing = -1;
		for (int i = 1; i <= n; i++) {
			if (freq[i] == 2) {
				repeating = i;
			} else if (freq[i] == 0) {
				missing = i;
			}
		}
		return new int[] { repeating, missing };
	}
}
