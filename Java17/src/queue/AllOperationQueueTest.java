package queue;

public class AllOperationQueueTest {
	public static void main(String[] args) {
		AllOperationQueue queue = new AllOperationQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(20);
		queue.enqueue(40);

		System.out.println("Queue after enqueue operations:");
		queue.print(); // Output: 10 20 30 20 40

		System.out.println("Size of the queue: " + queue.size()); // Output: 5

		System.out.println("Dequeued: " + queue.dequeue()); // Output: 10

		System.out.println("Queue after dequeue operation:");
		queue.print(); // Output: 20 30 20 40

		System.out.println("Size of the queue: " + queue.size()); // Output: 4

		System.out.println("Peek: " + queue.peek()); // Output: 20

		System.out.println("Occurrences of 20: " + queue.countOccurance(20)); // Output: 2

		queue.removeByPosition(1);

		System.out.println("Queue after removing element at position 1:");
		queue.print(); // Output: 20 20 40

		System.out.println("Middle element: " + queue.findMiddle()); // Output: 20

		queue.removeLast();

		System.out.println("Queue after removing the last element:");
		queue.print(); // Output: 20 20

		queue.dequeue();

		System.out.println("Queue after removing the first element:");
		queue.print(); // Output: 20
	}
}
