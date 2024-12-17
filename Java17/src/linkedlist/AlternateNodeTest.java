package linkedlist;

public class AlternateNodeTest {
	public static void main(String[] args) {
		AlternateNode ll = new AlternateNode();
		ll.insert(6);
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		System.out.println("before Alternate");
		ll.print();
		ll.deleteAlternateNode();
		System.out.println("\nafter Alternate");
		ll.print();
	}
}
