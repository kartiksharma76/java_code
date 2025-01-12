package linkedlist;

public class AddMidTest2 {
	public static void main(String[] args) {
		AddMid2 ll = new AddMid2();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
		ll.print();
		System.out.println();
		System.out.println("add position");
		ll.Addmid(3, 70);
		ll.print();
	}
}
