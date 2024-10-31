package queue;

public class MYQueueUsingArrayTest {
	public static void main(String[] args) {
		MyQueueUsingArray queue = new MyQueueUsingArray();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.print();
		System.out.println();
		queue.dequeue();
		queue.print();
	}
}
