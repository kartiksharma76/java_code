package Stack;

public class StringCompression {
	public static String compressString(String S) {
		StringBuilder compressedStr = new StringBuilder();
		int count = 1;
		char prevChar = Character.toLowerCase(S.charAt(0));

		for (int i = 1; i < S.length(); i++) {
			char currentChar = Character.toLowerCase(S.charAt(i));

			if (currentChar == prevChar) {
				count++;
			} else {
				compressedStr.append(count).append(prevChar);
				count = 1;
				prevChar = currentChar;
			}
		}

		compressedStr.append(count).append(prevChar);
		return compressedStr.toString();
	}

	public static void main(String[] args) {
		String S = "aaABBb";
		String compressedString = compressString(S);
		System.out.println(compressedString); // Output: 3a3b
	}
}