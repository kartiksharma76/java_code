package recursion;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreeTraversal {
	Node root;

	void inorder(Node node) {
		if (node == null)
			return;

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.inorder(tree.root);
	}
}
