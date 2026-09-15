package queue;

public class QueueArrayTest {
public static void main(String[] args) {
	QueueArray queue=new QueueArray();
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.enqueue(40);
	queue.enqueue(50);
	queue.enqueue(60);
	queue.print();
	System.out.println();
	queue.dequeue();
	queue.print();
}
}
