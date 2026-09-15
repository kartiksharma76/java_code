package DsaImp;
/**
 * Index: 0 1 2 3 4 5 6
Char:  A A B A B B A

left=0, right=0 → "A" → changes=1-1=0 <=1 → maxLength=1
left=0, right=1 → "AA" → changes=2-2=0 <=1 → maxLength=2
left=0, right=2 → "AAB" → changes=3-2=1 <=1 → maxLength=3
left=0, right=3 → "AABA" → changes=4-3=1 <=1 → maxLength=4
left=0, right=4 → "AABAB" → changes=5-3=2 >1 → INVALID → move left to 1
left=1, right=4 → "ABAB" → changes=4-2=2 >1 → INVALID → move left to 2
left=2, right=4 → "BAB" → changes=3-2=1 <=1 → maxLength=4 (still)
left=2, right=5 → "BABB" → changes=4-3=1 <=1 → maxLength=4
left=2, right=6 → "BABBA" → changes=5-3=2 >1 → move left to 3
left=3, right=6 → "ABBA" → changes=4-2=2 >1 → move left to 4
left=4, right=6 → "BBA" → changes=3-2=1 <=1 → maxLength=4 (unchanged)

final Answer = 4
 */
public class LongestRepeatingCharacterReplacement {
	public static int characterReplacemnt(String s, int k) {
		int[] count = new int[26];
		int maxcount = 0;
		int maxLength = 0;
		int left = 0;

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			count[c - 'A']++;
			maxcount = Math.max(maxcount, count[c - 'A']);

			while ((right - left + 1) - maxcount > k) {
				count[s.charAt(left) - 'A']--;
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;

	}

	public static void main(String[] args) {
		System.out.println(characterReplacemnt("AABABBA", 1));
	}
}
