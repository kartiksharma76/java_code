package DsaQuestions.Walmart;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackQueuePriorityQueue {

    public static void main(String[] args) {

        // ---------------- STACK ----------------

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        System.out.println("Top = " + stack.peek());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Stack after pop = " + stack);


        // ---------------- QUEUE ----------------

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("\nQueue:");
        System.out.println("Front = " + queue.peek());
        System.out.println("Remove = " + queue.poll());
        System.out.println("Queue after remove = " + queue);


        // ------------ PRIORITY QUEUE ------------

        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("\nPriority Queue:");

        while (!priorityQueue.isEmpty()) {

            System.out.println(
                    priorityQueue.poll()
            );
        }
    }
}
