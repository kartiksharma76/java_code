package array2026;

import java.util.Arrays;

public class RotateArray {

    public static void rotateRight(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void rotateLeft(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateRight(arr1, 2);
        System.out.println("Right Rotate by 2: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        rotateLeft(arr2, 2);
        System.out.println("Left Rotate by 2: " + Arrays.toString(arr2));
    }
}
