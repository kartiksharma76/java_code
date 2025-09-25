package Google.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheLargestWordInDictonary {
	public static boolean isSubSequence(String d, String s) {
		int i = 0, j = 0;
		while (i < d.length() && j < s.length()) {
			if (d.charAt(i) == s.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == d.length();
	}

	public static String LongestWord(List<String> d, String S) {
		String res = "";
		Collections.sort(d);
		for (String word : d) {

			if (isSubSequence(word, S) && word.length() > res.length()) {
				res = word;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		List<String> dict = Arrays.asList("ale", "apple", "monkey", "plea");
		String str = "abpcplea";
		System.out.println(LongestWord(dict, str));
	}
}
