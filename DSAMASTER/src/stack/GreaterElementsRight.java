package stack;

import java.util.Arrays;

public class GreaterElementsRight {

    public static int[] countGreaterElements(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};

        int[] result = countGreaterElements(arr);

        System.out.println(Arrays.toString(result));
    }
}