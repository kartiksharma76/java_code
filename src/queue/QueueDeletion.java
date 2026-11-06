package queue;

public class QueueDeletion {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void dequeue(){
        if (front == -1 || front > rear){
            System.out.println("Queue Underflow");
        }else {
            System.out.println("Deleted: " + queue[front]);
            front++;
            if (front > rear){
                front = rear -1;
            }
        }

    }

    public static void main(String[] args) {
        queue[++rear] = 10;
        front = 0;
        queue[++rear] = 20;
        queue[++rear] = 30;

        dequeue();
    }
}
