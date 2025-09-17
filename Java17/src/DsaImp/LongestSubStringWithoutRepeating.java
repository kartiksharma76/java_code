package DsaImp;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * abcabcbb find the sub sting that can not be repeating output is 3 because the
 * longest sub string is abc
 * 
 * here we are taken the input string S are defined ("String s = abcabcbb") in
 * here we can find the longest sub string then
 * IntStream.range(0,s.length().map(...)max().orElse(0))
 * 
 * Step 1: IntStream.range(0, s.length()) this can start form 0 to s.length()-1
 * that can index to generate example : "abcabcbb" -> index: 0,1,2,3,4,5,6,7
 * 
 * Step 2: .map(i -> { ... }) every index to find a single function that acn
 * explain if start form i to how can repeat a character Set<Character> seen =
 * new HashSet<>(); int j = i; while (j < s.length() && seen.add(s.charAt(j))) {
 * j++; } return j - i;
 * 
 * Set<Character> seen = new HashSet<>(); this is empty set that can track to
 * how many character has come
 * 
 * j — This will start at i and move forward — finding the last index of the
 * substring. while (j < s.length() && seen.add(s.charAt(j))) This loop will run
 * until: j is inside the string (j < s.length()) and s.charAt(j) — is a new
 * character — not previously encountered in the seen set. seen.add(c) — This
 * returns true if c is new to the set — false otherwise.
 * 
 * j++; If the character is unique — increment j — move on! return j - i; This
 * tells you how many characters you've added, starting at i — without
 * repetition. That is, the length of that substring. Example: i=0 → j will
 * increment: a → b → c → a? → a repeated → loop stopped → j=3 → 3 - 0 = 3 i=1 →
 * b → c → a → b? → b repeated → j=4 → 4 - 1 = 3 i=3 → a → b → c? → c not found?
 * → b will repeat anyway → j=5 → 5 - 3 = 2
 * 
 * Step 3: .max() Now we have — for every i — the length of the unique
 * substrings starting from it. .max() — chooses the longest length among these.
 * Example: [3, 3, 3, 2, 2, 1, 1, 1] → max = 3
 * 
 * Step 4: .orElse(0) If the string is empty—max() will return nothing—return 0.
 * Line 9: System.out.println(...) Print only the result—the length of the
 * longest unique substring.
 * 
 */
public class LongestSubStringWithoutRepeating {
	public static void main(String[] args) {
		String s = "abcabcbb";
		int longest = IntStream.range(0, s.length()).map(i -> {
			Set<Character> seen = new HashSet<>();
			int j = i;
			while (j < s.length() && seen.add(s.charAt(j))) {
				j++;
			}
			return j - i;
		}).max().orElse(0);
		System.out.println("Longest Sub String is:" + longest);
	}
}
