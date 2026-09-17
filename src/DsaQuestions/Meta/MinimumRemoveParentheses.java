package DsaQuestions.Meta;

import java.util.ArrayDeque;

public class MinimumRemoveParentheses {
    public static String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    str.setCharAt(i, '#');
                }
            }
        }
        while (!stack.isEmpty()) {
            str.setCharAt(stack.pop(), '#');
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        String result = minRemoveToMakeValid(s);
        System.out.println(result);
    }
}
