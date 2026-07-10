package binarytree;

public class MaxDiffNodeAncestor {

    public static int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    private static int dfs(TreeNode node, int curMin, int curMax) {
        if (node == null) return curMax - curMin;
        curMin = Math.min(curMin, node.val);
        curMax = Math.max(curMax, node.val);
        int left = dfs(node.left, curMin, curMax);
        int right = dfs(node.right, curMin, curMax);
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Max Difference Between Node and Ancestor", maxAncestorDiff(root));
    }
}
