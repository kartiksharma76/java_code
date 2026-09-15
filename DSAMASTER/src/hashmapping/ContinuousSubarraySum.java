package hashmapping;

import java.util.*;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remFirstIndex = new HashMap<>();
        remFirstIndex.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = k == 0 ? sum : sum % k;
            if (remFirstIndex.containsKey(rem)) {
                if (i - remFirstIndex.get(rem) > 1) return true;
            } else {
                remFirstIndex.put(rem, i);
            }
        }
        return false;
    }
}
