package tree;

public class BinarySearchTreeTest {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.inseart(50);
		tree.inseart(30);
		tree.inseart(70);
		tree.inseart(20);
		tree.inseart(40);
		tree.inseart(60);
		tree.inseart(80);
		tree.inorder();
		System.out.println();
		System.out.println(tree.Search(90));
	}
}
