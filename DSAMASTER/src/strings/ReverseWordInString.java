package strings;

public class ReverseWordInString {
	public static void main(String[] args) {

		String str = "the sky is blue";
		String[] words = str.trim().split("\\s+");

		StringBuilder result = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);

			if (i != 0) {
				result.append(" ");
			}
		}
		System.out.println("Reversed String :" + result);
	}
}
