package TREESBINARYSEARCHTREES;

public class ValidateBST {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	public boolean isValidBST(TreeNode root) {
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean validate(TreeNode node, long min, long max) {
		if (node == null)
			return true;
		if (node.val <= min || node.val >= max)
			return false;
		return validate(node.left, min, node.val) && validate(node.right, node.val, max);
	}

	public static void main(String[] args) {
		ValidateBST sol = new ValidateBST();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		System.out.println(sol.isValidBST(root)); // true
	}
}
