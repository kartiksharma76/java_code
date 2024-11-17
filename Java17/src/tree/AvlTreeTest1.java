package tree;

public class AvlTreeTest1 {
	public static void main(String[] args) {
		AvlTree1 avl = new AvlTree1();
		avl.insert(35);
		avl.insert(50);
		avl.insert(40);
		avl.insert(25);
		avl.insert(30);
		avl.insert(60);
		avl.insert(78);
		avl.insert(20);
		avl.insert(28);
		avl.inOrder();
	}
}
