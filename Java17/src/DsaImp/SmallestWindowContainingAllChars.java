package DsaImp;

/**
 * requiredChars = {'a','b','c'} → requiredCount = 3

right=0 → 'a' → window: {a:1} → size=1 < 3 → continue
right=1 → 'a' → window: {a:2} → size=1 < 3 → continue
right=2 → 'b' → window: {a:2, b:1} → size=2 < 3 → continue
right=3 → 'c' → window: {a:2, b:1, c:1} → size=3 == 3 →  valid!

→ length = 4 (indices 0-3 → "aabc") → minLen=4, resultStart=0
→ try shrink:
left=0 → 'a' → window: {a:1, b:1, c:1} → still valid → length=3 → update minLen=3, resultStart=1
left=1 → 'a' → window: {a:0 → remove 'a'} → now window: {b:1,c:1} → size=2 → break

right=4 → 'b' → window: {b:2,c:1} → size=2 → continue
right=5 → 'c' → window: {b:2,c:2} → size=2 → continue
right=6 → 'd' → ignore → window unchanged
right=7 → 'b' → window: {b:3,c:2} → size=2 → continue
right=8 → 'c' → window: {b:3,c:3} → size=2 → continue
right=9 → 'a' → window: {b:3,c:3,a:1} → size=3 →  valid!

→ length = 9-9+1? Wait — let's track properly.

Actually — from left=2 to right=9 → "bcdbca" → length=8 → not better than 3.

But wait — we missed a smaller window!

Actually — at right=5 → "aabcbc" — but we already had "abc" at index 2-4 → "b c" — no 'a'

Let’s trace properly with code logic...

 Correct smallest window is "bca" at indices 7-9? No — "cdbca" — too long.

Actually — "b c a" at indices 2,3,9? Not contiguous.

Wait — let's run code:

At right=3 → window [0-3] = "aabc" → shrink to [1-3] = "abc" → length=3 → 

Then later — at right=9 → 'a' added → window becomes valid again → [left=2 to 9] — "bcbcdbca" — length=8 → not better.

So answer = "abc" → indices 1-3 → substring = "abc"

But in string "aabcbcdbca" — "abc" appears at index 1-3 → "a a b c ..." → s.substring(1,4) = "abc"

 So output = "abc" — length 3

But earlier I thought "dbca" — that was wrong — because "abc" is smaller!
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestWindowContainingAllChars {
	public static String smallestWindow(String s, String pattern) {
		if (s == null || pattern == null || s.length() == 0 || pattern.length() == 0) {
			return " ";
		}

		Set<Character> requiredChars = new HashSet<>();
		for (char c : pattern.toCharArray()) {
			requiredChars.add(c);
		}
		int requiredCount = requiredChars.size();
		Map<Character, Integer> windowCharCount = new HashMap<>();
		int left = 0;
		int minLen = Integer.MAX_VALUE;
		int resultStart = 0;
		for (int right = 0; right < s.length(); right++) {
			char rightChar = s.charAt(right);

			if (requiredChars.contains(rightChar)) {
				windowCharCount.put(rightChar, windowCharCount.getOrDefault(rightChar, 0) + 1);

			}
			while (windowCharCount.size() == requiredCount) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					resultStart = left;
				}

				char leftChar = s.charAt(left);
				if (requiredChars.contains(leftChar)) {
					windowCharCount.put(leftChar, windowCharCount.get(leftChar) - 1);
					if (windowCharCount.get(leftChar) == 0) {
						windowCharCount.remove(leftChar);

					}

				}
				left++;
			}

		}
		return minLen == Integer.MAX_VALUE ? " " : s.substring(resultStart, resultStart + minLen);
	}

	public static void main(String[] args) {
		System.out.println(smallestWindow("aabcbcdbca", "abc"));
	}
}
