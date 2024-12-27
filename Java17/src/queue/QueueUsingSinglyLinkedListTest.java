package queue;

public class QueueUsingSinglyLinkedListTest {
	public static void main(String[] args) {
		QueueUsingSinglyLinkedList queue = new QueueUsingSinglyLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.print();
		System.out.println();
		System.out.println("after queue:");
		queue.dequeue();
		queue.dequeue();
		queue.print();
	}
}
