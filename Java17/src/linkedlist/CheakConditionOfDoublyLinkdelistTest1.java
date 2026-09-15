package linkedlist;

public class CheakConditionOfDoublyLinkdelistTest1 {
	public static void main(String[] args) {
		CheakConditionOfDoublyLinkdelist1 ll = new CheakConditionOfDoublyLinkdelist1();
		ll.insert(9);
		ll.insert(4);
		ll.insert(3);
		ll.print();
		System.out.println();
		System.out.println("size of list:" + ll.size());
		System.out.println();
		System.out.println("cheak condition of list true or false:" + ll.contain());
	}
}
