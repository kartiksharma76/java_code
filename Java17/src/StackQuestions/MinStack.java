package StackQuestions;

import java.util.Stack;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    void push(int x) {

        st.push(x);

        if(minSt.isEmpty() || x <= minSt.peek()) {
            minSt.push(x);
        }
    }

    void pop() {

        if(st.peek().equals(minSt.peek())) {
            minSt.pop();
        }

        st.pop();
    }

    int getMin() {
        return minSt.peek();
    }

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(1);

        System.out.println(ms.getMin());

        ms.pop();

        System.out.println(ms.getMin());
    }
}