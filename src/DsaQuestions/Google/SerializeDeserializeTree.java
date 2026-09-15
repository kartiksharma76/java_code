package DsaQuestions.Google;

import java.util.ArrayDeque;
import java.util.Queue;

public class SerializeDeserializeTree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Serialize
    public static String serialize(TreeNode root) {

        if (root == null) {
            return "null";
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node == null) {
                result.append("null ");
                continue;
            }

            result.append(node.val).append(" ");

            // ArrayDeque null allow nahi karta,
            // isliye null children ko directly handle karenge.
            if (node.left != null) {
                queue.offer(node.left);
            } else {
                result.append("null ");
            }

            if (node.right != null) {
                queue.offer(node.right);
            } else {
                result.append("null ");
            }
        }

        return result.toString();
    }

    // Deserialize
    public static TreeNode deserialize(String data) {

        String[] values = data.trim().split(" ");

        if (values[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int index = 1;

        while (!queue.isEmpty() && index < values.length) {

            TreeNode current = queue.poll();

            // Left child
            if (!values[index].equals("null")) {

                current.left = new TreeNode(Integer.parseInt(values[index]));

                queue.offer(current.left);
            }

            index++;

            // Right child
            if (index < values.length && !values[index].equals("null")) {

                current.right = new TreeNode(Integer.parseInt(values[index]));

                queue.offer(current.right);
            }

            index++;
        }

        return root;
    }

    public static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Serialize
        String data = serialize(root);

        System.out.println("Serialized:");
        System.out.println(data);

        // Deserialize
        TreeNode newRoot = deserialize(data);

        System.out.println("Inorder after Deserialize:");
        inorder(newRoot);
    }
}