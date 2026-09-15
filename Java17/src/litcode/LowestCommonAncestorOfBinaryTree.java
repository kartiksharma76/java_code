package litcode;

class TreeNodes {
	int val;
	TreeNodes left;
	TreeNodes right;

	public TreeNodes(int val) {
		this.val = val;
	}
}

public class LowestCommonAncestorOfBinaryTree {
	public static TreeNodes lowestCommonAncestor(TreeNodes root, TreeNodes p, TreeNodes q) {
		if (root == null || root == p || root == q)
			return root;

		TreeNodes left = lowestCommonAncestor(root.left, p, q);
		TreeNodes right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null)
			return root;

		return (left != null) ? left : right;

	}

	public static void main(String[] args) {
		TreeNodes root = new TreeNodes(3);
		root.left = new TreeNodes(5);
		root.right = new TreeNodes(1);

		root.left.left = new TreeNodes(6);
		root.left.right = new TreeNodes(2);

		root.right.left = new TreeNodes(0);
		root.right.right = new TreeNodes(8);

		root.left.right.left = new TreeNodes(7);
		root.left.right.right = new TreeNodes(4);

		root.left.left = new TreeNodes(6);
		root.left.right = new TreeNodes(2);

		root.right.left = new TreeNodes(0);
		root.right.right = new TreeNodes(8);

		root.left.right.left = new TreeNodes(7);
		root.left.right.right = new TreeNodes(4);

		TreeNodes p = root.left; // 5
		TreeNodes q = root.right; // 1

		TreeNodes lca = lowestCommonAncestor(root, p, q);

		System.out.println("LCA: " + lca.val);
	}
}
