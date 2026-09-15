package strings;

public class FirstLetterOfEveryWord {
	public static void main(String[] args) {
		String str = "Java Programming Language";

		System.out.print("First Letters: ");
		System.out.print(str.charAt(0) + " ");

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == ' ') {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
}
