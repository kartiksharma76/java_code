package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanCalculator {

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        // Stack stores indices
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] result = calculateSpan(prices);

        System.out.println(Arrays.toString(result));
    }
}