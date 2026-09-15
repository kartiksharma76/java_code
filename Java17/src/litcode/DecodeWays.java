package litcode;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0')
            return 0;

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        dp[1] = 1; 

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        DecodeWays solution = new DecodeWays();

        // Test Case 1: Standard case
        // "226" -> "BZ" (2, 26), "VF" (22, 6), or "BBF" (2, 2, 6)
        System.out.println("Input: 226 | Expected: 3 | Result: " + solution.numDecodings("226"));

        // Test Case 2: Contains a zero that MUST be paired
        // "10" -> "J" (10). Cannot be "1, 0" because 0 isn't a letter.
        System.out.println("Input: 10  | Expected: 1 | Result: " + solution.numDecodings("10"));

        // Test Case 3: Invalid leading zero
        System.out.println("Input: 06  | Expected: 0 | Result: " + solution.numDecodings("06"));

        // Test Case 4: Larger string
        // "1111" -> 1,1,1,1 | 11,1,1 | 1,11,1 | 1,1,11 | 11,11
        System.out.println("Input: 1111| Expected: 5 | Result: " + solution.numDecodings("1111"));
    }
}