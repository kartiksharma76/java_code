package tree;

public class BinarySearchTree1 {
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

	public void inorder() {
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

	public void traversepreorder() {
		traversepreorder(root);
	}

	private void traversepreorder(Node root) {
		if (root == null) {
			return;

		}
		System.out.println(root.key + " ");
		traversepreorder(root.left);
		traversepreorder(root.right);
	}

	public void traversepostorder() {
		traversepostorder(root);
	}

	private void traversepostorder(Node root) {
		if (root == null) {
			return;

		}
		traversepostorder(root.left);
		traversepostorder(root.right);
		System.out.println(root.key + " ");
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
