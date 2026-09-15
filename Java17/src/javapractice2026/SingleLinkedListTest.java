package javapractice2026;

public class SingleLinkedListTest {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

		// Insert elements
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);

		// Add first and last
		list.addFirst(5);
		list.addLast(50);

		// Add at position (position starts from 1)
		list.addPosition(3, 15);

		// Print list
		System.out.println("Linked List:");
		list.print();

		// Middle node
		System.out.println("Middle Node: " + list.middleNode());

		// Occurrence
		System.out.println("Occurrence of 20: " + list.Occurence(20));

		// Contains
		System.out.println("Contains 30: " + list.contains(30));

		// Delete first and last
		list.deleteFirst();
		list.deleteLast();

		System.out.println("After Deletion:");
		list.print();

		// Move last to front
		list.MoveLastToFront();
		System.out.println("After Move Last To Front:");
		list.print();

		// Size
		System.out.println("Size = " + list.size());
	}
}
