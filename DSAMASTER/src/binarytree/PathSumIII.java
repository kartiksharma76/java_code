package binarytree;

import java.util.*;

public class PathSumIII {

    public static int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0L, 1); // empty prefix
        return dfs(root, 0L, targetSum, prefixSumCount);
    }

    private static int dfs(TreeNode node, long currentSum, int targetSum, Map<Long, Integer> prefixSumCount) {
        if (node == null) return 0;
        currentSum += node.val;

        int count = prefixSumCount.getOrDefault(currentSum - targetSum, 0);

        prefixSumCount.merge(currentSum, 1, Integer::sum);
        count += dfs(node.left, currentSum, targetSum, prefixSumCount);
        count += dfs(node.right, currentSum, targetSum, prefixSumCount);
        prefixSumCount.merge(currentSum, -1, Integer::sum); // backtrack

        return count;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Number of paths summing to 8", pathSum(root, 8));
    }
}
