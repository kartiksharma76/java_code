package binarytrees;

import java.util.*;

// Diagonal Traversal of Binary Tree
public class DiagonalTraversal {
    public List<Integer> diagonalTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            while (node != null) {
                res.add(node.val);
                if (node.left != null) q.add(node.left);
                node = node.right;
            }
        }
        return res;
    }
}
