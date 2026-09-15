package binarytree;

public class MaximumDepth {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Maximum Depth", maxDepth(root));
    }
}
