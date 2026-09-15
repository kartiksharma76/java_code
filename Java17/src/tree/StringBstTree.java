package tree;

public class StringBstTree {

	private Node root;

	// Get the height of a node
	private int height(Node node) {
		return (node == null) ? 0 : node.height;
	}

	// Get the balance factor of a node
	private int getBalance(Node node) {
		return (node == null) ? 0 : height(node.left) - height(node.right);
	}

	// Right rotate
	private Node rightRotate(Node y) {
		Node x = y.left;
		Node T = x.right;

		// Perform rotation
		x.right = y;
		y.left = T;

		// Update heights
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		// Return new root
		return x;
	}

	// Left rotate
	private Node leftRotate(Node x) {
		Node y = x.right;
		Node T = y.left;

		// Perform rotation
		y.left = x;
		x.right = T;

		// Update heights
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		// Return new root
		return y;
	}

	// Insert a key into the AVL tree
	public void insert(String key) {
		root = insert(root, key);
	}

	private Node insert(Node root, String key) {
		if (root == null) {
			return new Node(key);
		}

		if (key.compareTo(root.key) < 0) {
			root.left = insert(root.left, key);
		} else if (key.compareTo(root.key) > 0) {
			root.right = insert(root.right, key);
		} else {
			// Duplicates are not allowed
			return root;
		}

		// Update the height of this ancestor node
		root.height = Math.max(height(root.left), height(root.right)) + 1;

		// Get the balance factor of this ancestor node
		int balance = getBalance(root);

		// Perform rotations to balance the tree

		// Left Left Case
		if (balance > 1 && key.compareTo(root.left.key) < 0) {
			return rightRotate(root);
		}

		// Right Right Case
		if (balance < -1 && key.compareTo(root.right.key) > 0) {
			return leftRotate(root);
		}

		// Left Right Case
		if (balance > 1 && key.compareTo(root.left.key) > 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// Right Left Case
		if (balance < -1 && key.compareTo(root.right.key) < 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	public void inorder() {
		traverseInorder(root);

	}

	public void traverseInorder(Node root) {
		if (root == null) {
			return;
		}
		traverseInorder(root.left);
		System.out.print(root.key + " ");
		traverseInorder(root.right);

	}

	public void traversepreorder() {
		traversepreorder(root);
	}

	private void traversepreorder(Node root) {
		if (root == null) {
			return;

		}
		System.out.print(root.key + " ");
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
		System.out.print(root.key + " ");
	}

	// Search for a key in the AVL tree
	public boolean search(String key) {
		return search(root, key);
	}

	private boolean search(Node node, String key) {
		if (node == null) {
			return false;
		}

		if (key.compareTo(node.key) < 0) {
			return search(node.left, key);
		} else if (key.compareTo(node.key) > 0) {
			return search(node.right, key);
		} else {
			return true;
		}

	}

	class Node {
		String key;
		int height;
		Node left;
		Node right;

		Node(String key) {
			this.key = key;
			this.height = 1; // height of a new node is 1
		}
	}

}
