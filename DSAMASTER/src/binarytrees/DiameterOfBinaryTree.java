package binarytrees;

// Diameter of Binary Tree (longest path between any two nodes, in edges)
public class DiameterOfBinaryTree {
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }
    private int height(TreeNode node) {
        if (node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        diameter = Math.max(diameter, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
