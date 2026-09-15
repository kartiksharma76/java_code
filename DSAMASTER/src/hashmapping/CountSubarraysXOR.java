package hashmapping;

import java.util.*;

// Count subarrays with given XOR
public class CountSubarraysXOR {
    public int countSubarraysWithXOR(int[] arr, int target) {
        Map<Integer, Integer> prefixXorCount = new HashMap<>();
        prefixXorCount.put(0, 1);
        int xorr = 0, count = 0;
        for (int n : arr) {
            xorr ^= n;
            count += prefixXorCount.getOrDefault(xorr ^ target, 0);
            prefixXorCount.merge(xorr, 1, Integer::sum);
        }
        return count;
    }
}
