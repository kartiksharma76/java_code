package string;

public class CharacterReplacement {
	public int characterReplacement(String s, int k) {
		int[] count = new int[26];
		int left = 0, maxCount = 0, result = 0;

		for (int right = 0; right < s.length(); right++) {
			maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
			while ((right - left + 1) - maxCount > k)
				count[s.charAt(left++) - 'A']--;
			result = Math.max(result, right - left + 1);

		}
		return result;
	}

	public static void main(String[] args) {
		CharacterReplacement sol = new CharacterReplacement();
		System.out.println(sol.characterReplacement("AABABBA", 1));//4
	}
}
