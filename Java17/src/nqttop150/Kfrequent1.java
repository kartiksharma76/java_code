package nqttop150;

public class Kfrequent1 {
	public static void main(String[] args) {
		int[] arr = { 7, 7 };
		int k = 1;
		int maxVal = 1000;

		int[] freq = new int[maxVal + 1];
		for (int num : arr) {
			freq[num]++;
		}
		int[][] pairs = new int[maxVal + 1][2];
		for (int i = 0; i < maxVal; i++) {
			pairs[i][0] = i;
			pairs[i][1] = freq[i];
		}
		for (int i = 0; i <= maxVal; i++) {
			for (int j = i + 1; j <= maxVal; j++) {
				if (pairs[i][1] < pairs[j][1]) {
					int[] temp = pairs[i];
					pairs[i] = pairs[j];
					pairs[j] = temp;
				}
			}
		}
		int count = 0;
		for (int i = 0; i <= maxVal && count < k; i++) {
			if (pairs[i][1] > 0) {
				System.out.print(pairs[i][0] + " ");
				count++;
			}
		}
	}
}
