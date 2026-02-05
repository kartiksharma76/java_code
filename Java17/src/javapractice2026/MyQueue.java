package javapractice2026;

public class MyQueue {

    int max = 5;
    int front = -1;
    int rear = -1;
    int[] arr = new int[max];

    /*
     * ALGORITHM : ENQUEUE
     * 1. Agar rear == max - 1 ho to Queue Overflow
     * 2. Agar front == -1 ho to front = 0
     * 3. rear = rear + 1
     * 4. arr[rear] = value
     */

    public void enqueue(int value) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        arr[++rear] = value;
        System.out.println(value + " inserted");
    }

    /*
     * ALGORITHM : DEQUEUE
     * 1. Agar front == -1 ya front > rear ho to Queue Underflow
     * 2. arr[front] delete karo
     * 3. front = front + 1
     */

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " deleted");
        front++;
    }

    /*
     * ALGORITHM : PEEK
     * 1. Agar queue empty ho to message print karo
     * 2. Warna arr[front] print karo
     */

    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    /*
     * ALGORITHM : ISEMPTY
     * 1. Agar front == -1 ya front > rear ho to true return karo
     * 2. Warna false return karo
     */

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    /*
     * ALGORITHM : DISPLAY
     * 1. Agar queue empty ho to message print karo
     * 2. front se rear tak loop chalao
     * 3. Har element print karo
     */

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}
