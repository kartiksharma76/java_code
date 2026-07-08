package strings;

public class MaximumNestingDepthParentheses {

    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";

        int currentDepth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                currentDepth++;

                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } 
            else if (ch == ')') {
                currentDepth--;
            }
        }

        System.out.println("Maximum Nesting Depth: " + maxDepth);
    }
}