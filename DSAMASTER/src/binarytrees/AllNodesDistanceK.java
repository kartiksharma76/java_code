package binarytrees;

import java.util.*;

// All Nodes Distance K in Binary Tree
public class AllNodesDistanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        mapParents(root, null, parent);

        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.add(target);
        int dist = 0;
        while (!q.isEmpty()) {
            if (dist == k) break;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                for (TreeNode nbr : new TreeNode[]{node.left, node.right, parent.get(node)}) {
                    if (nbr != null && !visited.contains(nbr)) {
                        visited.add(nbr);
                        q.add(nbr);
                    }
                }
            }
            dist++;
        }
        List<Integer> res = new ArrayList<>();
        for (TreeNode n : q) res.add(n.val);
        return res;
    }
    private void mapParents(TreeNode node, TreeNode par, Map<TreeNode, TreeNode> parent) {
        if (node == null) return;
        parent.put(node, par);
        mapParents(node.left, node, parent);
        mapParents(node.right, node, parent);
    }
}
