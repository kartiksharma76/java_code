package bst;

// Largest BST in a Binary Tree - find size of the largest subtree that is a valid BST
public class LargestBSTInBinaryTree {
    private static class Info {
        boolean isBST; int size; int min, max;
        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST; this.size = size; this.min = min; this.max = max;
        }
    }
    private int maxSize = 0;

    public int largestBSTSubtree(TreeNode root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }
    private Info helper(TreeNode node) {
        if (node == null) return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        Info left = helper(node.left);
        Info right = helper(node.right);
        if (left.isBST && right.isBST && node.val > left.max && node.val < right.min) {
            int size = left.size + right.size + 1;
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, Math.min(node.val, left.min), Math.max(node.val, right.max));
        }
        return new Info(false, 0, 0, 0);
    }
}
