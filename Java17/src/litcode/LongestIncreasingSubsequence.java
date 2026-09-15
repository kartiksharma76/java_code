package litcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    
    // Dynamic Programming Solution - O(n²) time complexity
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        
        int maxLen = 1;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        
        return maxLen;
    }
    
    // Optimized Solution with Binary Search - O(n log n) time complexity
    public int lengthOfLISOptimized(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] tails = new int[nums.length];
        int size = 0;
        
        for (int num : nums) {
            int left = 0, right = size;
            
            // Binary search for the position to replace
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            
            tails[left] = num;
            if (left == size) {
                size++;
            }
        }
        
        return size;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

        // Test Case 1: Standard case
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Test 1 (Expected: 4): " + lis.lengthOfLIS(nums1));
        // LIS: [2, 3, 7, 101] or [2, 3, 7, 18]

        // Test Case 2: All increasing
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Test 2 (Expected: 5): " + lis.lengthOfLIS(nums2));

        // Test Case 3: All decreasing
        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println("Test 3 (Expected: 1): " + lis.lengthOfLIS(nums3));

        // Test Case 4: Single element
        int[] nums4 = {1};
        System.out.println("Test 4 (Expected: 1): " + lis.lengthOfLIS(nums4));

        // Test Case 5: Empty array
        int[] nums5 = {};
        System.out.println("Test 5 (Expected: 0): " + lis.lengthOfLIS(nums5));

        // Test Case 6: Duplicate elements
        int[] nums6 = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        System.out.println("Test 6 (Expected: 6): " + lis.lengthOfLIS(nums6));
        // LIS: [1, 3, 6, 7, 9, 10]

        // Test Case 7: Verify optimized solution matches DP solution
        int[] nums7 = {0, 1, 0, 3, 2, 3};
        int dpResult = lis.lengthOfLIS(nums7);
        int optimizedResult = lis.lengthOfLISOptimized(nums7);
        System.out.println("Test 7 DP (Expected: 4): " + dpResult);
        System.out.println("Test 7 Optimized (Expected: 4): " + optimizedResult);
        System.out.println("Both solutions match: " + (dpResult == optimizedResult));
    }
}