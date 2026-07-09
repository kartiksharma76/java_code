package recursion;

public class RecursiveAtoi {
	static int atoi(String str, int index) {
		if (index == str.length()) {
			return 0;
		}
		int digit = str.charAt(index) - '0';
		return digit * (int) Math.pow(10, str.length() - index - 1) + atoi(str, index + 1);

	}

	public static void main(String[] args) {
		String str = "1234";
		System.out.println(atoi(str, 0));
	}
}
