package binarytrees;

import java.util.*;

// Path Sum II - return all root-to-leaf paths that sum to target
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), res);
        return res;
    }
    private void dfs(TreeNode node, long remaining, List<Integer> path, List<List<Integer>> res) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null && remaining == node.val) {
            res.add(new ArrayList<>(path));
        } else {
            dfs(node.left, remaining - node.val, path, res);
            dfs(node.right, remaining - node.val, path, res);
        }
        path.remove(path.size() - 1);
    }
}
