package queue;

/**
 * Queue implementation backed by a singly linked list.
 * Enqueue appends at the tail, dequeue removes from the head — both O(1).
 */
public class QueueUsingLinkedList implements MyQueue<Integer> {

    private static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    private Node head;
    private Node tail;
    private int count;

    @Override
    public void enqueue(Integer item) {
        Node node = new Node(item);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    @Override
    public Integer dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = head.val;
        head = head.next;
        if (head == null) tail = null;
        count--;
        return value;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.val;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        q.enqueue(4);
        System.out.print("Remaining: ");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();
    }
}
