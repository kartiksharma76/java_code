package linkedlist;

public class FlattenBinaryTree {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	} 

	public void flatten(TreeNode root) {
		TreeNode cur = root;
		while (cur != null) {
			if (cur.left != null) {
				TreeNode rightmost = cur.left;
				while (rightmost.right != null)
					rightmost = rightmost.right;
				rightmost.right = cur.right;
				cur.right = cur.left;
				cur.left = null;
			}
			cur = cur.right;
		}
	}

	public static void main(String[] args) {
		FlattenBinaryTree sol = new FlattenBinaryTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		sol.flatten(root);
		TreeNode c = root;
		while (c != null) {
			System.out.print(c.val + " ");
			c = c.right;
		} // 1 2 3 4 5
	}
}
