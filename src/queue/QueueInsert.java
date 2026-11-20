package queue;

public class QueueInsert {
    static int [] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int data){
        if (rear == queue.length - 1){
            System.out.println("Queue Overflow");
        }else{
            if (front == -1){
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println(data + "Inserted");
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
    }

}
