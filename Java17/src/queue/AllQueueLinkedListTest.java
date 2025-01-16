package queue;

public class AllQueueLinkedListTest {
public static void main(String[] args) {
	AllQueueLinkedList queue=new AllQueueLinkedList();
	queue.insert(10);
	queue.insert(20);
	queue.insert(30);
	queue.insert(40);
	queue.insert(50);
	queue.insert(60);
	queue.print();
	System.out.println();
	queue.dequeue(20);
	queue.print();
}
}
