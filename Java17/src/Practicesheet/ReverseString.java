package Practicesheet;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Kartik ";
		String rev = " ";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
