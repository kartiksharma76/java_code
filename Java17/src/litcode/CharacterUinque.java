package litcode;

public class CharacterUinque {

	public int firstUniqChar(String s) {

		int[] count = new int[26];

		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i) - 'a'] == 1)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {

		CharacterUinque obj = new CharacterUinque();

		String str = "leetcode";

		int result = obj.firstUniqChar(str);

		System.out.println("First Unique Character Index: " + result);
	}
}