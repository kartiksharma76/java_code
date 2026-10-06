package DsaQuestions.GoldmanSachs;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            //odd length palindrome
            int oddLength = expandFromCenter(s, i, i);

            // even length palindrome
            int evenLength = expandFromCenter(s, i, i + 1);
            int length = Math.max(oddLength, evenLength);

            if (length > end - start + 1) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println("Longest Palindromic subString = " + result);
    }
}
