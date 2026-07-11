package bst;

import java.util.*;

// Balance a Binary Search Tree
public class BalanceBST {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraverse(root, inorder);
        return build(inorder, 0, inorder.size() - 1);
    }
    private void inorderTraverse(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraverse(node.left, list);
        list.add(node.val);
        inorderTraverse(node.right, list);
    }
    private TreeNode build(List<Integer> list, int lo, int hi) {
        if (lo > hi) return null;
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = build(list, lo, mid - 1);
        root.right = build(list, mid + 1, hi);
        return root;
    }
}
