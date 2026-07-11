package backtrackings;

public class CheckSubsequenceSumK {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        return solve(arr, 0, k);
    }
    private boolean solve(int[] arr, int idx, int target) {
        if (target == 0) return true;
        if (idx == arr.length) return false;
        return solve(arr, idx + 1, target - arr[idx]) || solve(arr, idx + 1, target);
    }
}
