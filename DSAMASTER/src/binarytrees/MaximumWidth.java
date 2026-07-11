package binarytrees;

import java.util.*;

// Maximum Width of Binary Tree (index numbering per level, width = last-first+1)
public class MaximumWidth {
    private static class Pair {
        TreeNode node; long idx;
        Pair(TreeNode n, long i) { node = n; idx = i; }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            int size = q.size();
            long first = q.peek().idx;
            long last = first;
            for (int i = 0; i < size; i++) {
                Pair cur = q.poll();
                long normalizedIdx = cur.idx - first; // avoid overflow
                last = cur.idx;
                if (cur.node.left != null) q.add(new Pair(cur.node.left, normalizedIdx * 2));
                if (cur.node.right != null) q.add(new Pair(cur.node.right, normalizedIdx * 2 + 1));
            }
            maxWidth = Math.max(maxWidth, (int) (last - first + 1));
        }
        return maxWidth;
    }
}
