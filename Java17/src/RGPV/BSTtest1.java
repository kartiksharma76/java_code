package RGPV;

public class BSTtest1 {
public static void main(String[] args) {
	BST1 b=new BST1();
	b.insert(14);
	b.insert(10);
	b.insert(17);
	b.insert(12);
	b.insert(11);
	b.insert(20);
	b.insert(18);
	b.insert(25);
	b.insert(8);
	b.insert(22);
	b.insert(23);
	System.out.print("traverse inorder:");
	b.inorder();
	System.out.println(b.search(25));
}
}
