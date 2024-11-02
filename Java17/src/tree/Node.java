package tree;

public class Node {

	public Node left;
	public int data;
	public Node right;

	public Node(int data) {
		this.data = data;

	}

	public static void traverseInordar(Node root) {
		if (root == null) {
			return;
		}
		traverseInordar(root.left);
		System.out.println(root.data + " ");
		traverseInordar(root.right);
	}

	public static void traversePreorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		traversePreorder(root.left);
		traversePreorder(root.right);

	}

	public static void traversePostorder(Node root) {
		if (root == null) {
			return;
		}
		traversePostorder(root.left);
		traversePostorder(root.right);
		System.out.println(root.data + " ");
	}
}
