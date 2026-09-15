package binarytrees;

// Binary Tree Maximum Path Sum
public class BinaryTreeMaxPathSum {
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));
        maxSum = Math.max(maxSum, node.val + left + right);
        return node.val + Math.max(left, right);
    }
}
