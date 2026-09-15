package bst;

// Construct BST from Preorder Traversal
public class ConstructBSTFromPreorder {
	private int idx = 0;

	public TreeNode bstFromPreorder(int[] preorder) {
		idx = 0;
		return build(preorder, Integer.MAX_VALUE);
	}

	private TreeNode build(int[] preorder, int bound) {
		if (idx == preorder.length || preorder[idx] > bound)
			return null;
		TreeNode root = new TreeNode(preorder[idx++]);
		root.left = build(preorder, root.val);
		root.right = build(preorder, bound);
		return root;
	}
}
