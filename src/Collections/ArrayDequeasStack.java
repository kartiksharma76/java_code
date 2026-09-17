package Collections;

import java.util.ArrayDeque;

public class ArrayDequeasStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
    }
}
