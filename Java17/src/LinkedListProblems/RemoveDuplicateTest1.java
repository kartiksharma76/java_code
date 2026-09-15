package LinkedListProblems;

public class RemoveDuplicateTest1 {
	public static void main(String[] args) {
		RemoveDuplicate1 duplicate = new RemoveDuplicate1();
		duplicate.insert(2);
		duplicate.insert(2);
		duplicate.insert(2);
		duplicate.insert(2);
		duplicate.insert(2);
		duplicate.print();
		System.out.println("\nremove duplicate:");
		duplicate.removeduplicate();
		duplicate.print();
	}
}
