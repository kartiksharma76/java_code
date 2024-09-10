package datatype;

public class Stringcompare {
	public static void main(String[] args) {
		String name1 = "harsh ";
		String name2 = "harsh";

		// 1 s1>s2:+value
		// 2 s1==s2:0
		// 3 s1<s2:- ve value

		if (name1.contains(name2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");

		}
		if (name1 == name2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		if (new String("harsh") == new String("harsh")) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not eqaul");
		}
	}
}