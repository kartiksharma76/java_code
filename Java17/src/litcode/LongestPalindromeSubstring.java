package litcode; // Declares the package name - organizes related classes

// Class to find the longest palindromic substring in a given string
public class LongestPalindromeSubstring {

	/**
	 * Main method to find the longest palindrome substring
	 * 
	 * @param s The input string to search in
	 * @return The longest palindromic substring
	 */
	public String longestPalindrome(String s) {

		// LINE 1: Check if input is null or empty - if so, return empty string
		if (s == null || s.length() < 1)
			return "";

		// LINE 2: Variables to track the start and end indices of the longest
		// palindrome found
		int start = 0; // Will store starting index of longest palindrome
		int end = 0; // Will store ending index of longest palindrome

		// LINE 3: Loop through each character as a potential center point
		for (int i = 0; i < s.length(); i++) {

			// LINE 4: Find odd-length palindrome with center at i (like "aba" - center at
			// 'b')
			int len1 = expand(s, i, i);

			// LINE 5: Find even-length palindrome with center between i and i+1 (like
			// "abba" - center between 'b's)
			int len2 = expand(s, i, i + 1);

			// LINE 6: Take the longer of the two palindromes found
			int len = Math.max(len1, len2); // Fixed: previously had Math.max(len2, len2)

			// LINE 7: If this palindrome is longer than our previously found one
			if (len > end - start) {

				// LINE 8: Calculate new start position
				// Formula: center - (length-1)/2
				// For "aba" with i=1, len=3: 1 - (3-1)/2 = 1 - 1 = 0
				start = i - (len - 1) / 2;

				// LINE 9: Calculate new end position
				// Formula: center + length/2
				// For "aba" with i=1, len=3: 1 + 3/2 = 1 + 1 = 2
				end = i + len / 2;
			}
		}

		// LINE 10: Return the substring from start to end (end+1 because substring end
		// is exclusive)
		return s.substring(start, end + 1);
	}

	/**
	 * Helper method that expands around a center to find palindrome length
	 * 
	 * @param s     The input string
	 * @param left  Left pointer starting position
	 * @param right Right pointer starting position
	 * @return Length of palindrome found
	 */
	private int expand(String s, int left, int right) {

		// LINE 11: Keep expanding while pointers are within bounds and characters match
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--; // LINE 12: Move left pointer further left (outward)
			right++; // LINE 13: Move right pointer further right (outward)
		}

		// LINE 14: Return the length of palindrome found
		// right - left - 1 gives the length because:
		// - After loop, left and right are one step beyond the palindrome boundaries
		// - Example: "aba", after loop left=-1, right=3
		// - Length = 3 - (-1) - 1 = 3
		return right - left - 1;
	}

	/**
	 * Main method to test the functionality This runs when you execute the program
	 */
	public static void main(String[] args) {

		// LINE 15: Create an instance of our class to use its methods
		LongestPalindromeSubstring solution = new LongestPalindromeSubstring();

		// LINE 16: Array of test cases to try
		String[] testCases = { "babad", // Test 1: Should return "bab" or "aba"
				"cbbd", // Test 2: Should return "bb"
				"a", // Test 3: Single character - returns itself
				"ac", // Test 4: No palindrome longer than 1 - returns "a" or "c"
				"racecar", // Test 5: Entire string is palindrome
				"abb", // Test 6: Should return "bb"
				"" // Test 7: Empty string - returns ""
		};

		// LINE 17: Print header
		System.out.println("Longest Palindromic Substring Results:");
		System.out.println("======================================");

		// LINE 18: Loop through each test case
		for (String test : testCases) {

			// LINE 19: Call our method to find longest palindrome
			String result = solution.longestPalindrome(test);

			// LINE 20: Print the input and output
			System.out.println("Input: \"" + test + "\" -> Output: \"" + result + "\"");
		}

	}
}