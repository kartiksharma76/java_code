package linkedlist;

public class AlternateNodeTest1 {
	public static void main(String[] args) {
		AlternateNode1 ll = new AlternateNode1();
		System.out.println("before altenating");
		ll.insert(99);
		ll.insert(59);
		ll.insert(42);
		ll.insert(20);
		ll.print();
		System.out.println();
		System.out.println("after altenating");
		ll.deleteAlternateNode();
		ll.print();
	}
}
