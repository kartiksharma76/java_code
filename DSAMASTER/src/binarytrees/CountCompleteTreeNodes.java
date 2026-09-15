package binarytrees;

// Count Complete Tree Nodes (O(log^2 n) using height comparison)
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int lh = leftHeight(root), rh = rightHeight(root);
        if (lh == rh) return (1 << lh) - 1; // perfect tree
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    private int leftHeight(TreeNode node) {
        int h = 0;
        while (node != null) { h++; node = node.left; }
        return h;
    }
    private int rightHeight(TreeNode node) {
        int h = 0;
        while (node != null) { h++; node = node.right; }
        return h;
    }
}
