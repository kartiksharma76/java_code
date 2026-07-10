package binarytree;

import java.util.*;

public class BurnBinaryTree {

    private static void buildParentMap(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                parentMap.put(node.left, node);
                queue.offer(node.left);
            }
            if (node.right != null) {
                parentMap.put(node.right, node);
                queue.offer(node.right);
            }
        }
    }

    private static TreeNode findNode(TreeNode root, int target) {
        if (root == null) return null;
        if (root.val == target) return root;
        TreeNode left = findNode(root.left, target);
        if (left != null) return left;
        return findNode(root.right, target);
    }

    public static int minTimeToBurn(TreeNode root, int startValue) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParentMap(root, parentMap);
        TreeNode start = findNode(root, startValue);

        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);

        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burnedSomethingNew = false;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                for (TreeNode neighbor : new TreeNode[]{node.left, node.right, parentMap.get(node)}) {
                    if (neighbor != null && !visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                        burnedSomethingNew = true;
                    }
                }
            }
            if (burnedSomethingNew) minutes++;
        }
        return minutes;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Minutes to burn entire tree starting at node 7", minTimeToBurn(root, 7));
    }
}
