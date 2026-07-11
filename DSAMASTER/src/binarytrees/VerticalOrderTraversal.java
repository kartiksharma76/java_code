package binarytrees;

import java.util.*;

// Vertical Order Traversal of a Binary Tree (sorted by column, then row, then value)
public class VerticalOrderTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // column -> row -> list of values
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>(); // node, row, col
        q.add(new Object[]{root, 0, 0});
        while (!q.isEmpty()) {
            Object[] cur = q.poll();
            TreeNode node = (TreeNode) cur[0];
            int row = (int) cur[1], col = (int) cur[2];
            if (node == null) continue;
            map.computeIfAbsent(col, k -> new TreeMap<>())
               .computeIfAbsent(row, k -> new ArrayList<>())
               .add(node.val);
            q.add(new Object[]{node.left, row + 1, col - 1});
            q.add(new Object[]{node.right, row + 1, col + 1});
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int col : map.keySet()) {
            List<Integer> colList = new ArrayList<>();
            for (int row : map.get(col).keySet()) {
                List<Integer> vals = map.get(col).get(row);
                Collections.sort(vals);
                colList.addAll(vals);
            }
            res.add(colList);
        }
        return res;
    }
}
