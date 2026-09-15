package binarytree;

public class DiameterOfBinaryTree {

    private static int maxDiameter;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Diameter", diameterOfBinaryTree(root));
    }
}
