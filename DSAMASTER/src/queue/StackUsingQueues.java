package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack implementation backed by a single queue.
 * On push, the new element is enqueued and then rotated to the front of the
 * queue by dequeuing and re-enqueuing everything that was already there.
 * This makes push O(n) but pop/top O(1).
 */
public class StackUsingQueues implements MyStack<Integer> {

    private final Queue<Integer> queue = new LinkedList<>();

    @Override
    public void push(Integer item) {
        queue.offer(item);
        int rotations = queue.size() - 1;
        for (int i = 0; i < rotations; i++) {
            queue.offer(queue.poll());
        }
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.poll();
    }

    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top: " + stack.top()); // 3
        System.out.println("Pop: " + stack.pop()); // 3
        stack.push(4);
        System.out.print("Remaining (LIFO order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 4 2 1
        }
        System.out.println();
    }
}
