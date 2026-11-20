package queue;

public class QueueIsEmpty {
    static int front = -1;
    static int rear = -1;

    static  void isEmpty() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Queue is Not Empty");
        }
    }

    public static void main(String[] args) {
        isEmpty();
    }
}
