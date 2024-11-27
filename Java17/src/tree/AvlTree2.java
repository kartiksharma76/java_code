package tree;

import tree.AvlTree1.Node;

public class AvlTree2 {
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

	public Node doLeftRotation(Node y) {
		System.out.println("Left Rotation");
		Node x = y.right;
		Node t = x.left;
		// perform rotation
		x.left = y;
		y.right = t;
		// update heights(update child height first then parent height)
		// child
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		// parent
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		return x;
	}

	public void doRightRotation() {
		root = doRightRotation(root);
	}

	private Node doRightRotation(Node x) {
		System.out.println("Righ Rotation");
		Node y = x.left;
		Node t = y.right;
		// perform rotation;
		y.right = x;
		x.left = t;
		// update heights(update child height first then parent height)
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		return y;
	}

	public void insert(int key) {
		root = insert(root, key);
	}

	private Node insert(Node root, int key) {
		if (root == null) {
			return new Node(key);
		} else if (key < root.key) {
			root.left = insert(root.left, key);
		} else if (key > root.key) {
			root.right = insert(root.right, key);
		} else {
			return root;// to avoid duplicate
		}
		// update height
		root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//		System.out.println("Height: " + root.height);
		// check balance factor
		int bf = getBalanceFactor(root);
//		System.out.println("Balance Factor: " + bf);
		// perform required rotation
		// case LL
		if (bf > 1 && key < root.left.key) {
			return doRightRotation(root);
		}
		// case RR
		if (bf < -1 && key > root.right.key) {
			return doLeftRotation(root);
		}
		// case LR
		if (bf > 1 && key > root.left.key) {
			System.out.println("LR");
			root.left = doLeftRotation(root.left);
			return doRightRotation(root);
		}
		// case RL
		if (bf < -1 && key < root.right.key) {
			System.out.println("RL");
			root.right = doRightRotation(root.right);
			return doLeftRotation(root);
		}
		return root;
	}

	public void preOrder() {
		traversepreOrder(root);
	}

	private void traversepreOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.key + " ");
		traversepreOrder(root.left);
		traversepreOrder(root.right);

	}

	public AvlTree2() {
//		root = new Node(10);
//		root.height = 3;
//		root.right = new Node(20);
//		root.right.height = 2;
//		root.right.right = new Node(30);
//		root = new Node(30);
//		root.height = 3;
//		root.left = new Node(20);
//		root.left.height = 2;
//		root.left.left = new Node(10);
	}

	class Node {
		int key;
		int height;
		Node left;
		Node right;

		public Node(int key) {
			this.key = key;
			height = 1;
		}

	}
}