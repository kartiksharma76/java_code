package binarytree;

import java.util.*;

public class VerticalOrderTraversal {

    private static class Cell {
        TreeNode node;
        int row;
        int col;
        Cell(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // column -> list of (row, value), later sorted by row then value
        TreeMap<Integer, List<int[]>> columnMap = new TreeMap<>();
        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(root, 0, 0));

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            columnMap.computeIfAbsent(cell.col, k -> new ArrayList<>())
                     .add(new int[]{cell.row, cell.node.val});
            if (cell.node.left != null) queue.offer(new Cell(cell.node.left, cell.row + 1, cell.col - 1));
            if (cell.node.right != null) queue.offer(new Cell(cell.node.right, cell.row + 1, cell.col + 1));
        }

        for (List<int[]> entries : columnMap.values()) {
            entries.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            List<Integer> column = new ArrayList<>();
            for (int[] entry : entries) column.add(entry[1]);
            result.add(column);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.printLevels("Vertical Order Traversal", verticalTraversal(root));
    }
}
