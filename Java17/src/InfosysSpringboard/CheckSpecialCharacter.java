package InfosysSpringboard;

class CheckSpecialCharacter {
	public static String moveSpecialCharacters(String str) {
		StringBuilder alphanumeric = new StringBuilder();
		StringBuilder special = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// Check if character is a letter or digit
			if (Character.isLetterOrDigit(ch)) {
				alphanumeric.append(ch);
			} else {
				special.append(ch);
			}
		}

		// Concatenate alphanumeric characters followed by special characters
		return alphanumeric.toString() + special.toString();
	}

	public static void main(String[] args) {
		String str = "He@#$llo!*&";
		System.out.println(moveSpecialCharacters(str));
	}
}