package binarytree;

import java.util.*;

public class TopBottomView {

    private static class Pair {
        TreeNode node;
        int hd; // horizontal distance
        Pair(TreeNode node, int hd) { this.node = node; this.hd = hd; }
    }

    // Keep only the FIRST node seen at each horizontal distance
    public static List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            map.putIfAbsent(p.hd, p.node.val);
            if (p.node.left != null) queue.offer(new Pair(p.node.left, p.hd - 1));
            if (p.node.right != null) queue.offer(new Pair(p.node.right, p.hd + 1));
        }
        result.addAll(map.values());
        return result;
    }

    // Keep the LAST node seen at each horizontal distance (overwrite as we go)
    public static List<Integer> bottomView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            map.put(p.hd, p.node.val);
            if (p.node.left != null) queue.offer(new Pair(p.node.left, p.hd - 1));
            if (p.node.right != null) queue.offer(new Pair(p.node.right, p.hd + 1));
        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Top View", topView(root));
        TreeUtil.print("Bottom View", bottomView(root));
    }
}
