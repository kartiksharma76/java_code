package tree;

public class BinaryTree {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right = new Node(30);
		root.right.right = new Node(60);
		System.out.println("InOrder");// 40 20 70 50 80 10 30 60
		Node.traverseInordar(root);
		System.out.println("\nPreOrder");// 10 20 40 50 70 80 30 60
		Node.traversePreorder(root);
		System.out.println("\nPostOrder");// 40 70 80 50 20 60 30 10
		Node.traversePostorder(root);

	}

}
