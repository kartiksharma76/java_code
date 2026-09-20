package DsaQuestions.Flipkart;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingTwoStacks {
    private Deque<Integer> input;
    private Deque<Integer> output;

    public QueueUsingTwoStacks() {
        input = new ArrayDeque<>();
        output = new ArrayDeque<>();

    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.enqueue(40);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Is Empty: " + queue.isEmpty());
    }

    public void enqueue(int value) {
        input.push(value);
    }

    private void transfer() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }

    public int dequeue() {
        transfer();

        if (output.isEmpty()) {
            throw new RuntimeException("Queue is empty ");
        }
        return output.pop();
    }

    public int peek() {
        transfer();

        if (output.isEmpty()) {
            throw new RuntimeException("Queue is Empty ");
        }
        return output.peek();
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
