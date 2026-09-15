package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Queue implementation backed by two stacks.
 * `inStack` accepts new elements. `outStack` serves dequeue/peek; whenever it
 * runs dry we dump all of `inStack` into it, reversing the order once.
 * Each element moves at most twice, so operations are amortized O(1).
 */
public class QueueUsingStacks implements MyQueue<Integer> {

    private final Deque<Integer> inStack = new ArrayDeque<>();
    private final Deque<Integer> outStack = new ArrayDeque<>();

    @Override
    public void enqueue(Integer item) {
        inStack.push(item);
    }

    private void transferIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    @Override
    public Integer dequeue() {
        transferIfNeeded();
        if (outStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return outStack.pop();
    }

    @Override
    public Integer peek() {
        transferIfNeeded();
        if (outStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return outStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    @Override
    public int size() {
        return inStack.size() + outStack.size();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeue: " + q.dequeue()); // 1
        q.enqueue(4);
        System.out.print("Remaining: ");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " "); // 2 3 4
        }
        System.out.println();
    }
}
