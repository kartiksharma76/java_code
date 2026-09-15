package queue;

public class MinQueueTest {
public static void main(String[] args) {
	MinQueue queue=new MinQueue();
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.enqueue(40);
	queue.enqueue(50);
	queue.enqueue(60);
	System.out.println(queue.getMin() );
	
}
}
