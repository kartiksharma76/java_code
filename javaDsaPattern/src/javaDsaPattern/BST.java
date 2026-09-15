package javaDsaPattern;

class BinarySearch {
	int data;
	BinarySearch left, right;

	public BinarySearch(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BST {
	BinarySearch root;

	BinarySearch insert(BinarySearch root, int data) {
		if (root == null)
			return new BinarySearch(data);

		if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);
		return root;
	}

	boolean search(BinarySearch root, int key) {
		if (root == null)
			return false;

		if (root.data == key)
			return true;

		if (key < root.data)
			return search(root.left, key);

		return search(root.right, key);
	}

// Find Minimum
	BinarySearch min(BinarySearch root) {
		while (root.left != null)
			root = root.left;
		return root;
	}

//Find Maximum
	BinarySearch max(BinarySearch root) {
		while (root.right != null)
			root = root.right;
		return root;
	}

// Delete
	BinarySearch delete(BinarySearch root, int key) {
		if (root == null)
			return null;

		if (key < root.data)
			root.left = delete(root.left, key);
		else if (key > root.data)
			root.right = delete(root.right, key);
		else {
			// No child
			if (root.left == null && root.right == null)
				return null;

			// One child
			if (root.left == null)
				return root.right;

			if (root.right == null)
				return root.left;

			// Two children
			BinarySearch temp = min(root.right);
			root.data = temp.data;
			root.right = delete(root.right, temp.data);
		}
		return root;

	}

// Inorder
	void inorder(BinarySearch root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// Preorder
	void preorder(BinarySearch root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	// Postorder
	void postorder(BinarySearch root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	// Count Nodes
	int count(BinarySearch root) {
		if (root == null)
			return 0;

		return 1 + count(root.left) + count(root.right);
	}

	// Height
	int height(BinarySearch root) {
		if (root == null)
			return -1;

		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 70);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 60);
		tree.root = tree.insert(tree.root, 80);

		System.out.print("Inorder: ");
		tree.inorder(tree.root);

		System.out.print("\nPreorder: ");
		tree.preorder(tree.root);

		System.out.print("\nPostorder: ");
		tree.postorder(tree.root);

		System.out.println("\nSearch 40: " + tree.search(tree.root, 40));

		System.out.println("Minimum: " + tree.min(tree.root).data);
		System.out.println("Maximum: " + tree.max(tree.root).data);

		System.out.println("Total Nodes: " + tree.count(tree.root));
		System.out.println("Height: " + tree.height(tree.root));

		tree.root = tree.delete(tree.root, 30);

		System.out.print("After Delete (30): ");
		tree.inorder(tree.root);

	}
}