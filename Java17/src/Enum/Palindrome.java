package Enum;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";

		String rev = new StringBuilder(str).reverse().toString();

		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}