package queue;

public class QueuePeek {
    static int[] queue = {10, 20, 30};
    static int front = 0;
    static int rear = 2;

    static void peek(){
        if (front == -1){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Front: " + queue[front]);
        }
    }

    public static void main(String[] args) {
        peek();
    }

}
