package stack;

import java.util.Stack;

public class RemoveKDigitsSolver {

    public static String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // Remove remaining digits from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the answer
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        // Remove leading zeros
        int index = 0;

        while (index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }

        String result = sb.substring(index);

        return result.isEmpty() ? "0" : result;
    }

    public static void main(String[] args) {

        String num1 = "1432219";
        int k1 = 3;

        String num2 = "10200";
        int k2 = 1;

        String num3 = "10";
        int k3 = 2;

        System.out.println(removeKdigits(num1, k1));
        System.out.println(removeKdigits(num2, k2));
        System.out.println(removeKdigits(num3, k3));
    }
}