package Practicesheet;

public class LinkedListMin {
	public static void main(String[] args) {
 AllOperationOfLinkedList list = new AllOperationOfLinkedList();
 
//Insert elements
 list.insert(10);
 list.insert(20);
 list.insert(30);
 list.addFirst(5);
 list.addLast(40);

 System.out.println("Linked List:");
 list.print();

 // Insert at position
 list.addPosition(3, 15);
 System.out.println("\nAfter inserting 15 at position 3:");
 list.print();

 // Delete operations
 list.deleteFirst();
 System.out.println("\nAfter deleting first:");
 list.print();

 list.deleteLast();
 System.out.println("\nAfter deleting last:");
 list.print();

 list.deleteByPosition(2);
 System.out.println("\nAfter deleting position 2:");
 list.print();

 // Advanced operations
 System.out.println("\nMiddle element: " + list.middleNode());
 System.out.println("Occurrence of 20: " + list.occurrence(20));
 System.out.println("Contains 30? " + list.contains(30));
 System.out.println("Size of list: " + list.size());

 // Move last node to front
 list.moveLastToFront();
 System.out.println("\nAfter moving last node to front:");
 list.print();
}
}