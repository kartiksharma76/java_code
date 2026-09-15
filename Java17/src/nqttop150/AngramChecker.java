package nqttop150;

import java.util.Arrays;

public class AngramChecker {
	public static void main(String[] args) {
		String s = "racecar";
		String t = "carrace";

		boolean result = setAngramresult(s, t);
		System.out.println(result);

	}

	private static boolean setAngramresult(String s, String t) {
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