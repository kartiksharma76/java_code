package Generics;

public class AllOpertionLinketListTest {
	public static void main(String[] args) {
		AllOperationLinkedList<Integer> list = new AllOperationLinkedList<>();

		// Insert elements
		list.insert(10);
		list.insert(20);
		list.insert(30);
		System.out.println("After inserting 10, 20, 30:");
		list.print();

		// Add element at the beginning
		list.addFirst(5);
		System.out.println("\nAfter adding 5 at the beginning:");
		list.print();

		// Add element at the end
		list.addLast(40);
		System.out.println("\nAfter adding 40 at the end:");
		list.print();

		// Add element at a specific position
		list.addPosition(2, 15);
		System.out.println("\nAfter adding 15 at position 2:");
		list.print();

		// Delete element by position
		list.deleteByPosition(3);
		System.out.println("\nAfter deleting element at position 3:");
		list.print();

		// Find the middle node
		System.out.println("\nMiddle node: " + list.middleNode());

		// Check occurrence of an element
		int occurrences = list.occurrence(20);
		System.out.println("\nOccurrences of 20: " + occurrences);

		// Delete the first element
		list.deleteFirst();
		System.out.println("\nAfter deleting the first element:");
		list.print();

		// Delete the last element
		list.deleteLast();
		System.out.println("\nAfter deleting the last element:");
		list.print();

		// Move the last element to the front
		list.moveLastToFront();
		System.out.println("\nAfter moving the last element to the front:");
		list.print();

		// Check if an element exists
		boolean contains = list.contains(15);
		System.out.println("\nList contains 15: " + contains);

		// Print the size of the list
		System.out.println("\nSize of the list: " + list.size());
	}
}
