package StringPrograms;

public class QueueEx {
    int[] arr = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    public static void main(String[] args) {
        QueueEx q = new QueueEx();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();
        q.peek();

        q.dequeue();

        q.display();
    }

    public void enqueue(int value) {
        if (size == arr.length) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            size++;
            System.out.println(value + "inserted");
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front] + "removed");
            front = (front + 1) % arr.length;
            size--;
        }
    }

    public void peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("front element :" + arr[front]);
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[(front + i) % arr.length]);
            }
        }
    }

}
