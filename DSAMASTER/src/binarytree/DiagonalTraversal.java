package binarytree;

import java.util.*;

public class DiagonalTraversal {

    // All nodes connected by "right" pointers belong to the same diagonal.
    // Every time we move "left", we start a new diagonal.
    public static List<List<Integer>> diagonalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            // Each poll starts a brand new diagonal line.
            TreeNode node = queue.poll();
            List<Integer> diagonal = new ArrayList<>();
            while (node != null) {
                diagonal.add(node.val);
                if (node.left != null) queue.offer(node.left);
                node = node.right;
            }
            result.add(diagonal);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.printLevels("Diagonal Traversal", diagonalTraversal(root));
    }
}
