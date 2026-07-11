package binarytrees;

import java.util.*;

// Minimum time taken to burn the Binary Tree starting from target node value
public class MinTimeToBurnBT {
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        TreeNode targetNode = mapParentsAndFindTarget(root, parent, start);

        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(targetNode);
        visited.add(targetNode);
        int minutes = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean spreadThisMinute = false;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                for (TreeNode nbr : new TreeNode[]{node.left, node.right, parent.get(node)}) {
                    if (nbr != null && !visited.contains(nbr)) {
                        visited.add(nbr);
                        q.add(nbr);
                        spreadThisMinute = true;
                    }
                }
            }
            if (spreadThisMinute) minutes++;
        }
        return minutes;
    }

    private TreeNode mapParentsAndFindTarget(TreeNode root, Map<TreeNode, TreeNode> parent, int start) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode target = null;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.val == start) target = node;
            if (node.left != null) { parent.put(node.left, node); q.add(node.left); }
            if (node.right != null) { parent.put(node.right, node); q.add(node.right); }
        }
        return target;
    }
}
