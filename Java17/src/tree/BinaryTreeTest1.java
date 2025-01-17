package tree;

public class BinaryTreeTest1 {
	public static void main(String[] args) {
		BinaryTree1 tree = new BinaryTree1();
		tree.insert(10);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(70);
		tree.Inorder();
	}
}
