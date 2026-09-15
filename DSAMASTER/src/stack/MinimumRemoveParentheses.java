package stack;

import java.util.Stack;

public class MinimumRemoveParentheses {

    public static String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        // Find invalid parentheses
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } 
            else if (ch == ')') {

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    remove[i] = true;
                }
            }
        }

        // Remaining '(' are invalid
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s1 = "lee(t(c)o)de)";
        String s2 = "a)b(c)d";
        String s3 = "))((";

        System.out.println(minRemoveToMakeValid(s1));
        System.out.println(minRemoveToMakeValid(s2));
        System.out.println(minRemoveToMakeValid(s3));
    }
}