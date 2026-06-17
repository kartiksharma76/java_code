package TREESBINARYSEARCHTREES;

public class MaxDepthBinaryTree {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static void main(String[] args) {
		MaxDepthBinaryTree sol = new MaxDepthBinaryTree();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(sol.maxDepth(root)); // 3
	}
}