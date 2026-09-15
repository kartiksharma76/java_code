package queue;

public class FindmidTest {
	public static void main(String[] args) {
		FindMid queue = new FindMid();
		queue.adddata(50);
		queue.adddata(40);
		queue.adddata(30);
		queue.adddata(20);
		queue.adddata(10);
		queue.print();
		System.out.println();
		System.out.println("the middle index is:" + queue.findmiddleindex());
		System.out.println();
		// queue.deqeueFirst();
		// queue.dequeeu(10);
		queue.adddata(60);
		queue.adddata(79);
		System.out.println(queue.findmiddleindex());
		System.out.println();
		queue.print();

	}
}
