package LinkedListProblems;

public class RemoveDuplicateTest {
	public static void main(String[] args) {
		RemoveDuplicate duplicate = new RemoveDuplicate();
		duplicate.insert(2);
		duplicate.insert(2);
		duplicate.insert(4);
		duplicate.insert(5);
		duplicate.print();
		System.out.println("\nremove duplicate:");
		duplicate.removeduplicate();
		duplicate.print();
	}
}
