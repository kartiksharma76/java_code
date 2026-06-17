package TREESBINARYSEARCHTREES;

public class BinaryTreeMaxPathSum {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	int maxSum = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		dfs(root);
		return maxSum;
	}

	private int dfs(TreeNode node) {
		if (node == null)
			return 0;
		int left = Math.max(dfs(node.left), 0);
		int right = Math.max(dfs(node.right), 0);
		maxSum = Math.max(maxSum, node.val + left + right);
		return node.val + Math.max(left, right);
	}

	public static void main(String[] args) {
		BinaryTreeMaxPathSum sol = new BinaryTreeMaxPathSum();
		TreeNode root = new TreeNode(-10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(sol.maxPathSum(root)); // 42

	}
}
