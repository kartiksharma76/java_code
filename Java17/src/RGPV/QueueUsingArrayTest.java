package RGPV;

public class QueueUsingArrayTest {
	public static void main(String[] args) {
		QueueUsingArray arr = new QueueUsingArray();
		arr.enqueue(10);
		arr.enqueue(20);
		arr.enqueue(30);
		arr.enqueue(40);
		arr.enqueue(50);
		arr.print();
		arr.dequeue();
		arr.print();
	}
}
