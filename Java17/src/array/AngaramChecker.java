package array;

import java.util.Arrays;

public class AngaramChecker {
	public static boolean isAngaram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);

	}

	public static void main(String[] args) {
		System.out.println(isAngaram("listen", "silent"));
		System.out.println(isAngaram("hello", "bello"));
		System.out.println(isAngaram("aab", "aba"));
	}
}
