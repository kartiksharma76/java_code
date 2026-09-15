package strings;

public class ValidAnagram {

	public static void main(String[] args) {

		String s = "listen";
		String t = "silent";

		if (s.length() != t.length()) {
			System.out.println("Not an Anagram");
			return;
		}

		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
			freq[t.charAt(i) - 'a']--;
		}

		for (int count : freq) {
			if (count != 0) {
				System.out.println("Not an Anagram");
				return;
			}
		}

		System.out.println("Valid Anagram");
	}
}