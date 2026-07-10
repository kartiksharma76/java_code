package stack;

import java.util.Stack;

public class PrefixToInfixConverter {

    // Function to check operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Function to convert Prefix to Infix
    public static String prefixToInfix(String exp) {

        Stack<String> stack = new Stack<>();

        // Traverse from right to left
        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            }

            // Operator
            else if (isOperator(ch)) {

                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = "(" + op1 + ch + op2 + ")";

                stack.push(temp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        String exp1 = "*+AB-CD";
        String exp2 = "+A*BC";
        String exp3 = "*-A/BC-/AKL";

        System.out.println(prefixToInfix(exp1));
        System.out.println(prefixToInfix(exp2));
        System.out.println(prefixToInfix(exp3));
    }
}