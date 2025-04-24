package LinkedListProblems;

// 2->4->6->7->5->1->0
public class LengthListNodeCountTest {
	public static void main(String[] args) {
		LengthListNodeCount list = new LengthListNodeCount();
		list.insert(2);
		list.insert(4);
		list.insert(6);
		list.insert(7);
		list.insert(5);
		list.insert(1);
		list.insert(0);
		list.display();
		System.out.println("list of count node length:" + list.length());
	}
}
