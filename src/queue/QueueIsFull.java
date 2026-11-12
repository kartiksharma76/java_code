package queue;

public class QueueIsFull {
    static int size = 5;
    static int rear = 4;

    static void isFull() {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        }else{
            System.out.println("Queue is Not Full");
        }
    }

    public static void main(String[] args) {
        isFull();
    }
}
