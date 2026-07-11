package twopointering;

import java.util.*;

public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> window = new HashSet<>();
        int left = 0, sum = 0, best = 0;
        for (int right = 0; right < nums.length; right++) {
            while (window.contains(nums[right])) {
                window.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            window.add(nums[right]);
            sum += nums[right];
            best = Math.max(best, sum);
        }
        return best;
    }
}
