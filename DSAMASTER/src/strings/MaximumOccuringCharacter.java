package strings;

public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		String str = "programming";
		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		int max = 0;
		char ch = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] > max) {
				max = freq[str.charAt(i)];
				ch = str.charAt(i);
			}
		}

		System.out.println("Maximum Occuring Character: " + ch);
		System.out.println("Frequency: " + max);
	}
}
