package twopointering;

// Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
public class SubarraysSizeKAvgThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int targetSum = k * threshold;
        int sum = 0, count = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        if (sum >= targetSum) count++;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum >= targetSum) count++;
        }
        return count;
    }
}
