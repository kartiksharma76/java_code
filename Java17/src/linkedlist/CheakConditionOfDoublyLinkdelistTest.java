package linkedlist;

public class CheakConditionOfDoublyLinkdelistTest {
	public static void main(String[] args) {
		CheakConditionOfDoublyLinkdelist ll = new CheakConditionOfDoublyLinkdelist();
		ll.insert(12);
		ll.insert(52);
		ll.insert(10);
		ll.insert(47);
		ll.insert(95);
		ll.insert(0);
		ll.print();
		System.out.println();
		System.out.println("size of the list:" + ll.size());
		System.out.println();
		System.out.println("size is six then print true:" + ll.contain());

	}
}
