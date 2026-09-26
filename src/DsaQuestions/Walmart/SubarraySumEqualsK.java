package DsaQuestions.Walmart;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixMap = new HashMap<>();

        // Sum 0 has occurred once
        prefixMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // Check if required previous prefix exists
            int required = prefixSum - k;

            if (prefixMap.containsKey(required)) {
                count += prefixMap.get(required);
            }

            // Store current prefix sum
            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};

        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Number of Subarrays = " + result);
    }
}