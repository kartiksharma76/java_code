package DsaQuestions.uber;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, result);

        return result;
    }

    private static void backtrack(int[] nums, int index, List<List<Integer>> result) {

        // All positions are fixed
        if (index == nums.length) {

            List<Integer> permutation = new ArrayList<>();

            for (int num : nums) {
                permutation.add(num);
            }

            result.add(permutation);

            return;
        }

        // Try every remaining element
        for (int i = index; i < nums.length; i++) {

            // Choose
            swap(nums, index, i);

            // Explore
            backtrack(nums, index + 1, result);

            // Undo choice
            swap(nums, index, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);

        for (List<Integer> permutation : result) {

            System.out.println(permutation);
        }
    }
}