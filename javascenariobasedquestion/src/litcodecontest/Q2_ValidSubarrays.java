package litcodecontest;

class Q2_ValidSubarrays {

    /*
     * Problem Statement:
     *
     * You are given an integer array nums and an integer x.
     *
     * A subarray is considered valid if:
     * 1. The first digit of the subarray sum is x.
     * 2. The last digit of the subarray sum is x.
     *
     * Return the total number of valid subarrays.
     *
     * Example:
     *
     * Input:
     * nums = [1, 100, 1]
     * x = 1
     *
     * Subarray Sums:
     * [1]       -> 1   
     * [1,100]   -> 101 
     * [1,100,1] -> 102 
     * [100]     -> 100 
     * [100,1]   -> 101 
     * [1]       -> 1   
     *
     * Output:
     * 4
     */

    // Returns first digit of a number
    public static int getFirstDigit(long num) {

        while (num >= 10) {
            num /= 10;
        }

        return (int) num;
    }

    // Returns last digit of a number
    public static int getLastDigit(long num) {

        return (int) (num % 10);
    }

    // Counts valid subarrays
    public static int countValidSubarrays(int[] nums, int x) {

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            long sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums[j];

                int firstDigit = getFirstDigit(sum);
                int lastDigit = getLastDigit(sum);

                if (firstDigit == x && lastDigit == x) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 100, 1};
        int x = 1;

        int result = countValidSubarrays(nums, x);

        System.out.println("Valid Subarrays = " + result);
    }
}