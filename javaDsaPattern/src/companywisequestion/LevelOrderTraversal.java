package companywisequestion;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	int data;
	Node2 left, right;

	Node2(int data) {
		this.data = data;
	}
}

public class LevelOrderTraversal {

	public static void levelOrder(Node2 root) {

		if (root == null)
			return;

		Queue<Node2> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			Node2 current = queue.poll();

			System.out.print(current.data + " ");

			if (current.left != null)
				queue.offer(current.left);

			if (current.right != null)
				queue.offer(current.right);
		}
	}

	public static void main(String[] args) {

		Node2 root = new Node2(1);

		root.left = new Node2(2);
		root.right = new Node2(3);

		root.left.left = new Node2(4);
		root.left.right = new Node2(5);

		levelOrder(root);
	}
}