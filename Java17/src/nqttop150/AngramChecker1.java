package nqttop150;

import java.util.Arrays;

public class AngramChecker1 {
	public static void main(String[] args) {
		String s = "jar";
		String t = "jam";
		System.out.println(duplicate(s, t));
	}

	private static boolean duplicate(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return Arrays.equals(sArray, tArray);
	}
}
