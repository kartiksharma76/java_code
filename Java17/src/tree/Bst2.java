package tree;

public class Bst2 {
	private Node root;

	public void inseart(char c) {
		root = insertHelper(root, c);
	} 

	public Node insertHelper(Node root, char c) {
		if (root == null) {
			root = new Node(c);

			return root;
		}
		if (c < root.C) {
			root.left = insertHelper(root.left, c);

		} else if (c > root.C) {
			root.right = insertHelper(root.right, c);
		}

		return root;
	}

	public boolean Search(char key) {
		return SearchHelper(root, key = key) != null;

	}

	private Node SearchHelper(Node root, char key) {
		if (root == null || root.C == key) {
			return root;

		}
		if (key < root.C) {
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
		System.out.println(root.C + " ");
		traverseInorder(root.right);

	}

	public void traversepreorder() {
		traversepreorder(root);
	}

	private void traversepreorder(Node root) {
		if (root == null) {
			return;

		}
		System.out.println(root.C + " ");
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
		System.out.println(root.C + " ");
	}

	class Node {
		private char C;
		private Node left;
		private Node right;

		public Node(char C) {
			super();
			this.C = C;
		}
	}
}
