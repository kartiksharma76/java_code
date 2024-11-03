package tree;

public class BinarySearchTreePreOrder {
	private Node root;

	public void inseart(int key) {
		root = insertHelper(root, key);

	}

	private Node insertHelper(Node root, int key) {
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

	public boolean Search(int key) {
		return SearchHelper(root, key = key) != null;

	}

	private Node SearchHelper(Node root, int key) {
		if (root == null || root.key == key) {
			return root;

		}
		if (key < root.key) {
			return SearchHelper(root.left, key);

		}
		return SearchHelper(root.right, key);

	}

	public void preOrder() {
		traverseproOrder(root);

	}

	public void traverseproOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key + " ");
		traverseproOrder(root.left);
		traverseproOrder(root.right);
	}

	class Node {
		private int key;
		private Node left;
		private Node right;

		public Node(int key) {
			super();
			this.key = key;
		}

	}

}
