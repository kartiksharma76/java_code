package bst;

import java.util.*;

// Merge Two Balanced Binary Search Trees
public class MergeTwoBSTs {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
        inorder(root1, l1);
        inorder(root2, l2);
        List<Integer> merged = mergeSortedLists(l1, l2);
        return build(merged, 0, merged.size() - 1);
    }
    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
    private List<Integer> mergeSortedLists(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) res.add(a.get(i++));
            else res.add(b.get(j++));
        }
        while (i < a.size()) res.add(a.get(i++));
        while (j < b.size()) res.add(b.get(j++));
        return res;
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
