package TREESBINARYSEARCHTREES;

public class KthSmallestBST {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	int count = 0, result = 0;

	public int kthSmallest(TreeNode root, int k) {
		inorder(root, k);
		return result;
	}

	private void inorder(TreeNode node, int k) {
		if (node == null)
			return;
		inorder(node.left, k);
		if (++count == k) {
			result = node.val;
			return;
		}
		inorder(node.right, k);
	}

	public static void main(String[] args) {
		KthSmallestBST sol = new KthSmallestBST();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		System.out.println(sol.kthSmallest(root, 1)); // 1
	}
}
