 package tree;

public class AvlTreeTest2 {
	public static void main(String[] args) {
		AvlTree2 avl = new AvlTree2();
		avl.insert(10);
		avl.insert(20);
		avl.insert(30);
		avl.insert(40);
		avl.insert(50);
		avl.insert(60);
		avl.insert(70);
		avl.insert(90);
		avl.preOrder();
	}
}