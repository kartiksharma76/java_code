package greedyapproach;

import java.util.*;

public class MaximizeSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) arr[i] = nums[i];
        Arrays.sort(arr, (a, b) -> Math.abs(b) - Math.abs(a));
        for (int i = 0; i < arr.length && k > 0; i++) {
            if (arr[i] < 0) { arr[i] = -arr[i]; k--; }
        }
        int sum = 0;
        for (int v : arr) sum += v;
        if (k % 2 == 1) sum -= 2 * arr[arr.length - 1];
        return sum;
    }
}
