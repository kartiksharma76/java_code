package DsaQuestions.Hardestproblem;

import java.util.*;

public class CountSmallerNumbers {

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        int r = 0;

        for (int x : sorted) {
            if (!rank.containsKey(x)) {
                rank.put(x, ++r);
            }
        }

        int[] bit = new int[r + 1];
        Integer[] answer = new Integer[n];

        for (int i = n - 1; i >= 0; i--) {
            int index = rank.get(nums[i]);

            answer[i] = query(bit, index - 1);
            update(bit, index);
        }

        return Arrays.asList(answer);
    }

    static void update(int[] bit, int i) {
        while (i < bit.length) {
            bit[i]++;
            i += i & -i;
        }
    }

    static int query(int[] bit, int i) {
        int sum = 0;

        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};

        System.out.println(countSmaller(nums));
        // Output: [2, 1, 1, 0]
    }
}