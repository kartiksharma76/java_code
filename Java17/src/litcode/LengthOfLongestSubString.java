package litcode;

import java.util.HashSet;

public class LengthOfLongestSubString {
	public static int lengthoflongestsubstring(String s) {
		int n = s.length();
		int maxlength = 0;
		int j = 0;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < n; i++) {// this is show to length sliding step by step
			while (set.contains(s.charAt(i))) {// this are show to sliding the duplicate character
				set.remove(s.charAt(j));
				j++;

			}
			set.add(s.charAt(i));// add new character and update max length
			maxlength = Math.max(maxlength, i - j + 1);
		}
		return maxlength;// then return the value
	} 

	public static void main(String[] args) {
		String input = "kartikkartiikkartikkartik";
		int length = lengthoflongestsubstring(input);
		System.out.println("length of longest substring :" + length);

	}
}