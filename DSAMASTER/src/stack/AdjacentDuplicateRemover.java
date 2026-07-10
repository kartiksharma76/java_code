package stack;

import java.util.Stack;

class AdjacentDuplicateRemover {

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        String s1 = "abbaca";
        String s2 = "azxxzy";
        String s3 = "aabbcc";

        System.out.println(removeDuplicates(s1));
        System.out.println(removeDuplicates(s2));
        System.out.println(removeDuplicates(s3));
    }
}