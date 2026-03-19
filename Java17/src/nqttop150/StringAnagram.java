package nqttop150;

import java.util.Arrays;

public class StringAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] sSort = s.toCharArray();
		char[] tSort = t.toCharArray();

		Arrays.sort(sSort);
		Arrays.sort(tSort);

		return Arrays.equals(sSort, tSort);
	}

	public static void main(String[] args) {
		StringAnagram obj = new StringAnagram();

		String s = "listen";
		String t = "silent";

		if (obj.isAnagram(s, t)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}