package litcode;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {

		s = s.trim();

		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) == ' ')
				break;

			count++;
		}

		return count;
	}

	public static void main(String[] args) {

		LengthOfLastWord obj = new LengthOfLastWord();

		String str = "Hello World";

		int result = obj.lengthOfLastWord(str);

		System.out.println("Length of last word: " + result);
	}
}