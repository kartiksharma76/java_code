package tree;

public class AvlTreeTest {
	public static void main(String[] args) {
		AvlTree avl = new AvlTree();
		avl.insert(10);
		avl.insert(20);
		avl.insert(30);
		System.out.println(avl.getHeight());
		System.out.println(avl.getBalanceFactor());
		avl.inorder();

	}
}
