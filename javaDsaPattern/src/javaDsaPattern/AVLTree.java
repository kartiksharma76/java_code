package javaDsaPattern;

//AVL Tree

class AVLNode {

	int key;
	int height;

	AVLNode left;
	AVLNode right;

	AVLNode(int key) {

		this.key = key;

		height = 1;
	}
}

public class AVLTree {

	AVLNode root;

	int height(AVLNode node) {

		if (node == null) {
			return 0;
		}

		return node.height;
	}

	int getBalance(AVLNode node) {

		if (node == null) {
			return 0;
		}

		return height(node.left) - height(node.right);
	}

	AVLNode rightRotate(AVLNode y) {

		AVLNode x = y.left;

		AVLNode t2 = x.right;

		x.right = y;

		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;

		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	AVLNode leftRotate(AVLNode x) {

		AVLNode y = x.right;

		AVLNode t2 = y.left;

		y.left = x;

		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;

		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	AVLNode insert(AVLNode node, int key) {

		if (node == null) {
			return new AVLNode(key);
		}

		if (key < node.key) {

			node.left = insert(node.left, key);

		} else if (key > node.key) {

			node.right = insert(node.right, key);

		} else {

			return node;
		}

		node.height = Math.max(height(node.left), height(node.right)) + 1;

		int balance = getBalance(node);

		if (balance > 1 && key < node.left.key) {
			return rightRotate(node);
		}

		if (balance < -1 && key > node.right.key) {
			return leftRotate(node);
		}

		if (balance > 1 && key > node.left.key) {

			node.left = leftRotate(node.left);

			return rightRotate(node);
		}

		if (balance < -1 && key < node.right.key) {

			node.right = rightRotate(node.right);

			return leftRotate(node);
		}

		return node;
	}

	void preorder(AVLNode node) {

		if (node != null) {

			System.out.print(node.key + " ");

			preorder(node.left);

			preorder(node.right);
		}
	}

	public static void main(String[] args) {

		AVLTree tree = new AVLTree();

		tree.root = tree.insert(tree.root, 10);

		tree.root = tree.insert(tree.root, 20);

		tree.root = tree.insert(tree.root, 30);

		tree.root = tree.insert(tree.root, 40);

		tree.root = tree.insert(tree.root, 50);

		tree.preorder(tree.root);
	}
}