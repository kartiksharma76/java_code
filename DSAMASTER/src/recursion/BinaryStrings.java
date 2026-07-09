package recursion;

public class BinaryStrings {
	static void generate(String str, int n) {

		if (str.length() == n) {
			System.out.println(str);
			return;
		}
		generate(str + "0", n);

		if (str.length() == 0 || str.charAt(str.length() - 1) != '1') {
			generate(str + "1", n);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		generate("", n);
	}
}
