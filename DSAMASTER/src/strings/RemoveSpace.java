package strings;

public class RemoveSpace {
	public static void main(String[] args) {
		String str = "Java Programming Language";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result += str.charAt(i);
			}
		}
		System.out.println("Original String: " + str);
		System.out.println("After Removing Spaces: " + result);
	}
}
