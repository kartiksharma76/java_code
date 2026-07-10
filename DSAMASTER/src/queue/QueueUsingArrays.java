package queue;

/**
 * Queue implementation backed by a fixed-capacity circular array.
 * front/rear wrap around using modulo arithmetic so enqueue/dequeue are O(1)
 * and previously used slots get reused.
 */
public class QueueUsingArrays implements MyQueue<Integer> {

    private final int[] data;
    private final int capacity;
    private int front;
    private int rear;
    private int count;

    public QueueUsingArrays(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    @Override
    public void enqueue(Integer item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = item;
        count++;
    }

    @Override
    public Integer dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = data[front];
        front = (front + 1) % capacity;
        count--;
        return value;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
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
        QueueUsingArrays q = new QueueUsingArrays(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // reuses the slot freed by the earlier dequeue
        System.out.print("Remaining: ");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();
    }
}
