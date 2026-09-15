package binarytrees;

import java.util.*;

// Boundary Traversal of Binary Tree: root+left boundary, leaves, right boundary(reverse)
public class BoundaryTraversal {
    public List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        if (!isLeaf(root)) res.add(root.val);
        addLeftBoundary(root.left, res);
        addLeaves(root, res);
        addRightBoundary(root.right, res);
        return res;
    }
    private boolean isLeaf(TreeNode n) { return n.left == null && n.right == null; }

    private void addLeftBoundary(TreeNode node, List<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) res.add(node.val);
            node = (node.left != null) ? node.left : node.right;
        }
    }
    private void addRightBoundary(TreeNode node, List<Integer> res) {
        List<Integer> temp = new ArrayList<>();
        while (node != null) {
            if (!isLeaf(node)) temp.add(node.val);
            node = (node.right != null) ? node.right : node.left;
        }
        Collections.reverse(temp);
        res.addAll(temp);
    }
    private void addLeaves(TreeNode node, List<Integer> res) {
        if (node == null) return;
        if (isLeaf(node)) { res.add(node.val); return; }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }
}
