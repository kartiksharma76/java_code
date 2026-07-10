package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    public static int[] nextSmaller(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 2, 25};

        int[] result = nextSmaller(arr);

        System.out.println(Arrays.toString(result));
    }
}