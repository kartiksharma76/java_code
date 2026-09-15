package binarytree;

import java.util.*;

public class MaximumWidth {

    private static class Cell {
        TreeNode node;
        long index;
        Cell(TreeNode node, long index) { this.node = node; this.index = index; }
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 0;
        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(root, 0));
        while (!queue.isEmpty()) {
            int size = queue.size();
            long first = queue.peek().index;
            long last = first;
            for (int i = 0; i < size; i++) {
                Cell cell = queue.poll();
                // Normalize index to avoid overflow on deep/wide trees.
                long index = cell.index - first;
                last = index;
                if (cell.node.left != null) queue.offer(new Cell(cell.node.left, 2 * index));
                if (cell.node.right != null) queue.offer(new Cell(cell.node.right, 2 * index + 1));
            }
            maxWidth = (int) Math.max(maxWidth, last - 0 + 1);
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Maximum Width", widthOfBinaryTree(root));
    }
}
