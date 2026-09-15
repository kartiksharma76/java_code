package linkedlist;

public class DeleteAlternateNodeDoublyLinkedListTest {
	public static void main(String[] args) {
		DeleteAlternateNodeDoublyLinkedlist ll = new DeleteAlternateNodeDoublyLinkedlist();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.deleteAlternateNodes();
		ll.print();

	}
}
