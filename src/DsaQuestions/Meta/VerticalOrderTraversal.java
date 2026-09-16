package DsaQuestions.Meta;

import java.util.*;

public class VerticalOrderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    static  class Pair{
        TreeNode node;
        int column;

        Pair(TreeNode node, int column) {
            this.node = node;
            this.column = column;
        }
    }
    public static List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new ArrayDeque<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()){
            Pair current = queue.poll();
            TreeNode node = current.node;
            int column = current.column;

            map.putIfAbsent(column, new ArrayList<>());
            map.get(column).add(node.val);

            if (node.left != null) {
                queue.offer(new Pair(node.left, column - 1));
            }

            if (node.right != null) {
                queue.offer(new Pair(node.right, column + 1));
            }

        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = verticalOrder(root);
        System.out.println(result);
    }
}
