package stack;

import java.util.Stack;

public class RecursiveStackSorter {

    // Insert an element into the sorted stack
    public static void sortedInsert(Stack<Integer> stack, int value) {

        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        sortedInsert(stack, value);

        stack.push(top);
    }

    // Sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sortStack(stack);

        sortedInsert(stack, top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(3);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}