package DsaImp;

import java.util.LinkedList;
import java.util.Queue;

// Custom TreeNode class (you need to define this)
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class MirrorTreesLevelOrderUsedLinkedList {

	public static boolean areMirrorLevelOrder(TreeNode root1, TreeNode root2) {
		// Base case: both trees are empty
		if (root1 == null && root2 == null) {
			return true;
		}

		// One tree is empty, other is not
		if (root1 == null || root2 == null) {
			return false;
		}

		Queue<TreeNode> queue1 = new LinkedList<>();
		Queue<TreeNode> queue2 = new LinkedList<>();

		queue1.add(root1);
		queue2.add(root2);

		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			int size1 = queue1.size();
			int size2 = queue2.size();

			// Number of nodes at current level should be same
			if (size1 != size2) {
				return false;
			}

			for (int i = 0; i < size1; i++) {
				TreeNode node1 = queue1.poll();
				TreeNode node2 = queue2.poll();

				// Check if current nodes have same value
				if (node1.val != node2.val) {
					return false;
				}

				// Add children in mirror order
				// For first tree: left then right
				if (node1.left != null)
					queue1.add(node1.left);
				if (node1.right != null)
					queue1.add(node1.right);

				// For second tree: right then left (mirror order)
				if (node2.right != null)
					queue2.add(node2.right);
				if (node2.left != null)
					queue2.add(node2.left);
			}
		}

		// Both queues should be empty
		return queue1.isEmpty() && queue2.isEmpty();
	}

	// Test method
	public static void main(String[] args) {
		// Test Case 1: Mirror trees
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(3);
		root2.right = new TreeNode(2);
		root2.right.left = new TreeNode(5);
		root2.right.right = new TreeNode(4);

		System.out.println("Are trees mirrors? " + areMirrorLevelOrder(root1, root2)); // true

		// Test Case 2: Non-mirror trees
		TreeNode root3 = new TreeNode(1);
		root3.left = new TreeNode(2);
		root3.right = new TreeNode(3);
		root3.left.left = new TreeNode(4);

		System.out.println("Are trees mirrors? " + areMirrorLevelOrder(root1, root3)); // false

		// Test Case 3: Empty trees
		System.out.println("Are empty trees mirrors? " + areMirrorLevelOrder(null, null)); // true
	}
}