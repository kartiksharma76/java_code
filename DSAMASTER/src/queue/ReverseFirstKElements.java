package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Reverses only the first K elements of a queue, keeping the rest in order.
 * Approach: push the first K into a stack (reversing them), pop them back
 * into the queue, then rotate the untouched remainder (size - k elements)
 * from front to back so overall order becomes [reversed-K][untouched-rest].
 */
public class ReverseFirstKElements {

    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k <= 0 || k > queue.size()) return queue;

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        // Move the remaining (already-in-order) elements to the back so the
        // reversed prefix stays at the front.
        int remaining = queue.size() - k;
        for (int i = 0; i < remaining; i++) {
            queue.offer(queue.poll());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) queue.offer(i);

        System.out.println("Before: " + queue);
        reverseFirstK(queue, 5);
        System.out.println("After reversing first 5: " + queue);
    }
}
