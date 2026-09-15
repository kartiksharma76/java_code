package LinkedListProblems;

public class InsertValueAtMiddleTest2 {
	public static void main(String[] args) {
		InsertValueAtMiddle ll = new InsertValueAtMiddle();
		ll.insert(10);
		ll.insert(20);
		ll.insert(40);
		ll.insert(50);
		ll.display();
		System.out.println("InsertAtMiddle-");
		ll.addMid(3, 30);
		ll.display();

	}
}
