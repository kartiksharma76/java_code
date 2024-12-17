package linkedlist;

public class IsLinkedListLengthIsEvenTest {
	public static void main(String[] args) {
		IsLinkedListLengthIsEven ll = new IsLinkedListLengthIsEven();
		ll.insert(9);
		ll.insert(4);
		ll.insert(3);
		ll.print();

		System.out.println("size:" + ll.size());
		System.out.println("IsLinkedListLengthIsEvenTest:" + ll.Contain(null));

	}

}
