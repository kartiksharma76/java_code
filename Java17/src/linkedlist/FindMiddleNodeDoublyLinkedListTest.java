package linkedlist;

public class FindMiddleNodeDoublyLinkedListTest {
	public static void main(String[] args) {
		FindMiddleNodeInDoublyLinkedList ll = new FindMiddleNodeInDoublyLinkedList();
		ll.insert(2);
		ll.insert(4);
		ll.insert(6);
		ll.insert(7);
		ll.insert(5);
		ll.insert(1);
		ll.print();
		System.out.println();
		System.out.println("middle node of doublylinkdelist:" + ll.middleNode());
	}
}
