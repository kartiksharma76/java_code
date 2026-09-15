package linkedlist;

public class CountOccuranceTest {
	public static void main(String[] args) {
		CountOccurrence ll = new CountOccurrence();
		ll.append(1);
		ll.append(2);
		ll.append(1);
		ll.append(2);
		ll.append(1);
		ll.append(3);
		ll.append(1);
		System.out.println("print list:");
		ll.print();
		System.out.println();
		System.out.println("print count occurance:");
		int data = 1;
		int occurrences = ll.countOccurrence(data);
		System.out.println("The key " + data + " appears " + occurrences + " times.");

	}
}
