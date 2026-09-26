package generic;

public class GenUsedLinkedListTest {
    public static void main(String[] args) {
        GenUsedLinkedList<Integer> list = new GenUsedLinkedList<>();
        // Insert elements
        list.insert(100);
        list.insert(200);
        list.insert(300);
        System.out.println("After inserting 100, 200, 300:");
        list.print();

// Add element at the beginning
        list.addFirst(50);
        System.out.println("\nAfter adding 50 at the beginning:");
        list.print();

// Add element at the end
        list.addLast(400);
        System.out.println("\nAfter adding 400 at the end:");
        list.print();

// Add element at a specific position
        list.addPosition(2, 150);
        System.out.println("\nAfter adding 150 at position 2:");
        list.print();

// Delete element by position
        list.deleteByPosition(3);
        System.out.println("\nAfter deleting element at position 3:");
        list.print();

// Find the middle node
        System.out.println("\nMiddle node: " + list.middleNode());

// Check occurrence of an element
        int occurrences = list.occurrence(200);
        System.out.println("\nOccurrences of 200: " + occurrences);

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
        boolean contains = list.contains(150);
        System.out.println("\nList contains 150: " + contains);

// Print the size of the list
        System.out.println("\nSize of the list: " + list.size());
    }
}
