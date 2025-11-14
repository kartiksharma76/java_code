package HackerRank;

public class BinaryTree {
	private Node root;

	public void insert(int key) {
		root = insertHelper(root, key);
	}

	private Node insertHelper(Node root, int key) {
		// TODO Auto-generated method stub
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

	public boolean search(int key) {
		return searchHelper(root, key) != null;
	}

	private Node searchHelper(Node root, int key) {
		// TODO Auto-generated method stub
		if (root == null || root.key == key) {
			return root;
		}
		if (key < root.key) {
			return searchHelper(root.left, key);
		}
		return searchHelper(root.right, key);
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

	public void preorder() {
		traversePreorder(root);
	}

	public void traversePreorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key + " ");
		traversePreorder(root.left);
		traversePreorder(root.right);
	}

	public void postorder() {
		traversePostorder(root);
	}

	public void traversePostorder(Node root) {
		if (root == null) {
			return;
		}
		traversePostorder(root.left);
		traversePostorder(root.right);
		System.out.println(root.key + " ");
	}

	class Node {
		private int key;
		private Node left;
		private Node right;

		public Node(int key) {

			this.key = key;
		}

	}
}