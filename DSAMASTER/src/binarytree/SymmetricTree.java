package binarytree;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode symmetric = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeUtil.print("Symmetric tree check", isSymmetric(symmetric));

        TreeNode asymmetric = TreeUtil.buildSampleTree();
        TreeUtil.print("Sample tree symmetric check", isSymmetric(asymmetric));
    }
}
