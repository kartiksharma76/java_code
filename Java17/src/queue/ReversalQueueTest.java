package queue;

public class ReversalQueueTest {
	public static void main(String[] args) {
		ReversalQueue queue = new ReversalQueue();
		queue.enqueue1(4);
		queue.enqueue1(3);
		queue.enqueue1(1);
		queue.enqueue1(10);
		queue.enqueue1(2);
		queue.enqueue1(6);
		queue.print();
	}
}
