package StackQuestions;

import java.util.Stack;

class SpecialStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public SpecialStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        minStack.push(minStack.isEmpty() ? x : Math.min(x, minStack.peek()));
    }

    public int pop() {
        if (mainStack.isEmpty()) return -1;
        minStack.pop();
        return mainStack.pop();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public boolean isFull() {
        return false; // Assuming no capacity limit
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}
