package stack;

import java.util.Stack;

public class InfixToPostfixConverter {

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

    // Function to convert infix to postfix
    public static String infixToPostfix(String exp) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Operator
            else {

                while (!stack.isEmpty()
                        && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String exp1 = "A+B*C";
        String exp2 = "(A+B)*C";
        String exp3 = "A+(B*C-D)/E";

        System.out.println(infixToPostfix(exp1));
        System.out.println(infixToPostfix(exp2));
        System.out.println(infixToPostfix(exp3));
    }
}
