package javaDsaPattern;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagaram(String s1, String s2) {
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);

	}

	public static void main(String[] args) {
		System.out.println(isAnagaram("listen", "silent"));
	}
}
