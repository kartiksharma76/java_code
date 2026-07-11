package hashmapping;

import java.util.*;

public class SubarraySumsDivByK {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remCount = new int[k];
        remCount[0] = 1;
        int sum = 0, count = 0;
        for (int n : nums) {
            sum += n;
            int rem = ((sum % k) + k) % k;
            count += remCount[rem];
            remCount[rem]++;
        }
        return count;
    }
}
