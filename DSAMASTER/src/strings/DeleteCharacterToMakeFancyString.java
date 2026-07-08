package strings;

public class DeleteCharacterToMakeFancyString {
	public static void main(String[] args) {
		String s = "leetcode";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int len = result.length();

			if (len >= 2 && result.charAt(len - 1) == s.charAt(i) && result.charAt(len - 2) == s.charAt(i)) {
				continue;
			}
			result.append(s.charAt(i));

		}
		System.out.println("Fancy String :" + result);
	}
}
