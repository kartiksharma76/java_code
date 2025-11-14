package litcode;

public class MissingWord {
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");

		}
		System.out.println(sb.toString().trim());
	}
}
