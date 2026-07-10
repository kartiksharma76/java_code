package binarytree;

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    // Returns height, or -1 if the subtree is already unbalanced
    private static int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Is Balanced", isBalanced(root));
    }
}
