package DsaImp;

import java.util.Stack;

public class MirrorTreesIterativeUsedStack {

	public static boolean areMirrorIterative(TreeNode1 root1, TreeNode1 root2) {
		// If both trees are empty, they are mirrors
		if (root1 == null && root2 == null) {
			return true;
		}

		// If one is empty and other is not, they are not mirrors
		if (root1 == null || root2 == null) {
			return false;
		}

		Stack<TreeNode1> stack1 = new Stack<>();
		Stack<TreeNode1> stack2 = new Stack<>();

		stack1.push(root1);
		stack2.push(root2);

		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			TreeNode1 node1 = stack1.pop();
			TreeNode1 node2 = stack2.pop();

			// Check if current nodes have same value
			if (node1.val != node2.val) {
				return false;
			}

			// Push children in mirror order
			// For tree1: push left then right
			if (node1.left != null) {
				stack1.push(node1.left);
			}
			if (node1.right != null) {
				stack1.push(node1.right);
			}

			// For tree2: push right then left (mirror order)
			if (node2.right != null) {
				stack2.push(node2.right);
			}
			if (node2.left != null) {
				stack2.push(node2.left);
			}

			// Check if stacks have same size after pushing
			if (stack1.size() != stack2.size()) {
				return false;
			}
		}

		// Both stacks should be empty
		return stack1.isEmpty() && stack2.isEmpty();
	}
}

// TreeNode class should be separate
class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 right;

	TreeNode1(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

// Test class
class TestMirrorTrees {
	public static void main(String[] args) {
		// Create first tree
		TreeNode1 root1 = new TreeNode1(1);
		root1.left = new TreeNode1(2);
		root1.right = new TreeNode1(3);
		root1.left.left = new TreeNode1(4);
		root1.left.right = new TreeNode1(5);

		// Create mirror tree
		TreeNode1 root2 = new TreeNode1(1);
		root2.left = new TreeNode1(3);
		root2.right = new TreeNode1(2);
		root2.right.left = new TreeNode1(5);
		root2.right.right = new TreeNode1(4);

		System.out.println("Are trees mirrors? " + MirrorTreesIterativeUsedStack.areMirrorIterative(root1, root2)); // true

		// Create non-mirror tree
		TreeNode1 root3 = new TreeNode1(1);
		root3.left = new TreeNode1(2);
		root3.right = new TreeNode1(3);
		root3.left.left = new TreeNode1(4);

		System.out.println("Are trees mirrors? " + MirrorTreesIterativeUsedStack.areMirrorIterative(root1, root3)); // false

		// Test with empty trees
		System.out.println("Are empty trees mirrors? " + MirrorTreesIterativeUsedStack.areMirrorIterative(null, null)); // true
	}
}