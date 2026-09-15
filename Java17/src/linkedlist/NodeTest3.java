package linkedlist;

public class NodeTest3 {
	public static void main(String[] args) {
		LinkedList3 ll = new LinkedList3();
		ll.push(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);

		System.out.println("middle Node of linkedlist is:" + ll.middleNode());
	}
}
