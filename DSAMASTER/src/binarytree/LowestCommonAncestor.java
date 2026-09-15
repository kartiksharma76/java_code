package binarytree;

public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root; // p and q found in different subtrees
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeNode p = root.left.left.left; // node 7
        TreeNode q = root.left.right;     // node 5
        TreeNode lca = lowestCommonAncestor(root, p, q);
        TreeUtil.print("LCA of 7 and 5", lca.val);
    }
}
