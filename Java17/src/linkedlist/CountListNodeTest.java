package linkedlist;

public class CountListNodeTest {
	public static void main(String[] args) {
		CounterListNode ll = new CounterListNode();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(60);
		ll.insert(70);
		ll.insert(80);
		ll.insert(90);
		ll.print();
		System.out.println();
		System.out.println("Count of Node in  linked list of length:" + ll.length());

	}
}
