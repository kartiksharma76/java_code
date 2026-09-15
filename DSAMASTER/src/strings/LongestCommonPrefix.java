package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };

		if (strs.length == 0) {
			System.out.println("");
			return;
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {

			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					System.out.println("Longest Common Prefix: ");
					return;
				}
			}
		}

		System.out.println("Longest Common Prefix: " + prefix);
	}
}