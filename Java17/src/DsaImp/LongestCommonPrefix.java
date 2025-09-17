package DsaImp;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return " ";

		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != c) {
					return strs[0].substring(0, i);
				}
			}

		}
		return strs[0];
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		System.out.println(longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
		System.out.println(longestCommonPrefix(new String[] { "apple", "ape", "april" }));
		System.out.println(longestCommonPrefix(new String[] { "a" }));
		System.out.println(longestCommonPrefix(new String[] {}));
		System.out.println(longestCommonPrefix(new String[] { "interspecies", "interstellar", "interstate" }));
	}
}
