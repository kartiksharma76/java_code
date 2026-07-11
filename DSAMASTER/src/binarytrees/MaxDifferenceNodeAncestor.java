package binarytrees;

// Maximum Difference Between Node and Ancestor
public class MaxDifferenceNodeAncestor {
    private int maxDiff = 0;
    public int maxAncestorDiff(TreeNode root) {
        maxDiff = 0;
        dfs(root, root.val, root.val);
        return maxDiff;
    }
    private void dfs(TreeNode node, int curMin, int curMax) {
        if (node == null) return;
        maxDiff = Math.max(maxDiff, Math.max(Math.abs(node.val - curMin), Math.abs(node.val - curMax)));
        curMin = Math.min(curMin, node.val);
        curMax = Math.max(curMax, node.val);
        dfs(node.left, curMin, curMax);
        dfs(node.right, curMin, curMax);
    }
}
