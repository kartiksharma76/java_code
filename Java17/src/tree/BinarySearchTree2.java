package tree;

public class BinarySearchTree2 {

	private Node root;

	public void insert(int key) {
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

	public boolean search(int key) {
		return searchHelper(root, key) != null;
	}

	private Node searchHelper(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}

		if (key < root.key) {
			return searchHelper(root.left, key);
		}

		return searchHelper(root.right, key);

	}

	public void delete(int key) {
		root = deleteHelper(root, key);// null
	}

	public Node deleteHelper(Node root, int key) {
		// Base condition
		if (root == null) {
			return root;
		}

		if (key < root.key) {
			root.left = deleteHelper(root.left, key);
		} else if (key > root.key) {
			root.right = deleteHelper(root.right, key);
		} else {
			// Node with only one child or no child
//             if(root.left == null && root.right == null) {
//            	 return null;
//             }
			if (root.left == null) {
				return root.right;

			} else if (root.right == null) {
				return root.left;
			}

			// Node with two children
			root.key = getMinValue(root.right);
			System.out.println("MinValue: " + root.key);
			root.right = deleteHelper(root.right, root.key);
		}

		return root;
	}

	public int getMinValue(Node root) {
		int minValue = root.key;

		while (root.left != null) {
			root = root.left;
			minValue = root.key;
		}
		System.out.println("updated root: " + root.key);
		return minValue;
	}

	public void inOrder() {
		traverseInOrder(root);
	}

	private void traverseInOrder(Node root) {
		if (root == null) {
			return;
		}

		traverseInOrder(root.left);
		System.out.print(root.key + " ");
		traverseInOrder(root.right);

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
