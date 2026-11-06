package queue;

public class QueueDisplay {
    static int[] queue = {10, 20, 30};
    static int front = 0;
    static int rear = 2;

    static  void display(){
        if (front == -1){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++){
            System.out.println(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        display();
    }
}
