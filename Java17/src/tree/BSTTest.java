package tree;

public class BSTTest {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.inseart(10);
		tree.inseart(5);
		tree.inseart(15);
		tree.inseart(12);
		tree.inseart(18);
		System.out.println("inorder:" + " ");
		tree.inorder();
		System.out.println("preorder:" + " ");
		tree.traversepreorder();
		System.out.println("postorder:" + " ");
		tree.traversepostorder();
	}
}
