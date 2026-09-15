package backtrackings;

public class CountSubsequencesSumK {
    public int countSubsequencesWithSumK(int[] arr, int k) {
        return solve(arr, 0, k);
    }
    private int solve(int[] arr, int idx, int target) {
        if (idx == arr.length) return target == 0 ? 1 : 0;
        int take = target >= arr[idx] ? solve(arr, idx + 1, target - arr[idx]) : 0;
        int notTake = solve(arr, idx + 1, target);
        return take + notTake;
    }
}
