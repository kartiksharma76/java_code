package TREESBINARYSEARCHTREES;

public class BalancedBinaryTree {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	public boolean isBalanced(TreeNode root) {
		return height(root) != -1;
	}

	private int height(TreeNode node) {
		if (node == null)
			return 0;
		int left = height(node.left); 
		if (left == -1)
			return -1;
		int right = height(node.right);
		if (right == -1)
			return -1;
		if (Math.abs(left - right) > 1)
			return -1;
		return 1 + Math.max(left, right);
	}

	public static void main(String[] args) {
		BalancedBinaryTree sol = new BalancedBinaryTree();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(sol.isBalanced(root)); // true
	}
}