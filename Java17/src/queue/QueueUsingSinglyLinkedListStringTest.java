package queue;

public class QueueUsingSinglyLinkedListStringTest {
	public static void main(String[] args) {
		QueueUsingSinglyLinkedListString queue = new QueueUsingSinglyLinkedListString();
		queue.enqueue("k");
		queue.enqueue("a");
		queue.enqueue("r");
		queue.enqueue("t");
		queue.enqueue("i");
		queue.enqueue("k");
		queue.enqueue("e");
		queue.enqueue("y");
		queue.print();
		System.out.println();
		System.out.println("after delete:");
		queue.dequeue();
		queue.dequeue();
		queue.print();

	}
}
