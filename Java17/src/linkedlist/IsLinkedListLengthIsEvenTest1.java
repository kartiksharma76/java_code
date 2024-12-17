package linkedlist;

public class IsLinkedListLengthIsEvenTest1 {
	public static void main(String[] args) {
		IsLinkedListLengthIsEven1 ll = new IsLinkedListLengthIsEven1();
		ll.insert(12);
		ll.insert(52);
		ll.insert(10);
		ll.insert(47);
		ll.insert(95);
		ll.insert(0);
		ll.print();
		System.out.println("size:" + ll.size());

		System.out.println("IsLinkedListLengthIsEvenTest1:" + ll.Contain(null));

	}
}
