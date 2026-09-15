package hashmapping;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexOf = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (indexOf.containsKey(need)) return new int[]{indexOf.get(need), i};
            indexOf.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
