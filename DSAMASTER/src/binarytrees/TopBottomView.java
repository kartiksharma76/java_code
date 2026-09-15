package binarytrees;

import java.util.*;

// Top / Bottom View of Binary Tree (vertical column based on horizontal distance)
public class TopBottomView {
    private static class Node {
        TreeNode node; int hd;
        Node(TreeNode n, int h) { node = n; hd = h; }
    }

    public List<Integer> topView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 0));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            map.putIfAbsent(cur.hd, cur.node.val);
            if (cur.node.left != null) q.add(new Node(cur.node.left, cur.hd - 1));
            if (cur.node.right != null) q.add(new Node(cur.node.right, cur.hd + 1));
        }
        res.addAll(map.values());
        return res;
    }

    public List<Integer> bottomView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 0));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            map.put(cur.hd, cur.node.val); // overwrite -> keeps last (bottom-most)
            if (cur.node.left != null) q.add(new Node(cur.node.left, cur.hd - 1));
            if (cur.node.right != null) q.add(new Node(cur.node.right, cur.hd + 1));
        }
        res.addAll(map.values());
        return res;
    }
}
