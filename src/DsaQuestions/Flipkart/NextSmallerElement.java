package DsaQuestions.Flipkart;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextSmallerElement {
    public static int[] findNextSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int[] result = findNextSmaller(arr);
        System.out.println("Next Smaller Elements: " + Arrays.toString(result)
        );
    }
}
