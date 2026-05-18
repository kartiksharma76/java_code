package javaDsaPattern;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class BinaryTreeTraversal {
	public static void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
}
