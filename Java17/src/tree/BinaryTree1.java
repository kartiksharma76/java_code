package tree;

public class BinaryTree1 {
	private Node root;

	public void insert(int key) {
		root = insertHelper(root, key);
	}

	public Node insertHelper(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insertHelper(root.left, key);
		} else if (key > root.key) {
			root.right = insertHelper(root.right, key);
		}
		return root;
	}

	public void Inorder() {
		traverseInorder(root);
	}

	public void traverseInorder(Node root) {
		if (root == null) {
			return;
		}
		traverseInorder(root.left);
		System.out.println(root.key + " ");
		traverseInorder(root.right);

	}

	class Node {
		private int key;
		private Node left;
		private Node right;

		public Node(int key) {
			super();
			this.key = key;
			this.left = left;
			this.right = right;
		}
	}
}