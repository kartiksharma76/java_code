package linkedlist;

public class CountOccurrenceDoublyTest {
	public static void main(String[] args) {
		CountOccurrenceDoubly list = new CountOccurrenceDoubly();
		list.append(1);
		list.append(2);
		list.append(1);
		list.append(2);
		list.append(1);
		list.append(3);
		list.append(1);
		System.out.print("Doubly Linked List: ");
		list.print();
		int data = 1;
		int occurrences = list.countOccurrence(data);
		System.out.println("The key " + data + " appears " + occurrences + " times.");

	}

}
