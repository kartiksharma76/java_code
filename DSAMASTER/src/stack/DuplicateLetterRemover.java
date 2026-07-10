package stack;

import java.util.Stack;

public class DuplicateLetterRemover {

    public static String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];

        // Store the last occurrence of every character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (visited[ch - 'a']) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && lastIndex[stack.peek() - 'a'] > i) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        String s1 = "bcabc";
        String s2 = "cbacdcbc";

        System.out.println(removeDuplicateLetters(s1));
        System.out.println(removeDuplicateLetters(s2));
    }
}