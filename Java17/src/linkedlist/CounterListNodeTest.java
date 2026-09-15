package linkedlist;

public class CounterListNodeTest {
	public static void main(String[] args) {
		CounterListNode ll = new CounterListNode();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.print();
		System.out.println();
		System.out.println("Count of Node in  linked list of length:" + ll.length());

	}
}