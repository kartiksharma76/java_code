package linkedlist;

public class SizeOfDoublyLinkedListTest {
	public static void main(String[] args) {
		SizeOfDoublyLinkedList ll = new SizeOfDoublyLinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.print();
		System.out.println();
		System.out.println("lenght of list:" + ll.size());
	}
}
