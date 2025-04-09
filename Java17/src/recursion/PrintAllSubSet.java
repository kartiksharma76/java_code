package recursion;

public class PrintAllSubSet {
	public static void printSubsets(String s, String current, int index) {
		if (index == s.length()) {
			System.out.println(current);
			return;
		}

		printSubsets(s, current + s.charAt(index), index + 1);

		printSubsets(s, current, index + 1);
	}

	public static void main(String[] args) {
		printSubsets("abc", "", 0);
	}
}
