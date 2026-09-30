package DsaQuestions.uber;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> dictionary = new HashSet<>(wordDict);

        int n = s.length();

        // dp[i] means:
        // first i characters can be segmented
        boolean[] dp = new boolean[n + 1];

        // Empty string can always be formed
        dp[0] = true;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] && dictionary.contains(s.substring(j, i))) {

                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        String s = "leetcode";

        List<String> wordDict = List.of("leet", "code");

        boolean result = wordBreak(s, wordDict);

        System.out.println("Can Word Break = " + result);
    }
}