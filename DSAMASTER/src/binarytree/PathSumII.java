package binarytree;

import java.util.*;

public class PathSumII {

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(TreeNode node, int remaining, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null && remaining == node.val) {
            result.add(new ArrayList<>(path));
        } else {
            backtrack(node.left, remaining - node.val, path, result);
            backtrack(node.right, remaining - node.val, path, result);
        }
        path.remove(path.size() - 1); // backtrack
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.printLevels("Paths summing to 14", pathSum(root, 14));
    }
}
