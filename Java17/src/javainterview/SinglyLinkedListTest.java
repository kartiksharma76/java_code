package javainterview;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		// Insert
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addAtPosition(2, 15);

		// Print
		System.out.println("List:");
		list.print();

		// Search
		System.out.println("Contains 20? " + list.contains(20));

		// Update
		list.update(2, 99);
		System.out.println("After Update:");
		list.print();

		// Delete
		list.deleteFirst();
		list.deleteLast();
		list.deleteAtPosition(1);

		System.out.println("After Deletion:");
		list.print();

		// Reverse
		list.addLast(40);
		list.addLast(50);
		list.reverse();

		System.out.println("After Reverse:");
		list.print();

		// Size
		System.out.println("Size: " + list.size());
	}
}