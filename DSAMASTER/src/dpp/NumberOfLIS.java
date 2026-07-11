package dpp;

public class NumberOfLIS {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] len = new int[n], count = new int[n];
        java.util.Arrays.fill(len, 1);
        java.util.Arrays.fill(count, 1);
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (len[j] + 1 > len[i]) { len[i] = len[j] + 1; count[i] = count[j]; }
                    else if (len[j] + 1 == len[i]) count[i] += count[j];
                }
            }
            maxLen = Math.max(maxLen, len[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) if (len[i] == maxLen) result += count[i];
        return result;
    }
}
