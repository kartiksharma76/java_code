package queue;

public class MyQueueUsingLinkedListTest {
	public static void main(String[] args) {
		MyQueueUsingLinkedList queue = new MyQueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.print();

		queue.dequeue();
		System.out.println("\nAfter deleting");
		queue.print();
	}

}
