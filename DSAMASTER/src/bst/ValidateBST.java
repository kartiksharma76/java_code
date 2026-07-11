package bst;

// Validate Binary Search Tree
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long lower, long upper) {
        if (node == null) return true;
        if (node.val <= lower || node.val >= upper) return false;
        return validate(node.left, lower, node.val) && validate(node.right, node.val, upper);
    }
}
