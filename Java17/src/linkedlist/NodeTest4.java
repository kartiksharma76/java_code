package linkedlist;

public class NodeTest4 {
	public static void main(String[] args) {
		LinkedList4 ll = new LinkedList4();
		ll.push(2);
		ll.push(4);
		ll.push(6);
		ll.push(7);
		ll.push(5);
		ll.push(1);

		System.out.println("middle node lof linked list:" + ll.MiddleNode());
	}
}
