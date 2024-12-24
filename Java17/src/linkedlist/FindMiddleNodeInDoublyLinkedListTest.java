package linkedlist;

public class FindMiddleNodeInDoublyLinkedListTest {
	public static void main(String[] args) {
		FindMiddleNodeInDoublyLinkedList ll = new FindMiddleNodeInDoublyLinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.print();
		System.out.println();
		System.out.println("middle node of doublylinkdelist:" + ll.middleNode());
	}
}
