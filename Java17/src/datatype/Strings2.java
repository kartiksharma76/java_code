package datatype;

public class Strings2 {
	public static void main(String[] args) {
		// compare
		String sentence = "my name is kartikey";

		String name = sentence.substring(11, sentence.length());
		String name1 = sentence.substring(3);
		System.out.println(name);
		System.out.println(name1);
	}
}