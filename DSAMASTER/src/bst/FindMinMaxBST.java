package bst;

// Find Minimum/Maximum in BST
public class FindMinMaxBST {
    public int findMin(TreeNode root) {
        while (root.left != null) root = root.left;
        return root.val;
    }
    public int findMax(TreeNode root) {
        while (root.right != null) root = root.right;
        return root.val;
    }
}
