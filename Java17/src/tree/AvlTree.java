 package tree;

import tree.BinarySearchTree.Node;

public class AvlTree {
	private Node root;

	public AvlTree() {
//		root=new Node(30);
//		root.height =3;
//		root.left=new Node(20);
//		root.left.height=2;
//		root.left.left=new Node(10);
//		root=doRightRotation(root);
//		root=new Node(10);
//		root.height=3;
//		root.right=new Node(20);
//		root.right.height=2;
//		root.right.right=new Node(30);
//		root=doLeftRotation(root);

	}

	public int getHeight() {
		return getHeight(root); 
	}

	private int getHeight(Node node) {
		if (node == null) {
			return 0;
		} else {
			return node.height;
		}

	}

	public int getBalanceFactor() {
		return getBalanceFactor(root);
	}

	public int getBalanceFactor(Node node) {
		if (node == null) {
			return 0;
		} else {
			return getHeight(node.left) - getHeight(node.right);
		}
	}

	public Node doRightRotation(Node y) {
		Node x = y.left;
		Node t = x.right;
		// perform rotation
		x.right = y;
		y.left = t;
		// update Child node heigth first then parent Node
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		return x;

	}

	public Node doLeftRotation(Node x) {
		Node y = x.right;
		Node t = y.left;
		// perform rotation
		y.left = x;
		x.right = t;
		// update Height
		// update Child node heigth first then parent Node
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;

//		System.out.println();
		return y;

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
			return root; // to avoid duplicate key
		}
		root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
		int bf = getBalanceFactor(root);
		// case LL
		if (bf > 1) {
			return doRightRotation(root);
		}
		// case RR
		if (bf < -1) {
			return doLeftRotation(root);

		}
		return root;
	}

	class Node {
		int key;
		int height;
		Node right;
		Node left;

		public Node(int key) {
			this.key = key;
			height = 1;
		}

	}
}
