package stack;

import java.util.Stack;

public class PostfixToPrefixConverter {

    // Function to check whether a character is an operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Function to convert Postfix to Prefix
    public static String postfixToPrefix(String exp) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            }

            // Operator
            else if (isOperator(ch)) {

                String operand2 = stack.pop();
                String operand1 = stack.pop();

                String temp = ch + operand1 + operand2;

                stack.push(temp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        String exp1 = "AB+C*";
        String exp2 = "ABC*+";
        String exp3 = "ABC/-AK/L-*";

        System.out.println(postfixToPrefix(exp1));
        System.out.println(postfixToPrefix(exp2));
        System.out.println(postfixToPrefix(exp3));
    }
}