package litcode;

public class Handlepattern {
	 public boolean isMatch(String s, String p) {
	        int m = s.length();
	        int n = p.length();
	        boolean[][] dp = new boolean[m + 1][n + 1];
	        dp[0][0] = true;

	        for (int i = 1; i <= n; i++) {
	            if (p.charAt(i - 1) == '*' && i >= 2) {
	                dp[0][i] = dp[0][i - 2];
	            }
	        }

	        for (int j = 1; j <= m; j++) {
	            for (int i = 1; i <= n; i++) {
	                char sc = s.charAt(j - 1);
	                char pc = p.charAt(i - 1);

	                if (pc == '.' || pc == sc) {
	                    dp[j][i] = dp[j - 1][i - 1];
	                } else if (pc == '*') {
	                    dp[j][i] = dp[j][i - 2]; // '*' counts as 0
	                    char prev = p.charAt(i - 2);
	                    if (prev == '.' || prev == sc) {
	                        dp[j][i] = dp[j][i] || dp[j - 1][i]; // '*' counts as ≥1
	                    }
	                }
	            }
	        }

	        return dp[m][n];
	    }

	public static void main(String[] args) {
		Handlepattern sol = new Handlepattern();
		System.out.println(sol.isMatch("aa", "a"));
		System.out.println(sol.isMatch("aa", "a*"));
		System.out.println(sol.isMatch("ab", ".*"));
		System.out.println(sol.isMatch("mississippi", "mis*is*p*."));
	}
}
