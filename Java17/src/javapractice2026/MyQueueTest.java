package javapractice2026;

public class MyQueueTest {
	public static void main(String[] args) {
		MyQueue q = new MyQueue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		q.display();

		q.peek();

		q.dequeue();
		q.dequeue();

		q.display();

		System.out.println("Is queue empty? " + q.isEmpty());

		q.dequeue();
		q.dequeue(); // underflow test
	}
}
