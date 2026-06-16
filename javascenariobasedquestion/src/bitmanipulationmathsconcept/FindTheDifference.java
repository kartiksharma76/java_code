package bitmanipulationmathsconcept;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		int xor = 0;
		for (char c : s.toCharArray())
			xor ^= c;
		for (char c : t.toCharArray())
			xor ^= c;
		return (char) xor;
	}

	public static void main(String[] args) {
		FindTheDifference sol = new FindTheDifference();
		System.out.println(sol.findTheDifference("abcd", "abcde"));
	} 
}
