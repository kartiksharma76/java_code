package dpp;

public class LongestBitonicSubsequence {
    public int longestBitonicSubsequence(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n], lds = new int[n];
        java.util.Arrays.fill(lis, 1);
        java.util.Arrays.fill(lds, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) lis[i] = Math.max(lis[i], lis[j] + 1);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) lds[i] = Math.max(lds[i], lds[j] + 1);
            }
        }
        int best = 0;
        for (int i = 0; i < n; i++) best = Math.max(best, lis[i] + lds[i] - 1);
        return best;
    }
}
