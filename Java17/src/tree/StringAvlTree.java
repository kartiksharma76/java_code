package tree;

public class StringAvlTree {
	private Node root;

	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(Node node) {
		return node == null ? 0 : node.height;
	}

	public int getBalanceFactor() {
		return getBalanceFactor(root);
	}

	private int getBalanceFactor(Node node) {
		return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
	}

	public void doLeftRotation() {
		root = doLeftRotation(root);
	}

	private Node doLeftRotation(Node y) {
		System.out.println("Left Rotation");
		Node x = y.right;
		Node t = x.left;
		// Perform rotation
		x.left = y;
		y.right = t;
		// Update heights
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		return x;
	}

	public void doRightRotation() {
		root = doRightRotation(root);
	}

	private Node doRightRotation(Node x) {
		System.out.println("Right Rotation");
		Node y = x.left;
		Node t = y.right;
		// Perform rotation
		y.right = x;
		x.left = t;
		// Update heights
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		return y;
	}

	public void insert(String string) {
		root = insert(root, string);
	}

	private Node insert(Node root, String s) {
		if (root == null) {
			return new Node(s);
		}

		// Use compareTo for string comparison
		if (s.compareTo(root.s) < 0) {
			root.left = insert(root.left, s);
		} else if (s.compareTo(root.s) > 0) {
			root.right = insert(root.right, s);
		} else {
			return root; // Avoid duplicate values
		}

		// Update height
		root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;

		// Check balance factor
		int bf = getBalanceFactor(root);

		// Perform rotations if necessary
		// Case LL
		if (bf > 1 && s.compareTo(root.left.s) < 0) {
			return doRightRotation(root);
		}
		// Case RR
		if (bf < -1 && s.compareTo(root.right.s) > 0) {
			return doLeftRotation(root);
		}
		// Case LR
		if (bf > 1 && s.compareTo(root.left.s) > 0) {
			root.left = doLeftRotation(root.left);
			return doRightRotation(root);
		}
		// Case RL
		if (bf < -1 && s.compareTo(root.right.s) < 0) {
			root.right = doRightRotation(root.right);
			return doLeftRotation(root);
		}

		return root;
	}

	public void inOrder() {
		traverseInOrder(root);
		System.out.println();
	}

	private void traverseInOrder(Node root) {
		if (root == null) {
			return;
		}
		traverseInOrder(root.left);
		System.out.print(root.s + " ");
		traverseInOrder(root.right);
	}

	public void preOrder() {
		traversePreOrder(root);
		System.out.println();
	}

	private void traversePreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.s + " ");
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}

	public void postOrder() {
		traversePostOrder(root);
		System.out.println();
	}

	private void traversePostOrder(Node root) {
		if (root == null) {
			return;
		}
		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.print(root.s + " ");
	}

	class Node {
		String s;
		int height;
		Node left;
		Node right;

		public Node(String s) {
			this.s = s;
			this.height = 1;
		}
	}

}
