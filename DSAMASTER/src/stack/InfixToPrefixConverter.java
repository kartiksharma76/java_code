package stack;

import java.util.Stack;

public class InfixToPrefixConverter {

    // Function to return precedence of operators
    public static int precedence(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    // Reverse the infix expression
    public static String reverse(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            if (ch == '(')
                sb.append(')');
            else if (ch == ')')
                sb.append('(');
            else
                sb.append(ch);
        }

        return sb.toString();
    }

    // Convert reversed infix to postfix
    public static String infixToPostfix(String exp) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {

                result.append(ch);
            }

            else if (ch == '(') {

                stack.push(ch);
            }

            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {

                while (!stack.isEmpty()
                        && precedence(ch) < precedence(stack.peek())) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Main conversion function
    public static String infixToPrefix(String exp) {

        String reversed = reverse(exp);

        String postfix = infixToPostfix(reversed);

        return reverse(postfix);
    }

    public static void main(String[] args) {

        String exp1 = "(A-B/C)*(A/K-L)";
        String exp2 = "A+B*C";
        String exp3 = "(A+B)*(C-D)";

        System.out.println(infixToPrefix(exp1));
        System.out.println(infixToPrefix(exp2));
        System.out.println(infixToPrefix(exp3));
    }
}