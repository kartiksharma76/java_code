package stack;

import java.util.Stack;

public class MinStackDesign {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStackDesign() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop element
    public void pop() {

        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    // Top element
    public int top() {

        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    // Minimum element
    public int getMin() {

        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStackDesign stack = new MinStackDesign();

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        System.out.println("Minimum: " + stack.getMin());

        stack.pop();

        System.out.println("Minimum: " + stack.getMin());

        System.out.println("Top: " + stack.top());
    }
}