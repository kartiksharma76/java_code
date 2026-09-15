package binarytrees;

// Sum Root to Leaf Numbers
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode node, int cur) {
        if (node == null) return 0;
        cur = cur * 10 + node.val;
        if (node.left == null && node.right == null) return cur;
        return dfs(node.left, cur) + dfs(node.right, cur);
    }
}
