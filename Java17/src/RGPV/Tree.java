package RGPV;

public class Tree {
	private Node root;

	public void insert(int key) {
		root = inserthelper(root, key);
	}

	private Node inserthelper(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = inserthelper(root.left, key);

		} else if (key > root.key) {
			root.right = inserthelper(root.right, key);
		}
		return root;

	}

	
	public void inorder() {
		travereinorder(root);
	}

	private void travereinorder(Node root) {
		if (root == null) {
			return;
		}
		travereinorder(root.left);
		System.out.println(root.key + " ");
		travereinorder(root.right);

	}

	public void preorder() {
		traverepreorder(root);
	}

	private void traverepreorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key + " ");
		traverepreorder(root.left);
		traverepreorder(root.right);

	}

	public void postorder() {
		traverepostorder(root);
	}

	private void traverepostorder(Node root) {
		if (root == null) {
			return;
		}
		traverepostorder(root.left);
		traverepostorder(root.right);
		System.out.println(root.key + " ");
	}

	class Node {
		Node left;
		int key;
		Node right;

		public Node(int key) {
			super();
			this.key = key;
		}
	}

}
