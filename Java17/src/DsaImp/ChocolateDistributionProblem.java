package DsaImp;

import java.util.Arrays;

public class ChocolateDistributionProblem {
	public static int findMinDiff(int[] arr, int m) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.length; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        System.out.println("Min Difference: " + findMinDiff(arr, m)); 
    }
}
