package Collections;

import java.util.ArrayDeque;

public class ArrayDequeasQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());
    }
}
