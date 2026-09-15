package LinkedListProblems;

public class RemoveDuplicateTest2 {
	public static void main(String[] args) {
		RemoveDuplicate2 ll = new RemoveDuplicate2();
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.insert(4);
		ll.display();
		System.out.println("remove Duplicate:");
		ll.removeduplicate();
		ll.display();
	}
}
