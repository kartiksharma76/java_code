package DsaQuestions.Flipkart;

import java.util.ArrayList;
import java.util.List;

public class SerializeDeserializeBST {

    // Serialize BST using preorder
    public static String serialize(TreeNode root) {

        if (root == null) {
            return "";
        }

        List<Integer> values = new ArrayList<>();

        preorder(root, values);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.size(); i++) {

            if (i > 0) {
                result.append(",");
            }

            result.append(values.get(i));
        }

        return result.toString();
    }

    private static void preorder(
            TreeNode root,
            List<Integer> values) {

        if (root == null) {
            return;
        }

        values.add(root.val);

        preorder(root.left, values);
        preorder(root.right, values);
    }

    // Deserialize using BST bounds
    public static TreeNode deserialize(String data) {

        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] parts = data.split(",");

        int[] index = {0};

        return build(
                parts,
                index,
                Long.MIN_VALUE,
                Long.MAX_VALUE
        );
    }

    private static TreeNode build(
            String[] parts,
            int[] index,
            long min,
            long max) {

        if (index[0] >= parts.length) {
            return null;
        }

        int value =
                Integer.parseInt(parts[index[0]]);

        if (value < min || value > max) {
            return null;
        }

        index[0]++;

        TreeNode root =
                new TreeNode(value);

        root.left = build(
                parts,
                index,
                min,
                value - 1L
        );

        root.right = build(
                parts,
                index,
                value + 1L,
                max
        );

        return root;
    }

    public static void printPreorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(8);

        // Serialize
        String data = serialize(root);

        System.out.println(
                "Serialized: " + data
        );

        // Deserialize
        TreeNode newRoot =
                deserialize(data);

        System.out.print(
                "Deserialized Preorder: "
        );

        printPreorder(newRoot);

        System.out.println();
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}