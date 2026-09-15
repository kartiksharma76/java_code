package Generics;

public class GenericLinkedList<E> {
	public static void main(String[] args) {
		// Integer LinkedList
		System.out.println("Integer LinkedList Operations:");
		AllOperationLinkedList<Integer> List = new AllOperationLinkedList<>();

		// Insert elements
		List.insert(10);
		List.insert(20);
		List.insert(30);
		System.out.println("After inserting 10, 20, 30:");
		List.print();

		// Add element at the beginning
		List.addFirst(5);
		System.out.println("\nAfter adding 5 at the beginning:");
		List.print();

		// Add element at the end
		List.addLast(40);
		System.out.println("\nAfter adding 40 at the end:");
		List.print();

		// Add element at a specific position
		List.addPosition(2, 15);
		System.out.println("\nAfter adding 15 at position 2:");
		List.print();

		// Delete element by position
		List.deleteByPosition(3);
		System.out.println("\nAfter deleting element at position 3:");
		List.print();

		// Find the middle node
		System.out.println("\nMiddle node: " + List.middleNode());

		// Check occurrence of an element
		int occurrences = List.occurrence(20);
		System.out.println("\nOccurrences of 20: " + occurrences);

		// Delete the first element
		List.deleteFirst();
		System.out.println("\nAfter deleting the first element:");
		List.print();

		// Delete the last element
		List.deleteLast();
		System.out.println("\nAfter deleting the last element:");
		List.print();

		// Move the last element to the front
		List.moveLastToFront();
		System.out.println("\nAfter moving the last element to the front:");
		List.print();

		// Check if an element exists
		boolean contains = List.contains(15);
		System.out.println("\nList contains 15: " + contains);

		// Print the size of the list
		System.out.println("\nSize of the list: " + List.size());

		// String LinkedList
		System.out.println("\n\nString LinkedList Operations:");
		AllOperationLinkedList<String> StringList = new AllOperationLinkedList<>();

		// Insert elements
		StringList.insert("kartikey");
		StringList.insert("Kirtan");
		StringList.insert("Cherry");
		System.out.println("After inserting kartikey, kirtan, Cherry:");
		StringList.print();

		// Add element at the beginning
		StringList.addFirst("AMAN");
		System.out.println("\nAfter adding AMAN at the beginning:");
		StringList.print();

		// Add element at the end
		StringList.addLast("KAUSHAL");
		System.out.println("\nAfter adding KAUSHAL at the end:");
		StringList.print();

		// Add element at a specific position
		StringList.addPosition(2, "ANURAG");
		System.out.println("\nAfter adding ANURAG at position 2:");
		StringList.print();

		// Delete element by position
		StringList.deleteByPosition(3);
		System.out.println("\nAfter deleting element at position 3:");
		StringList.print();

		// Find the middle node
		System.out.println("\nMiddle node: " + StringList.middleNode());

		// Check occurrence of an element
		int strOccurrences = StringList.occurrence("PAWAN");
		System.out.println("\nOccurrences of PAWAN: " + strOccurrences);

		// Delete the first element
		StringList.deleteFirst();
		System.out.println("\nAfter deleting the first element:");
		StringList.print();

		// Delete the last element
		StringList.deleteLast();
		System.out.println("\nAfter deleting the last element:");
		StringList.print();

		// Move the last element to the front
		StringList.moveLastToFront();
		System.out.println("\nAfter moving the last element to the front:");
		StringList.print();

		// Check if an element exists
		boolean stringContains = StringList.contains("KIRTAN");
		System.out.println("\nList contains Kirtan: " + stringContains);

		// Print the size of the list
		System.out.println("\nSize of the list: " + StringList.size());
	}
}
